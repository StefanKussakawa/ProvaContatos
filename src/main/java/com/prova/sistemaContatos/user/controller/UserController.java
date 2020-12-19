package com.prova.sistemaContatos.user.controller;

import com.prova.sistemaContatos.user.User;
import com.prova.sistemaContatos.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {
        user = userRepository.save(user);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable(value = "id")Long id) {
        return userRepository.findByIdUser(id);
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

}
