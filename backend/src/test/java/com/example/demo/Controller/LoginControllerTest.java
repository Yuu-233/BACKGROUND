package com.example.demo.Controller;


import com.example.demo.DemoApplicationTests;
import com.example.demo.controller.UserController;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import java.awt.*;


@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class LoginControllerTest extends DemoApplicationTests {
    @Test
    public void contextLoads(){}

    private MockMvc mockMvc;//屏蔽Http

    @Autowired
    private WebApplicationContext context;

    @Autowired
    private UserService userService;

    @Autowired
    private UserController userController;

    private ObjectMapper  om = new ObjectMapper();

    @Before
    public void setUp(){mockMvc = MockMvcBuilders.webAppContextSetup(context).build();}

    @Test
    public void getUserbyId()throws Exception{
        User user = new User(1,"testusername","testpassword","testemail",false,"testphone");
        when(userController.getUserbyId(1)).thenReturn(user);
        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/UserController/getUserbyId/1").accept(MediaType.APPLICATION_JSON)).
                andExpect(status().isOk()).andExpect(MockMvcResultMatchers.jsonPath("$.user_ID").value(1)).andReturn();
    }
}
