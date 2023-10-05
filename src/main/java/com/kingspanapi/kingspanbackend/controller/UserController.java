package com.kingspanapi.kingspanbackend.controller;

import com.kingspanapi.kingspanbackend.entity.User;
import com.kingspanapi.kingspanbackend.repository.UserRepository;
import com.kingspanapi.kingspanbackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/user")
    public User create(@RequestBody User user){
        return userService.createUser(user);
    }

    @GetMapping("/users")
    public List<User> getUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id) {
        User user = userService.getUserById(id);
        return ResponseEntity.ok(user);
    }

    @PutMapping("/user/{id}")
    public ResponseEntity<User> updateUserById(@PathVariable Long id, @RequestBody User updatedUser) {
        User updateUser = userService.updateUserById(id, updatedUser);
        return ResponseEntity.ok(updateUser);
    }

}
