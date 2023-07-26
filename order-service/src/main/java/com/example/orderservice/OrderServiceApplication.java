package com.example.orderservice;

import com.example.feign.clients.UserClient;
import com.example.feign.config.DefaultFeignConfiguration;
import com.example.orderservice.config.RandomLoadBalancerClientConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClients;
import org.springframework.cloud.openfeign.EnableFeignClients;

//@LoadBalancerClients(defaultConfiguration = RandomLoadBalancerClientConfiguration.class)
@EnableFeignClients(clients = UserClient.class, defaultConfiguration = DefaultFeignConfiguration.class)
@EnableDiscoveryClient
@MapperScan("com.example.orderservice.mapper")
@SpringBootApplication
public class OrderServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderServiceApplication.class, args);
    }

}
