package com.idat.remiseria.infrastructure.web.controllers;

import com.idat.remiseria.app.use_cases.UserService;
import com.idat.remiseria.domain.entitys.User;
import com.idat.remiseria.infrastructure.web.controllers.interfaces.ICrudController;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController implements ICrudController<User> {
    @Autowired
    private UserService userService;

    @GetMapping("/all")
    @ApiOperation("Get all users")
    @ApiResponse(code = 200, message = "OK")
    public ResponseEntity<List<User>> getAll() {
        return new ResponseEntity<>(userService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    @ApiOperation("Search a user with a ID")
    @ApiResponses({@ApiResponse(code = 200, message = "OK"), @ApiResponse(code = 404, message = "User not found")})
    public ResponseEntity<User> getById(
            @ApiParam(value = "The id of the user", required = true, example = "5")
            @PathVariable("id") int idCategory) {
        return userService.findById(idCategory).map(p -> new ResponseEntity<>(p, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    @ApiOperation("Save a User")
    @ApiResponse(code = 201, message = "OK")
    public ResponseEntity<User> save(@RequestBody User user) {
        return new ResponseEntity<>(userService.save(user), HttpStatus.CREATED);
    }

    @PutMapping
    @ApiOperation("Update a User")
    @ApiResponse(code = 201, message = "OK")
    public ResponseEntity<User> update(@RequestBody User user) {

        User findUser = userService.findById(user.getIdUser()).map(user1 -> {
            return user1;
        }).orElse(null);
//        findUser.setPassword(user.getDescription());
        findUser.setAddress(user.getAddress());
        findUser.setFirstName(user.getFirstName());
        findUser.setLastName(user.getLastName());
        return new ResponseEntity<>(userService.save(findUser), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    @ApiOperation("Delete a User by ID")
    @ApiResponse(code = 201, message = "OK")
    public ResponseEntity<?> delete(
            @ApiParam(value = "The id of the user", required = true, example = "1")
            @PathVariable("id") int idUser) {
        return (userService.delete(idUser)) ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
