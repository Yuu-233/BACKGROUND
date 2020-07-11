package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import com.example.demo.utils.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LoginController {
    @Autowired
    private UserService userService;

    @RequestMapping(value="/login")
    public Message login(@RequestParam("username") String username,
                         @RequestParam("password") String password){
        User user = userService.checkUser(username, password);
        if(user == null){
            return new Message(0,"error username or password",null);
        }else{
            if(user.getRole()){//admin
                return new Message(2,"successful login admin!",user);
            }
           //common user
            return new Message(1,"successful login user!",user);
        }
    }
    @RequestMapping(value = "/register")
    public Message register(@RequestParam("username") String username, @RequestParam("password") String password, @RequestParam("email") String email, @RequestParam("address") String phone) {
        if (userService.register(username, password, email, phone))
        {   return new Message(1, "successful register!", null);}

        return new Message(0, "fail register!", null);
    }
}

