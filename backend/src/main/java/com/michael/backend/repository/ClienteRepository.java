package com.michael.backend.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.michael.backend.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{
    
    Optional<Cliente> findByEmail(String email);

}
