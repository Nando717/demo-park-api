package com.example.demoparkapi.web.controller;

import com.example.demoparkapi.entity.User;
import com.example.demoparkapi.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/users")
public class UserController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity<User> create(@RequestBody User users) {
        User user = userService.salvar(users);
        return ResponseEntity.status(HttpStatus.CREATED).body(user);

    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getById(@PathVariable Long id) {
        User user = userService.searchByID(id);
        return ResponseEntity.ok(user);
    }
}