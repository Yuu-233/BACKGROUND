package com.example.demo.service;

import com.example.demo.entity.User;
import org.springframework.stereotype.Service;


@Service
public interface UserService {
    User checkUser(String username, String password);
    Boolean register (String username, String password, String email, String address);
}
