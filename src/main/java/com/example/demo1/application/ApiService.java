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

    /**
     * Todoリストを取得するサービス
     *
     * @return Todoオブジェクト
     */

    public Todo getTodo(){
       return apiRepository.getTodo();
    }

    /**
     * Userリストを取得するサービス
     *
     * @return Userオブジェクト
     */
   public User getUser(){
       return User.from(apiRepository.getUser());
   }
}

