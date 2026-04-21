package com.jdev.clienteapp.spring_cliente.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jdev.clienteapp.spring_cliente.models.User;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "*")
public class Controller {

    @PostMapping
    public User createUser(@RequestBody User user) {
        System.out.println("Usuario recibido: " + user.getNombre() + " " + user.getApellido());
        System.out.println("Ciudad: " + user.getCiudad());
        System.out.println("Departamento: " + user.getDepartamento());
        System.out.println("Edad: " + user.getEdad());
        return user;
    }

}
