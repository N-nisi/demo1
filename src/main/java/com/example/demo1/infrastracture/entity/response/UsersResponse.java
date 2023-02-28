package com.example.demo1.infrastracture.entity.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsersResponse {
    private Integer id;
    private String name;
    private String username;
    private String email;
    private Address address;
    private String phone;
    private String website;
    private Company company;


    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Address{
        private String street;
        private String suite;
        private String city;
        private String zipcode;
        private Geo geo;
        @Data
        @AllArgsConstructor
        @NoArgsConstructor
        public static class Geo{
            private String lat;
            private String lng;
        }
    }
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Company{
        private String name;
        private String catchPhrase;
        private String bs;
    }
}

