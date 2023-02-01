package com.example.demo1.presentation.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api")
public class OtherController {
    @RequestMapping("/other")
    public String secondPage(){
        return "other";
    }
}


