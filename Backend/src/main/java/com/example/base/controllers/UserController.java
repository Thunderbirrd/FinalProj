package com.example.base.controllers;

import com.example.base.models.User;
import com.example.base.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @RequestMapping("/")
    public String home(){
        return "Hello World!";
    }

    @Autowired
    private UserService userService;

    @GetMapping("/getUser/{id}")
    public User getUser(@PathVariable Integer id){
        return userService.getUser(id);
    }
}
