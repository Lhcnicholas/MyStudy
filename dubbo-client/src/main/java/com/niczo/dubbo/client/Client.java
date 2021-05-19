package com.niczo.dubbo.client;

import com.niczo.dubbo.service.UserService;
import com.niczo.dubbo.service.dto.UserDto;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @author lhc
 */
@Service
public class Client {

    @DubboReference(version = "0.0.1")
    private UserService userService;

    @PostConstruct
    public void init() {
        UserDto userDto = new UserDto();
        userService.addUser(userDto);
    }
}
