package com.example.demo.controller;

import com.example.demo.service.ApplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
//@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class ApplyController {

    @Autowired
    private ApplyService applyService;

    @CrossOrigin
    @RequestMapping("/add_apply_info")
    public void add_apply_info(@RequestParam("user_id")Integer user_id,@RequestParam("rec_id")Integer rec_id){
        applyService.add_apply_info(user_id,rec_id);
    }

    @CrossOrigin
    @RequestMapping("/delete_apply_info")
    public void delete_apply_info(@RequestParam("user_id")Integer user_id,@RequestParam("rec_id")Integer rec_id){
        applyService.delete_apply_info(user_id,rec_id);
    }
    @CrossOrigin
    @RequestMapping("/update_apply_info")
    public void update_apply_info(@RequestParam("user_id")Integer user_id,@RequestParam("rec_id")Integer rec_id, @RequestParam("accepted")Integer accepted){
        applyService.update_apply_info(user_id,rec_id,accepted);
    }

}
