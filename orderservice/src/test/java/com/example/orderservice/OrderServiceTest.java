package com.example.orderservice;

import com.example.feign.domain.User;
import com.example.orderservice.service.OrderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
public class OrderServiceTest {

    @Autowired
    private OrderService orderService;

    @Test
    public void findById(){
        System.out.println(orderService.findById(103L));
    }


    @Test
    public void contains(){
        System.out.println("RandomLoadBalancer".contains("LoadBalancer"));
    }

}
