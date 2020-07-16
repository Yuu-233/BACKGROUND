package com.example.demo.daoimpl;


import com.example.demo.dao.RecDao;
import com.example.demo.entity.Recruit_Info;
import com.example.demo.repository.RecRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RecDaoImpl implements RecDao {
    @Autowired
    private RecRepository recRepository;

    public List<Recruit_Info> get_jobs(){
        return recRepository.get_jobs();
    }

    public List<Recruit_Info> filt_jobs(String salary,String cate,String location,String title,String experience,String education){
        String[] splitSalary;
        String[] splitTags;//筛选tag备用
        String lowsalary=null;
        String highsalary=null;
        List<Recruit_Info> tmplist;//筛选tag备用
        if(salary!=null) {
            splitSalary = salary.split("-");
            lowsalary = splitSalary[0];
            highsalary = splitSalary[splitSalary.length - 1];
        }
        else{
            lowsalary="0";
            highsalary="1000000";
        }
           if(cate == null) cate="";
           if(location == null) location = "";
           if(title == null) title="";
           if(experience == null) experience="";
           if(education == null) education = "";

           System.out.println(lowsalary);
        System.out.println(highsalary);
        System.out.println(cate);
        System.out.println(title);
        System.out.println(experience);
        System.out.println(education);

        return recRepository.filt_jobs(lowsalary,highsalary,cate,location,title,experience,education);
    }
}
