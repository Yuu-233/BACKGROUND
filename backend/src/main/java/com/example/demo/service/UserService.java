package com.example.demo.service;

import com.example.demo.entity.User;
import org.springframework.stereotype.Service;


@Service
public interface UserService {
    public User checkUser(String username, String password);
    public Boolean register (String username, String password, String email, String address);
    public User getUserbyId(Integer userid);
    public void alter_user_info(Integer userid,String username,String password,String phone,String email,Boolean role);
}
