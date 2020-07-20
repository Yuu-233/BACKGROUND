package com.example.demo.serviceimpl;
import com.example.demo.dao.RecDao;
import com.example.demo.entity.Recruit_Info;
import com.example.demo.service.RecService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecServiceImpl implements RecService{

    @Autowired
    RecDao recDao;


    public List<Recruit_Info>get_jobs(){
        return recDao.get_jobs();
    }

    public List<Recruit_Info>filt_jobs(String salary,String cate,String location,String title,String experience,String education){
        return recDao.filt_jobs(salary,cate,location,title,experience,education);
    }

    public void create_job(Integer userid,String salary,String location,String title,String cate,Integer quota,String desc,String exp,String edu){
        recDao.create_job(userid,salary,location,title,cate,quota,desc,exp,edu);
    }

    public List<Recruit_Info> getRecbyId(Integer userid){
        return recDao.getRecbyId(userid);
    }
}
