package com.example.demo.serviceimpl;

import com.example.demo.dao.ResumeDao;
import com.example.demo.entity.Resume;
import com.example.demo.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResumeServiceImpl implements ResumeService {
    @Autowired
    ResumeDao resumeDao;

    public List<Resume> get_applicants(){
        return resumeDao.get_applicants();
    }

}
