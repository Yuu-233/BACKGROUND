package com.example.demo.dao;

import com.example.demo.entity.Recruit_Info;
import java.util.List;


public interface RecDao {
    public List<Recruit_Info> get_jobs();

    public List<Recruit_Info> filt_jobs(String salary,String cate,String location,String title,String experience,String education);
}
