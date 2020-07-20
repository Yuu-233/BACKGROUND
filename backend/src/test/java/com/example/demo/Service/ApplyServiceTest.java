package com.example.demo.Service;

import com.example.demo.DemoApplicationTests;
import com.example.demo.repository.ApplyRepository;
import com.example.demo.service.ApplyService;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.mongodb.core.aggregation.ArrayOperators;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplyServiceTest extends DemoApplicationTests {
    @Test
    public void contextLoads(){
    }
    @Autowired
    private ApplyService applyService;

    @Autowired
    private ApplyRepository applyRepository;

    @Test
    public void add_apply_info(){

    }
}
