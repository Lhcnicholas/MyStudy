package com.example.demo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author lhc
 */
@Data
@Component
@ConfigurationProperties(prefix = "user")
public class User {

	private String name;

	private String sex;

	private Integer age;
}
