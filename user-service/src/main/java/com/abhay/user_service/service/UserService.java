package com.abhay.user_service.service;

import com.abhay.user_service.dto.UserDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserService {

    public UserDto createUser(UserDto userDto){
        log.info("Creating User: {}", userDto);
        return userDto;
    }
}
