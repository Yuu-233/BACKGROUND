package com.example.demo.controller;
import com.example.demo.entity.Recruit_Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.service.RecService;

import java.util.List;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class RecController {

    @Autowired
    private RecService recService;

    @CrossOrigin
    @RequestMapping("/get_jobs")
    public List<Recruit_Info> get_jobs(){
        return recService.get_jobs();
    }

    @CrossOrigin
    @RequestMapping("/filt_jobs")
    public List<Recruit_Info> filt_jobs(@RequestParam(value="salary",required = false)String salary,
                                        @RequestParam(value="cate",required = false)String cate,
                                        @RequestParam(value="location",required = false)String location,
                                        @RequestParam(value="title",required = false)String title,
                                        @RequestParam(value="experience",required = false)String experience,
                                        @RequestParam(value="education",required = false)String education
                                       )
    {return recService.filt_jobs(salary,cate,location,title,experience,education);}
}
