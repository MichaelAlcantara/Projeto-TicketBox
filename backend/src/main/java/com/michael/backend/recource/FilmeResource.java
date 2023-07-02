package com.michael.backend.recource;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.michael.backend.domain.Filme;
import com.michael.backend.domain.dto.FilmeDTO;
import com.michael.backend.service.FilmeService;

@RestController
@RequestMapping(value = "/filme")
@CrossOrigin("http://localhost:4200")
public class FilmeResource {
    
    @Autowired
    private FilmeService service;

    @GetMapping(value = "sobre/{idFilme}")
    public ResponseEntity<FilmeDTO> findById(@PathVariable Integer idFilme) {
        Filme obj = service.findById(idFilme);
        return ResponseEntity.ok().body(new FilmeDTO(obj));
    }
    
    @GetMapping
    public ResponseEntity<List<FilmeDTO>> findAll(){
        List<Filme> list = service.findAll();
        List<FilmeDTO> listDTO = list.stream().map(obj -> new FilmeDTO(obj)).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDTO);
    }
    
}
