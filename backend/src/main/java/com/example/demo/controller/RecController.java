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
    public void create_job(@RequestParam("userid")Integer userid,@RequestParam("salary")String salary,@RequestParam("location")String location,@RequestParam("schedule")String schedule,@RequestParam("title")String title,
                            @RequestParam("cate")String cate,@RequestParam("quota")Integer quota,@RequestParam("desc")String desc,@RequestParam("exp")String exp,@RequestParam("edu")String edu){
        recService.create_job(userid,salary,location,schedule,title,cate,quota,desc,exp,edu);
    }

    @CrossOrigin
    @RequestMapping("/getRecbyId")
    public List<Recruit_Info> getRecbyId(@RequestParam("userid")Integer userid){
        return recService.getRecbyId(userid);
    }

    //Admin function
    @CrossOrigin
    @RequestMapping("/delete_rec")
    public void delete_rec(@RequestParam(value="rec_id") int rec_id)
    { recService.delete_rec(rec_id);}

    @CrossOrigin
    @RequestMapping("/update_rec")
    public void update_rec(@RequestParam(value="recruit_info") int rec_ID,
                           @RequestParam(value="recruit_info") Integer user_ID,
                           @RequestParam(value="recruit_info") String rec_Salary,
                           @RequestParam(value="recruit_info") String rec_Location,
                           @RequestParam(value="recruit_info") String rec_TimeSchedule,
                           @RequestParam(value="recruit_info") String rec_Title,
                           @RequestParam(value="recruit_info") String rec_Cate,
                           @RequestParam(value="recruit_info") Integer rec_Enrolled,
                           @RequestParam(value="recruit_info") Integer rec_Quota,
                           @RequestParam(value="recruit_info") String rec_Desc,
                           @RequestParam(value="recruit_info") String rec_Experience,
                           @RequestParam(value="recruit_info") String rec_Education)
    { recService.update_rec(rec_ID, user_ID,rec_Salary,rec_Location,rec_TimeSchedule,rec_Title,rec_Cate,rec_Enrolled,rec_Quota,rec_Desc, rec_Experience,rec_Education);}

}


