package com.example.demo.controller;

import com.example.demo.service.ApplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplyController {

    @Autowired
    private ApplyService applyService;

    @CrossOrigin
    @RequestMapping("/add_apply_info")
    public void add_apply_info(@RequestParam("user_id")Integer user_id,@RequestParam("rec_id")Integer rec_id){
        applyService.add_apply_info(user_id,rec_id);
    }


}
