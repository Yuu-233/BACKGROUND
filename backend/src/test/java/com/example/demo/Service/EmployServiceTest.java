package com.example.demo.Service;

import com.example.demo.DemoApplicationTests;
import com.example.demo.entity.Apply_Info;
import com.example.demo.entity.Recruit_Info;
import com.example.demo.repository.ApplyRepository;
import com.example.demo.repository.EmployRepository;
import com.example.demo.service.EmployService;
import com.example.demo.utils.CompleteResumeInfo;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployServiceTest extends DemoApplicationTests {
    @Test
    public void contextLoads(){
    }
    @Autowired
    private EmployService employService;

    //    @Autowired
    @MockBean
    private EmployRepository employRepository;
    // should be 5 tests
    @Test
    public void add_employ_info(){

        employService.add_employ_info(100,96);
        verify(employRepository, times(1)).add_employ_info(100,96);
    }
        @Test
    public void getEmpbyId(){
        List<Object> info = employRepository.getEmpbyId(100);
//        List<CompleteEmployInfo> info = new LinkedList<>();
//        info.add(new CompleteEmployInfo(100,"8000-10000","上海闵行", "一周5天","数学老师","数学老师", 0, 2, "上海交通大学需要数学老师", "5年", "博士", 500, 0));
//        when(employService.getEmpbyId(100)).thenReturn(info);
        assertEquals(info,employService.getEmpbyId(100));
        assertEquals(info.size(),employService.getEmpbyId(100).size());
    }
    @Test
    public void getMyEmployees(){
        List<Object> info = employRepository.getMyEmployees(1);

        assertEquals(info,employService.getMyEmployees(1));
        assertEquals(info.size(),employService.getMyEmployees(1).size());
    }
    @Test
    public void delete_employ_info(){
        employService.delete_employ_info(99,96);
        verify(employRepository, times(1)).delete_employ_info(99,96);
    }

    @Test
    public void update_employ_info(){
        employService.update_employ_info(99,96,0);
        verify(employRepository, times(1)).update_employ_info(99,96,0);
    }
}
