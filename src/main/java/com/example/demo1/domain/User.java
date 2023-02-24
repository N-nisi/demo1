package com.example.demo1.domain;

import com.example.demo1.infrastracture.entity.response.UsersResponse;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.util.ObjectUtils;


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
     * @param response UserResponse
     * @return Userオブジェクト
     */
    public static User from(UsersResponse response) {
        if(ObjectUtils.isEmpty(response)){
            return empty();
        }
        return User.builder()
                .id(response.getId())
                .name(response.getName())
                .username(response.getUsername())
                .lat(Double.parseDouble(response.getAddress().getGeo().getLat()))
                .lng(Double.parseDouble(response.getAddress().getGeo().getLng()))
                .build();
    }

    /**
     * 空メソッド
     * @return Userオブジェクト
     */
    public static User empty(){
        return User.builder()
                .id(0)
                .name("")
                .username("")
                .lat(0)
                .lng(0)
                .build();
    }
}














