package com.example.demo.serviceimpl;

import com.example.demo.dao.AppDao;
import com.example.demo.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppServiceImpl implements AppService {
    @Autowired
    AppDao appDao;
}
