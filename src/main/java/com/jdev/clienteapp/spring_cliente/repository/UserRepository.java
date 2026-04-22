package com.jdev.clienteapp.spring_cliente.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jdev.clienteapp.spring_cliente.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}

