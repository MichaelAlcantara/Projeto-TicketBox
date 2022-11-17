package com.michael.backend.recource;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.michael.backend.dao.SessaoDao;
import com.michael.backend.domain.Filme;
import com.michael.backend.domain.Sessao;
import com.michael.backend.domain.dto.SessaoDTO;
import com.michael.backend.service.SessaoService;

@RestController
@RequestMapping(value = "/sessao")
@CrossOrigin("http://localhost:4200")
public class SessaoRecourse {
    
    @Autowired
    private SessaoService service;
    
    @Autowired
    private SessaoDao dao;
    
    @GetMapping(value = "/{idSessao}")
    public ResponseEntity<SessaoDTO> findById(@PathVariable Integer idSessao){
        Sessao obj = service.findById(idSessao);
        return ResponseEntity.ok().body(new SessaoDTO(obj));
    }
    
    @GetMapping("/todos")
    public ResponseEntity<List<SessaoDTO>> findAll(){
        List<Sessao> list = service.findAll();
        List<SessaoDTO> listDTO = list.stream().map(obj -> new SessaoDTO(obj)).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDTO);
    }
    
    @GetMapping("/cinema/{idCinema}")
    public ResponseEntity<List<SessaoDTO>> findAllByCinema(@PathVariable Integer idCinema){
        List<Sessao> list = dao.findAllByCinema(idCinema);
        List<SessaoDTO> listDTO = list.stream().map(obj -> new SessaoDTO(obj)).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDTO);
    }
    
    @GetMapping("/filme")
    public ResponseEntity<List<SessaoDTO>> findAllByFilme(@RequestParam(value = "filme", defaultValue = "0") Integer idFilme){
        List<Sessao> list = service.findAllByFilme(idFilme);
        List<SessaoDTO> listDTO = list.stream().map(obj -> new SessaoDTO(obj)).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDTO);
    }
}
