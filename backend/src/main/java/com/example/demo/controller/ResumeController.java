package com.example.demo.controller;

import com.example.demo.entity.Resume;
import com.example.demo.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ResumeController {

    @Autowired
    private ResumeService resumeService;

    @CrossOrigin
    @RequestMapping("/get_applicants")
    private List<Resume> get_applicants(){
        return resumeService.get_applicants();
    }

}
