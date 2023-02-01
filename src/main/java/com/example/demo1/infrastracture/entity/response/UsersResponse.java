package com.example.demo1.infrastracture.entity.response;

import java.util.List;
import javax.print.DocFlavor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsersResponse {
    private Integer id;
    private String name;
    private String userName;
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

