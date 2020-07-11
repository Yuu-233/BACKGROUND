package com.example.demo.dao;

import com.example.demo.entity.User;


public interface UserDao {
    User checkUser(String username, String password);
    User findUserByUsername (String username);
    void save (User user);
}
