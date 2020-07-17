package com.example.demo.Service;

import com.example.demo.DemoApplicationTests;
import com.example.demo.entity.Recruit_Info;
import com.example.demo.repository.RecRepository;
import com.example.demo.service.RecService;
import com.example.demo.service.UserService;
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
public class RecServiceTest extends DemoApplicationTests {
    @Test
    public void contextLoads(){
    }

    @Autowired
    private RecService recService;

    @MockBean
    private RecRepository recRepository;

    @Test
    public void get_jobs(){
        /*List<Recruit_Info> info = new LinkedList<>();
        info.add(new Recruit_Info(1,null,"3000-5000","上海",null,"test","test",null,null,null,"不限","不限"));
        info.add(new Recruit_Info(2,null,"3000-5000","北京",null,"test","test",null,null,null,"不限","不限"));
        when(recRepository.get_jobs()).thenReturn(info);
        assertEquals(info,recService.get_jobs());
        assertEquals(2,recService.get_jobs().size());
        */
        /*Integer job_count = 1215;
        assertEquals(job_count,recService.get_jobs().size());*/ //非mock
    }

    @Test
    public void filt_jobs(){
        List<Recruit_Info> info = new LinkedList<>();
        info.add(new Recruit_Info(1,null,"3000-5000","北京",null,"test","test",null,null,null,"不限","不限"));
        when(recService.filt_jobs(null,null,"北京",null,null,null)).thenReturn(info);
        assertEquals(info,recService.filt_jobs(null,null,"北京",null,null,null));
        assertEquals(1,recService.filt_jobs(null,null,"北京",null,null,null).size());

        /*Integer filt_count = 200;
        assertEquals(filt_count,recService.filt_jobs(null,null,"北京",null,null,null).size());*/ //非mock
    }

}
