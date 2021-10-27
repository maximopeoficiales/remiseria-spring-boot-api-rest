package com.idat.remiseria.infrastructure.web.controllers;

import com.idat.remiseria.app.use_cases.UserService;
import com.idat.remiseria.domain.dto.CreateUserDto;
import com.idat.remiseria.domain.entitys.User;
import com.idat.remiseria.domain.responses.AuthenticationRequest;
import com.idat.remiseria.domain.responses.AuthenticationResponse;
import com.idat.remiseria.infrastructure.web.security.JWTUtil;
import com.idat.remiseria.infrastructure.web.security.UserDetailsCustomService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
// @CrossOrigin(origins="*")
public class AuthController {
    // clase de spring security para saber si estas autenticado
    @Autowired
    private AuthenticationManager authenticationManager;

    // este servicio busca los usuarios registrados sea en memoria o en la bd
    @Autowired
    private UserDetailsCustomService userDetailsCustomService;

    // componente creado para generarnew AuthenticationResponse(jwt), un jwt
    @Autowired
    private JWTUtil jwtUtil;

    // Servicio de Clientes
    @Autowired
    private UserService userService;

    // usamos nuestra clases dto AuthenticationResponse AuthenticationRequest

    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> createToken(@RequestBody AuthenticationRequest request) {
        try {
            // se autentica con spring
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));
            // busco al usuario si esta registrado
            UserDetails userDetails = userDetailsCustomService.loadUserByUsername(request.getUsername());

            // genero un jwt
            String jwt = jwtUtil.generaToken(userDetails);

            // getUser for name
            User userFind = userService.findByUsername(jwtUtil.extractUsername(jwt)).map(Client -> {
                return Client;
            }).orElse(null);

            // retorno el jwt si todo sale correcto
            return new ResponseEntity<>(new AuthenticationResponse(jwt, userFind), HttpStatus.OK);

        } catch (BadCredentialsException e) {
            // si ocurre una exception de tipo badcredentials retorna un not found
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


    @PostMapping("/register")
    @ApiOperation("Register User")
    @ApiResponse(code = 200, message = "OK")
    public ResponseEntity<User> saveUser(@RequestBody CreateUserDto user) {
        User newUser = new User();
        newUser.setUsername(user.getUsername());
        newUser.setPassword(user.getPassword());
        newUser.setFirstName(user.getFirstName());
        newUser.setLastName(user.getLastName());
        newUser.setAddress(user.getAddress());
        newUser.setPhone(user.getPhone());
        newUser.setEmail(user.getEmail());
        newUser.setIdRol(user.getIdRol());

        return new ResponseEntity<>(userService.save(newUser), HttpStatus.OK);
    }
}
