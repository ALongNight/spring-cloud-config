package com.example.feign;

import com.example.feign.clients.UserClient;
import org.springframework.cloud.openfeign.FallbackFactory;

public class UserClientFallback implements FallbackFactory<UserClient> {


    public UserClient create(Throwable cause) {
        return null;
    }
}
