package com.example.demo.daoimpl;

import com.example.demo.dao.AppDao;
import com.example.demo.repository.AppRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AppDaoImpl implements AppDao {
     @Autowired
     private AppRepository appRepository;
}
