package com.example.demoparkapi.web.controller;

import com.example.demoparkapi.entity.Users;
import com.example.demoparkapi.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/users")
public class UserController {

    private final UserService userService;

@PostMapping
    public ResponseEntity<Users> create(@RequestBody Users users){
        Users user = userService.salvar(users);
        return  ResponseEntity.status(HttpStatus.CREATED).body(user);

    }
}
