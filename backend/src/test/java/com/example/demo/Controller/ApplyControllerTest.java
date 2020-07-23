package com.example.demo.Controller;

import com.example.demo.DemoApplicationTests;

import com.example.demo.controller.UserController;
import com.example.demo.service.ApplyService;
import com.example.demo.service.UserService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;



@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ApplyControllerTest extends DemoApplicationTests {
    @Test
    public void contextLoads(){}

    private MockMvc mockMvc;//模拟网络请求
@MockBean
    private ApplyService applyService;
    @Autowired
    private WebApplicationContext context;

    private ObjectMapper om = new ObjectMapper();
    @Before
    public void setUp() {
        mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void add_apply_info() throws Exception{
        MvcResult result1 = mockMvc.perform(get("/add_apply_info?user_id=100&rec_id=49")
                .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andExpect(status().isOk())
                .andReturn();
        verify(applyService, times(1)).add_apply_info(100,49);
    }
    @Test
    public void delete_apply_info() throws Exception{
        MvcResult result2 = mockMvc.perform(get("/delete_apply_info?user_id=99&rec_id=257")
                .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andExpect(status().isOk())
                .andReturn();
        verify(applyService, times(1)).delete_apply_info(99,257);
    }
@Test
public void update_apply_info() throws Exception{
    MvcResult result3 = mockMvc.perform(get("/update_apply_info?user_id=99&rec_id=223&accepted=1")
            .contentType(MediaType.APPLICATION_JSON_VALUE))
            .andExpect(status().isOk())
            .andReturn();
    verify(applyService, times(1)).update_apply_info(99,223,1);
}
}
