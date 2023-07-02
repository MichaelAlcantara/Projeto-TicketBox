package com.michael.backend.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.Valid;

import org.springframework.web.bind.annotation.CrossOrigin;

import com.michael.backend.domain.dto.AssentoDTO;

@Entity
@CrossOrigin("http://localhost:4200")
public class Assentos implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id // Irá identificar que é um ID
    @GeneratedValue(strategy = GenerationType.IDENTITY) // AUTO_INCREMENT
    private Integer id;
    private String nome;
    private Boolean situacao;
    private Integer qtd;

    public Assentos(Integer id, String nome, Boolean situacao, Integer qtd) {
        super();
        this.id = id;
        this.nome = nome;
        this.situacao = situacao;
        this.qtd = qtd;
    }

    public Assentos(AssentoDTO objDTO) {
        super();
        this.id = objDTO.getId();
        this.nome = objDTO.getNome();
        this.situacao = objDTO.getSituacao();
    }
    
    public Assentos() {
        super();
    }

    public String getNome() {
        return nome;
    }

    public void setAssento(String nome) {
        this.nome = nome;
    }

    public Boolean getSituacao() {
        return situacao;
    }

    public void setSituacao(Boolean situacao) {
        this.situacao = situacao;
    }

    public Integer getId() {
        return id;
    }

    public Integer getQtd() {
        return qtd;
    }

    public void setQtd(Integer qtd) {
        this.qtd = qtd;
    }
    
    
    
}
