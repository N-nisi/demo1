package com.example.demo1.presentation.controller;

import com.example.demo1.application.ApiService;
import com.example.demo1.domain.Todo;
import com.example.demo1.domain.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@AllArgsConstructor
public class IndexController {

    private final ApiService apiService;
    @RequestMapping("/")
    public String index(String[] args){
        return "index";
    }
    @GetMapping("/")
    public String index(Model model) {

        Todo response = apiService.getTodo();
        model.addAttribute("response",response);

        return "index";
    }


    @RequestMapping("/other")
    public String secondPage() {
        return "other";
    }
    @GetMapping("/other")
    public String other(Model model) {

        User response2 = apiService.getUser();
        model.addAttribute("response2",response2);

        return "other";
    }
}
