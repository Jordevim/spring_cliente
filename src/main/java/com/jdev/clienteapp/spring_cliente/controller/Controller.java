package com.jdev.clienteapp.spring_cliente.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jdev.clienteapp.spring_cliente.models.User;
import com.jdev.clienteapp.spring_cliente.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "*")
public class Controller {

    @Autowired
    private UserRepository userRepository;

    @PostMapping
    public User createUser(@RequestBody User user) {

        User savedUser = userRepository.save(user);

        System.out.println("Usuario guardado: " + savedUser.getNombre() + " " + savedUser.getApellido());
        //* System.out.println("Ciudad: " + user.getCiudad());
        //* System.out.println("Departamento: " + user.getDepartamento());
        //* System.out.println("Edad: " + user.getEdad());
        //* return user;
        return savedUser;
    }

}
