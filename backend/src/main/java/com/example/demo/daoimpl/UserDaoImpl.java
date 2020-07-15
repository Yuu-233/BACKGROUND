package com.example.demo.daoimpl;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    UserRepository userRepository;

    @Override
    public User checkUser(String username, String password){
        return userRepository.checkUser(username,password);
    }
    @Override
    public User findUserByUsername (String username) {return userRepository.findUserByUsername(username);}
    @Override
    public void save (User user) {userRepository.save(user);}

    @Override
    public User getUserbyId(Integer userid){
        return userRepository.getUserbyId(userid);
    }

    @Override
    public void alter_user_info(Integer userid,String username,String password,String phone,String email,Boolean role)
    {
       userRepository.alter_user_info(userid,username,password,phone,email,role);
    }
}
