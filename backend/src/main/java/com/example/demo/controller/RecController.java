package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.service.RecService;

@RestController
public class RecController {

    @Autowired
    private RecService recService;

}
