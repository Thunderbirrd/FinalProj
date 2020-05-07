package com.example.base.controllers;

import com.example.base.models.User;
import com.example.base.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private PasswordEncoder passwordEncoder;

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

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public User register(@RequestBody String login, String password){
        login = login.substring(6, login.indexOf("&"));
        User user = new User();
        user.setLogin(login); user.setPassword(passwordEncoder.encode(password));
        return userService.saveUser(user);
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestBody String login, String password){
        login = login.substring(6, login.indexOf("&"));
        User user = userService.findUserByLogin(login);
        if(user == null){
            return "Wrong login";
        }
        else if(passwordEncoder.matches(password, user.getPassword())){
            return "Login successful";
        }else {
            return "Wrong password";
        }
    }
}
