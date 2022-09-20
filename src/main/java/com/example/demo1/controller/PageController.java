package com.example.demo1.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

//import java.util.concurrent.atomic.AtomicReference;

@Controller
public class PageController {

    @RequestMapping("/")
    public String index(String[] args){
        return "index";
    }
    @GetMapping("/")
    public String index(Model model) {

        String url = "https://jsonplaceholder.typicode.com/todos/1";

        //リクエストの送信
        RestTemplate restTemplate = new RestTemplate();

        //レスポンスボディを直接取得
        String response = restTemplate.getForObject(url, String.class);

        model.addAttribute("response",response);

        return "index";
    }

    @RequestMapping("/other")
    public String secondPage() {
        return "other";
    }
    @GetMapping("/other")
    public String other(Model model) {

        String url = "https://jsonplaceholder.typicode.com/users/1";

        RestTemplate restTemplate = new RestTemplate();

        String response2 = restTemplate.getForObject(url, String.class);

        model.addAttribute("response2",response2);

        return "other";
    }
}
