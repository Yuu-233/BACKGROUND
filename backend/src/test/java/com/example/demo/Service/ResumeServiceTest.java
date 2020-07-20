package com.example.demo.Service;

import com.example.demo.DemoApplicationTests;
import com.example.demo.entity.Recruit_Info;
import com.example.demo.entity.Resume;
import com.example.demo.repository.ResumeRepository;
import com.example.demo.service.ResumeService;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.LinkedList;
import java.util.List;

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

    @MockBean
    private ResumeRepository resumeRepository;

    @Test
    public void get_applicants(){
       /* List<Resume> resumes = new LinkedList<>();
        resumes.add(new Resume(1,"test1",false,"1995-01-29","无","本科"));
        resumes.add(new Resume(2,"test2",true,"1967-10-18","3年","硕士"));
        when(resumeService.get_applicants()).thenReturn(resumes);

        assertEquals(resumes,resumeService.get_applicants());
        assertEquals(2,resumeService.get_applicants().size());*/
        /*Integer resume_count = 801;
        assertEquals(resume_count,resumeService.get_applicants().size());*/
    }

    @Test
    public void filt_applicants(){
        List<Resume> resumes = new LinkedList<>();
        resumes.add(new Resume(1,"test1",false,"1995-01-29","无","本科"));
        when(resumeService.filt_applicants(null,"本科")).thenReturn(resumes);
        assertEquals(resumes,resumeService.filt_applicants(null,"本科"));
        assertEquals(1,resumeService.filt_applicants(null,"本科").size());

        /*Integer filt_count = 13;
        assertEquals(filt_count,resumeService.filt_applicants("1年","高中").size());*/
    }
}
