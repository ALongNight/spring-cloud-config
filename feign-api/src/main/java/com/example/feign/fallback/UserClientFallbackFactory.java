package com.example.feign.fallback;

import com.example.feign.clients.UserClient;
import com.example.feign.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.FallbackFactory;

@Slf4j
public class UserClientFallbackFactory implements FallbackFactory<UserClient> {

    public UserClient create(final Throwable cause) {
        return new UserClient() {
            public User findById(Long id) {
                log.error("查询用户异常", cause);
                return new User();
            }
        };
    }
}
