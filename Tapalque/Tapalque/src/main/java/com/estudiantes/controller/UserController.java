package com.estudiantes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/saludo") // Este endpoint responderá a las solicitudes GET en la raíz
    public String hello() {
        return "¡Hola, bienvenido a la aplicación de estudiantes!";
    }


}






    
    