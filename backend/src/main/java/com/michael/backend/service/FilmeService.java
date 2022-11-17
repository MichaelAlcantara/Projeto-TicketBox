package com.michael.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.michael.backend.domain.Filme;
import com.michael.backend.repository.FilmesRepository;

@Service
@CrossOrigin("http://localhost:4200")
public class FilmeService {
	
	@Autowired
	private FilmesRepository repository;
    
    public List<Filme> findAll(){
        return repository.findAll();
    }
    
    public Filme findById(Integer idFilme) {
        Optional<Filme> obj = repository.findById(idFilme);
        return obj.orElse(null);
    }
}
