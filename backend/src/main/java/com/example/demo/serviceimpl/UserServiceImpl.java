package com.example.demo.serviceimpl;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User checkUser(String username, String password) {
        return userDao.checkUser(username, password);
    }
    @Override
    public Boolean register (String username, String password, String email, String phone){
        User user = userDao.findUserByUsername(username);
//        System.out.println(user.getUsername());
        if(user==null)
        {
            //        System.out.println("555555");
            user = new User(username, password, email, false, phone);//common user registration
            userDao.save(user);
            return true;
        }
//        System.out.println("444444444");
        return false;
    }

}
