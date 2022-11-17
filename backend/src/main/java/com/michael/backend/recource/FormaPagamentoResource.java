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

import com.michael.backend.domain.FormaPagamento;
import com.michael.backend.domain.dto.FormaPagamentoDTO;
import com.michael.backend.service.FormaPagamentoService;

@RestController
@RequestMapping(value = "/pagamento")
@CrossOrigin("http://localhost:4200")
public class FormaPagamentoResource {
    
    @Autowired
    private FormaPagamentoService service;

    @GetMapping(value = "/{idPagamento}")
    public ResponseEntity<FormaPagamentoDTO> findById(@PathVariable Integer idPagamento) {
        FormaPagamento obj = service.findById(idPagamento);
        return ResponseEntity.ok().body(new FormaPagamentoDTO(obj));
    }
    
    @GetMapping
    public ResponseEntity<List<FormaPagamentoDTO>> findAll(){
        List<FormaPagamento> list = service.findAll();
        List<FormaPagamentoDTO> listDTO = list.stream().map(obj -> new FormaPagamentoDTO(obj)).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDTO);
    }
}
