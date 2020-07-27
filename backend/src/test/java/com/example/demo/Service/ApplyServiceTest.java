package com.example.demo.Service;

import com.example.demo.DemoApplicationTests;
import com.example.demo.entity.Apply_Info;
import com.example.demo.entity.Recruit_Info;
import com.example.demo.repository.ApplyRepository;
import com.example.demo.service.ApplyService;
import com.example.demo.utils.CompleteApplyInfo;
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
public class ApplyServiceTest extends DemoApplicationTests {
    @Test
    public void contextLoads(){
    }
    @Autowired
    private ApplyService applyService;

//    @Autowired
    @MockBean
    private ApplyRepository applyRepository;
// should be 5 tests
    @Test
    public void add_apply_info(){

        applyService.add_apply_info(100,96);
        verify(applyRepository, times(1)).add_apply_info(100,96);
    }
//    @Test
//    public void getAppbyId(){
//        List<Object> info = applyRepository.getAppbyId(100);
////        List<CompleteApplyInfo> info = new LinkedList<>();
////        info.add(new CompleteApplyInfo(100,"8000-10000","上海闵行", "一周5天","数学老师","数学老师", 0, 2, "上海交通大学需要数学老师", "5年", "博士", 500, 0));
////        when(applyService.getAppbyId(100)).thenReturn(info);
//        assertEquals(info,applyService.getAppbyId(100));
//        assertEquals(info.size(),applyService.getAppbyId(100).size());
//    }
//    @Test
//    public void getMyApplicants(){
//        List<Object> info = applyRepository.getMyApplicants(1);
//
//        assertEquals(info,applyService.getMyApplicants(1));
//        assertEquals(info.size(),applyService.getMyApplicants(1).size());
//    }
    @Test
    public void delete_apply_info(){
        applyService.delete_apply_info(99,96);
        verify(applyRepository, times(1)).delete_apply_info(99,96);
    }

    @Test
    public void update_apply_info(){
        applyService.update_apply_info(99,96,0);
        verify(applyRepository, times(1)).update_apply_info(99,96,0);
    }
}
