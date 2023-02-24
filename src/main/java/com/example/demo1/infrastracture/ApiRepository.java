package com.example.demo1.infrastracture;

import com.example.demo1.domain.Todo;
import com.example.demo1.infrastracture.entity.response.UsersResponse;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Repository
public class ApiRepository {
    private static final String TODO_URL = "https://jsonplaceholder.typicode.com/todos/1";
    private static final String USER_URL = "https://jsonplaceholder.typicode.com/users/1";

    /**
     * TodoAPI(GET)
     * I/F仕様書:https://jsonplaceholder.typicode.com/guide/
     *
     * @return Todo
     */
    public Todo getTodo(){
        //リクエストの送信
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(TODO_URL, Todo.class);
    }

    /**
     * UserAPI(GET)
     * I/F仕様書:https://jsonplaceholder.typicode.com/guide/
     *
     * @return User
     */
    public UsersResponse getUser(){
        //リクエストの送信
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(USER_URL, UsersResponse.class);
    }
}
