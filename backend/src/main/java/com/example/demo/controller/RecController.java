package com.example.demo.controller;
import com.example.demo.entity.Recruit_Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.service.RecService;

import java.util.List;
//@CrossOrigin(origins = "http://localhost:3000")
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

    @CrossOrigin
    @RequestMapping("/create_job")
    public void publish_job(@RequestParam("userid")Integer userid,@RequestParam("salary")String salary,@RequestParam("location")String location,@RequestParam("title")String title,
                            @RequestParam("cate")String cate,@RequestParam("quota")Integer quota,@RequestParam("desc")String desc,@RequestParam("exp")String exp,@RequestParam("edu")String edu){
        recService.create_job(userid,salary,location,title,cate,quota,desc,exp,edu);
    }

    @CrossOrigin
    @RequestMapping("/getRecbyId")
    public List<Recruit_Info> getRecbyId(@RequestParam("userid")Integer userid){
        return recService.getRecbyId(userid);
    }
}


