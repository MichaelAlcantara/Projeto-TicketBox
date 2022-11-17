package com.michael.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.michael.backend.domain.Sessao;
import com.michael.backend.repository.SessaoRepository;

@Service
@CrossOrigin("http://localhost:4200")
public class SessaoService {
	
	@Autowired
	private SessaoRepository repository;
	
	@Autowired
	private CinemaService cinemaService;

    public Sessao findById(Integer idSessao) {
        Optional<Sessao> obj = repository.findById(idSessao);
        return obj.orElse(null);
    }

    public List<Sessao> findAll() {
        List<Sessao> obj = repository.findAll();
        return obj;
    }

    public List<Sessao> findAllByCinema(Integer idCinema) {
        cinemaService.findById(idCinema);
        return repository.findAllByCinema(idCinema);
    }

    public List<Sessao> findAllByFilme(Integer idFilme) {
        cinemaService.findById(idFilme);
        return repository.findAllByFilme(idFilme);
    }
	
}
