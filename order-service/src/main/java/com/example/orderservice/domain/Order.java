package com.example.orderservice.domain;

import com.example.feign.domain.User;
import lombok.Data;

@Data
public class Order {

    private Long id;
    private Long userId;
    private String name;
    private Long price;
    private Integer num;
    private User user;
}
