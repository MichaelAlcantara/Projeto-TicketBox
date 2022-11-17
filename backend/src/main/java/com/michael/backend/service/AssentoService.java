package com.michael.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.michael.backend.domain.Assentos;
import com.michael.backend.repository.AssentoRepository;

@Service
@CrossOrigin("http://localhost:4200")
public class AssentoService {
    
    @Autowired
    private AssentoRepository repository;
    
    public List<Assentos> findAll(){
        return repository.findAll();
    }
    
    public Assentos findById(Integer idFilme) {
        Optional<Assentos> obj = repository.findById(idFilme);
        return obj.orElse(null);
    }
    
 }
