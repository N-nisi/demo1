package com.example.demo1.domain;

import com.example.demo1.infrastracture.entity.response.UsersResponse;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


@Data
@Builder
@AllArgsConstructor (access = AccessLevel.PRIVATE)
public class User{
    private final Integer id;
    private final String name;
    private final String username;
    private final double lat;
    private final double lng;

    /**
     * ファクトリメソッド(入れ替える)
     */
    public static User from(UsersResponse response) {
        return User.builder()
                .id(response.getId())
                .name(response.getName())
                .username(response.getUsername())
                .lat(Double.parseDouble(response.getAddress().getGeo().getLat()))
                .lng(Double.parseDouble(response.getAddress().getGeo().getLng()))
                .build();
    }
}