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
}
