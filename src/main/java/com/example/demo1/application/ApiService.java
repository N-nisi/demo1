package com.example.demo1.application;

import com.example.demo1.domain.Todo;
import com.example.demo1.domain.User;
import com.example.demo1.infrastracture.ApiRepository;
import com.example.demo1.infrastracture.entity.response.UsersResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ApiService {
    private final ApiRepository apiRepository;

    public Todo getTodo(){
       Todo response = apiRepository.getTodo();
       return response;
    }

   public User getUser(){
       UsersResponse response2 = apiRepository.getUser();
       return User.from(response2);
   }
}

