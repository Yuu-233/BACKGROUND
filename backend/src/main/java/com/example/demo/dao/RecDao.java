package com.example.demo.dao;

import com.example.demo.entity.Recruit_Info;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface RecDao {
    public List<Recruit_Info> get_jobs();
}
