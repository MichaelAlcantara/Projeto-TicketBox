package com.michael.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.michael.backend.domain.Cinema;
import com.michael.backend.repository.CinemaRepository;

@Service
@CrossOrigin("http://localhost:4200")
public class CinemaService {
	
    @Autowired
    private CinemaRepository repository;
    
    public List<Cinema> findAll(){
        return repository.findAll();
    }
    
    public Cinema findById(Integer idFilme) {
        Optional<Cinema> obj = repository.findById(idFilme);
        return obj.orElse(null);
    }
    
}

