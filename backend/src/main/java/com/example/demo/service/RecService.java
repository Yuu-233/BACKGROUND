package com.example.demo.service;

import com.example.demo.entity.Recruit_Info;

import java.util.List;

public interface RecService {
    public List<Recruit_Info> get_jobs();
    public List<Recruit_Info> filt_jobs(String salary,String cate,String location,String title,String experience,String education);
    public void create_job(Integer userid,String salary,String location,String title,String cate,Integer quota,String desc,String exp,String edu);
    public List<Recruit_Info> getRecbyId(Integer userid);
}
