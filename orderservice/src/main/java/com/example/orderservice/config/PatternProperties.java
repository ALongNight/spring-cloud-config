package com.example.orderservice.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties(prefix = "pattern")
public class PatternProperties {

    private String dateFormat = "yyy-MM-dd HH:mm:ss";
}
