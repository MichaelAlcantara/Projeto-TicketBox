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

import com.michael.backend.domain.Assentos;
import com.michael.backend.domain.dto.AssentoDTO;
import com.michael.backend.service.AssentoService;

@RestController
@RequestMapping(value = "/assento")
@CrossOrigin("http://localhost:4200")
public class AssentoResource {
    
    @Autowired
    private AssentoService service;
    
    @GetMapping(value = "/{idCinema}")
    public ResponseEntity<AssentoDTO> findById(@PathVariable Integer idCinema) {
        Assentos obj = service.findById(idCinema);
        return ResponseEntity.ok().body(new AssentoDTO(obj));
    }
    
    @GetMapping(value = "/todos")
    public ResponseEntity<List<AssentoDTO>> findAll(){
        List<Assentos> list = service.findAll();
        List<AssentoDTO> listDTO = list.stream().map(obj -> new AssentoDTO(obj)).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDTO);
    }
    
}
