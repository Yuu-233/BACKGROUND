package com.example.demo.Service;

import com.example.demo.DemoApplicationTests;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest extends DemoApplicationTests {

    @Test
    public void contextLoads(){
    }

    @Autowired
    private UserService userService;

    //@MockBean
    private UserRepository userRepository;

    @Test
    public void getUserById(){
        Integer userId=1234;
        User user = new User("testusername","testpassword","testemail",false,"testphone");
        when(userRepository.getUserbyId(userId)).thenReturn(user);
        assertEquals(user,userService.getUserbyId(userId)); //mock模式

        /*User user= new User(1, "Tiffani Anstice", "2152fyrx", "5897311806@564.com",  true,"07401238030");
        assertEquals(user,userService.getUserbyId(1));//非mock模式*/
    }

    @Test
    public void checkUser(){
        /*
        User user= new User(1, "Tiffani Anstice", "2152fyrx", "5897311806@564.com",  true,"07401238030");
        assertEquals(user,userService.checkUser("Tiffani Anstice","2152fyrx"));*/
    }

}
