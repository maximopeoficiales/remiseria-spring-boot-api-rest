package com.idat.remiseria.domain.responses;

import com.idat.remiseria.domain.entitys.User;
import lombok.AllArgsConstructor;
import lombok.Data;

//estructura de respuesta de la authenticacion
@Data
@AllArgsConstructor
public class AuthenticationResponse {
     private String jwt;

     private User user;

}
