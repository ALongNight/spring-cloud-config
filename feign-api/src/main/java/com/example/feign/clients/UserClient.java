package com.example.feign.clients;

import com.example.feign.fallback.UserClientFallbackFactory;
import com.example.feign.domain.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(value = "userservice", path = "/user", fallbackFactory = UserClientFallbackFactory.class)
public interface UserClient {

    @GetMapping("/{id}")
    User findById(@PathVariable("id")Long id);
}
