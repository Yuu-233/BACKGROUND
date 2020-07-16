package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @CrossOrigin
    @RequestMapping("/getUserbyId")
    public User getUserbyId(@RequestParam("userid") Integer userid){
        return userService.getUserbyId(userid);
    }

    @CrossOrigin
    @RequestMapping("/alter_user_info")
    public void alter_user_info(@RequestParam("userid") Integer userid,@RequestParam("username")String username,@RequestParam("password") String password,@RequestParam("phone") String phone,@RequestParam("email") String email,@RequestParam("role") Boolean role){
        userService.alter_user_info(userid,username,password,phone,email,role);
    }

}
