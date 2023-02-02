package com.example.demo1.infrastracture;

import com.example.demo1.domain.Todo;
import com.example.demo1.infrastracture.entity.response.UsersResponse;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Repository
public class ApiRepository {
    public Todo getTodo(){
        String url = "https://jsonplaceholder.typicode.com/todos/1";

        //リクエストの送信
        RestTemplate restTemplate = new RestTemplate();

        //レスポンスボディを直接取得
        Todo response = restTemplate.getForObject(url, Todo.class);

        return response;
    }

    public UsersResponse getUser(){
        String url = "https://jsonplaceholder.typicode.com/users/1";

        //リクエストの送信
        RestTemplate restTemplate = new RestTemplate();

        //レスポンスボディを直接取得
        UsersResponse response2 = restTemplate.getForObject(url, UsersResponse.class);

        return response2;
    }
}
