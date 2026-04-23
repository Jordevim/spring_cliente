package com.jdev.clienteapp.spring_cliente.service;

//* import java.util.logging.Logger;

//* import org.hibernate.validator.internal.util.logging.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jdev.clienteapp.spring_cliente.models.User;
import com.jdev.clienteapp.spring_cliente.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Service
public class UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        // aquí se puede agregar la lógica de negocio

        User savedUser = userRepository.save(user);

        logger.info("Usuario guardado: {} {}",
            savedUser.getNombre(),
            savedUser.getApellido()
        );

        //* return userRepository.save(user);
        return savedUser;

    }

}
