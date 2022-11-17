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

import com.michael.backend.domain.Compra;
import com.michael.backend.domain.dto.CompraDTO;
import com.michael.backend.service.CompraService;

@RestController
@RequestMapping(value = "/compra")
@CrossOrigin("http://localhost:4200")
public class CompraResource {
    
    @Autowired
    private CompraService service;

    @GetMapping(value = "/{idCompra}")
    public ResponseEntity<CompraDTO> findById(@PathVariable Integer idCompra) {
        Compra obj = service.findById(idCompra);
        return ResponseEntity.ok().body(new CompraDTO(obj));
    }
    
    @GetMapping
    public ResponseEntity<List<CompraDTO>> findAll(){
        List<Compra> list = service.findAll();
        List<CompraDTO> listDTO = list.stream().map(obj -> new CompraDTO(obj)).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDTO);
    }
}
