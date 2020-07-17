package com.example.demo.Service;

import com.example.demo.DemoApplicationTests;
import com.example.demo.repository.RecRepository;
import com.example.demo.service.RecService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.aggregation.ArrayOperators;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RecServiceTest extends DemoApplicationTests {
    @Test
    public void contextLoads(){
    }

    @Autowired
    private RecService recService;

    //@MockBean
    private RecRepository recRepository;

    @Test
    public void get_jobs(){
        Integer job_count = 1215;
        assertEquals(job_count,recService.get_jobs().size());
    }

    @Test
    public void filt_jobs(){
        Integer filt_count = 200;
        assertEquals(filt_count,recService.filt_jobs(null,null,"北京",null,null,null).size());
    }

}
