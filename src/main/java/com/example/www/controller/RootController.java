package com.example.www.controller;

import com.example.www.entity.UserEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class RootController {

    @RequestMapping("/")
    UserEntity Root() {
        return new UserEntity(233, "zhangsan", "zhangsan123");
    }
}
