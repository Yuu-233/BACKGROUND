package com.example.demo.daoimpl;

import com.example.demo.dao.ResumeDao;
import com.example.demo.entity.Resume;
import com.example.demo.repository.ResumeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ResumeDaolmpl implements ResumeDao {
     @Autowired
     private ResumeRepository resumeRepository;

     @Override
     public List<Resume>get_applicants(){
          return resumeRepository.get_applicants();
     }
}
