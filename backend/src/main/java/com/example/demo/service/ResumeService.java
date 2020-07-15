package com.example.demo.service;

import com.example.demo.entity.Resume;
import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.List;

public interface ResumeService {

    public List<Resume>get_applicants();
    public void alter_resume(Integer user_id, String name, Boolean gender,String birth,String experience,String education);
}
