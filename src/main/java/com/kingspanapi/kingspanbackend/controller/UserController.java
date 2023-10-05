package com.kingspanapi.kingspanbackend.controller;

import com.kingspanapi.kingspanbackend.entity.User;
import com.kingspanapi.kingspanbackend.repository.UserRepository;
import com.kingspanapi.kingspanbackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
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

}
