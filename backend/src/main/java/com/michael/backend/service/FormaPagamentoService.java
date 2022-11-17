package com.michael.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.michael.backend.domain.FormaPagamento;
import com.michael.backend.repository.FormaPagamentoRepository;

@Service
@CrossOrigin("http://localhost:4200")
public class FormaPagamentoService {

    @Autowired
    private FormaPagamentoRepository repository;

    public List<FormaPagamento> findAll() {
        return repository.findAll();
    }

    public FormaPagamento findById(Integer idCompra) {
        Optional<FormaPagamento> obj = repository.findById(idCompra);
        return obj.orElse(null);
    }
}
