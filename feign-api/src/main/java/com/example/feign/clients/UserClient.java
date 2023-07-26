package com.example.feign.clients;

import com.example.feign.domain.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(value = "userservice", path = "/user")
public interface UserClient {

    @GetMapping("/{id}")
    User findById(@PathVariable("id")Long id);
}
