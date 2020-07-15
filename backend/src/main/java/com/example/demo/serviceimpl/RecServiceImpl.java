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
}
