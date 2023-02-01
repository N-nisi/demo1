package com.example.demo1.domain;

import com.example.demo1.infrastracture.entity.response.UsersResponse;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@Builder
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public class User{
    private Integer id;
    private String name;
    private String userName;
    private double lat;
    private double lng;

    /**
     * ファクトリメソッド(入れ替える)
     */
    public static User from(UsersResponse response) {

        return User.builder()
                .id(response.getId())
                .name(response.getName())
                .userName(response.getUserName())
                .lat(Double.parseDouble(response.getAddress().getGeo().getLat()))
                .lng(Double.parseDouble(response.getAddress().getGeo().getLng()))
                .build();

    }
}