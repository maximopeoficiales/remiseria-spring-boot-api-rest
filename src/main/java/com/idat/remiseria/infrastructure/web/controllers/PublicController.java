package com.idat.remiseria.infrastructure.web.controllers;

import com.idat.remiseria.app.use_cases.UserService;
import com.idat.remiseria.domain.entitys.User;
import com.idat.remiseria.infrastructure.shared.Enviroments;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.MalformedURLException;
import java.util.List;

// @CrossOrigin(origins="*")
@RestController
@RequestMapping("/public")
public class PublicController {


    @Autowired
    private Enviroments env;

    @Autowired
    private UserService clientService;

    @GetMapping("/users/all")
    @ApiOperation("Get all Clients")
    @ApiResponse(code = 201, message = "OK")
    public ResponseEntity<List<User>> getClients() {
        return new ResponseEntity<>(clientService.getAll(), HttpStatus.OK);
    }


}
