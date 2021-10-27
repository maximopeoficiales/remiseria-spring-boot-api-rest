package com.idat.remiseria.domain.dto;

import lombok.Data;

@Data
public class CreateUserDto {
    String username;
    String password;
    String firstName;
    String lastName;
    String address;
    String phone;
    String email;
    Integer idRol;
}
