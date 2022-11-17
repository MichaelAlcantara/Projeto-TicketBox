package com.michael.backend.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.web.bind.annotation.CrossOrigin;

@Entity
@CrossOrigin("http://localhost:4200")
public class Assentos implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id // Irá identificar que é um ID
    @GeneratedValue(strategy = GenerationType.IDENTITY) // AUTO_INCREMENT
    private Integer id;
    private String assento;
    private Boolean situacao;

    public Assentos(Integer id, String assento, Boolean situacao) {
        super();
        this.id = id;
        this.assento = assento;
        this.situacao = situacao;
    }

    public Assentos() {
        super();
    }

    public String getAssento() {
        return assento;
    }

    public void setAssento(String assento) {
        this.assento = assento;
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

}
