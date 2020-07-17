package com.example.demo.Service;

import com.example.demo.DemoApplicationTests;
import com.example.demo.repository.ResumeRepository;
import com.example.demo.service.ResumeService;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ResumeServiceTest extends DemoApplicationTests {

    @Test
    public void contextLoads(){
    }

    @Autowired
    private ResumeService resumeService;

    //@MockBean
    private ResumeRepository resumeRepository;

    @Test
    public void get_applicants(){
        Integer resume_count = 801;
        assertEquals(resume_count,resumeService.get_applicants().size());
    }

    @Test
    public void filt_applicants(){
        Integer filt_count = 13;
        assertEquals(filt_count,resumeService.filt_applicants("1年","高中").size());
    }
}
