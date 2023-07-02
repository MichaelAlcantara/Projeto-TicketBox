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

import com.michael.backend.domain.Cinema;
import com.michael.backend.domain.dto.CinemaDTO;
import com.michael.backend.service.CinemaService;

@RestController
@RequestMapping(value = "/cinemas")
@CrossOrigin("http://localhost:4200")
public class CinemaRecourse {
    @Autowired
    private CinemaService service;

    @GetMapping(value = "sobre/{idCinema}")
    public ResponseEntity<CinemaDTO> findById(@PathVariable Integer idCinema) {
        Cinema obj = this.service.findById(idCinema);
        return ResponseEntity.ok().body(new CinemaDTO(obj));
    }
    
    @GetMapping
    public ResponseEntity<List<CinemaDTO>> findAll(){
        List<Cinema> list = service.findAll();
        List<CinemaDTO> listDTO = list.stream().map(obj -> new CinemaDTO(obj)).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDTO);
    }
    
}
