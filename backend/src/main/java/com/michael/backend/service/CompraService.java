package com.michael.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.michael.backend.domain.Cinema;
import com.michael.backend.domain.Compra;
import com.michael.backend.repository.CinemaRepository;
import com.michael.backend.repository.CompraRepository;

@Service
@CrossOrigin("http://localhost:4200")
public class CompraService {
	
	@Autowired
	private CompraRepository repository;
    
    public List<Compra> findAll(){
        return repository.findAll();
    }
    
    public Compra findById(Integer idCompra) {
        Optional<Compra> obj = repository.findById(idCompra);
        return obj.orElse(null);
    }
}
