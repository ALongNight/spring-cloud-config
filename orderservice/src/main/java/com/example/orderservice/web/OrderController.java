package com.example.orderservice.web;

import com.example.orderservice.config.PatternProperties;
import com.example.orderservice.domain.Order;
import com.example.orderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.loadbalancer.core.ReactorLoadBalancer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.support.WebApplicationObjectSupport;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RequestMapping("/order")
@RestController
@EnableConfigurationProperties(PatternProperties.class)
public class OrderController extends WebApplicationObjectSupport {

    @Autowired
    private OrderService orderService;

    @Autowired
    private PatternProperties properties;

    @GetMapping("/{id}")
    public Order findById(@PathVariable("id")Long id){
        return orderService.findById(id);
    }

    @GetMapping("/now")
    public String now(){
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern(properties.getDateFormat()));
    }

    @GetMapping("/properties")
    public PatternProperties properties(){
        return properties;
    }


}
