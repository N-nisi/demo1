package com.example.demo1.presentation.controller;

import com.example.demo1.application.ApiService;
import com.example.demo1.domain.Todo;
import com.example.demo1.domain.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *初期画面
 *
 * @param model 画面モデル
 * @return html
 */

@Controller
@AllArgsConstructor
public class IndexController {

    private final ApiService apiService;
    @GetMapping("/")
    public String index(Model model) {

        Todo response = apiService.getTodo();
        model.addAttribute("response",response);

        return "index";
    }

    /**
     *Other画面
     *
     * @param model 画面モデル
     * @return html
     */


    @GetMapping("/other")
    public String other(Model model) {

        User response2 = apiService.getUser();
        model.addAttribute("response2",response2);

        return "other";
    }
}
