package com.example.www.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserEntity {
    Integer id;
    String username;
    String password;
}
