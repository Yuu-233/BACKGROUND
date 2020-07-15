package com.example.demo.daoimpl;


import com.example.demo.dao.RecDao;
import com.example.demo.repository.RecRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RecDaoImpl implements RecDao {
    @Autowired
    private RecRepository recRepository;
}
