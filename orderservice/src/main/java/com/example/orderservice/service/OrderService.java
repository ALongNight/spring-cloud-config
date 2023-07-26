package com.example.orderservice.service;

import com.example.feign.clients.UserClient;
import com.example.feign.domain.User;
import com.example.orderservice.domain.Order;
import com.example.orderservice.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private UserClient userClient;

    public Order findById(Long id){
        Order order = orderMapper.selectById(id);
        User user = userClient.findById(order.getUserId());
        order.setUser(user);
        return order;
    }


//    @Autowired
//    private RestTemplate restTemplate;

//    public Order findById(Long id){
//        Order order = orderMapper.selectById(id);
//        String url = "http://userservice/user/id/" + order.getUserId();
//        User user = restTemplate.getForObject(url, User.class);
//        order.setUser(user);
//        return order;
//    }
}
