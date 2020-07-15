package com.example.demo.controller;
import com.example.demo.entity.Recruit_Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.service.RecService;

import java.util.List;

@RestController
public class RecController {

    @Autowired
    private RecService recService;

    @CrossOrigin
    @RequestMapping("/get_jobs")
    public List<Recruit_Info> get_jobs(){
        return recService.get_jobs();
    }
}
