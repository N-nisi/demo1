package com.example.demo1.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Todo {
    private Integer userId;
    private Integer id;
    private String title;
    private Boolean completed;
}

