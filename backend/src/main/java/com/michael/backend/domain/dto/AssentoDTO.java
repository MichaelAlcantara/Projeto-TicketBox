package com.michael.backend.domain.dto;

import java.io.Serializable;

import com.michael.backend.domain.Assentos;

public class AssentoDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String assento;
    private Boolean situacao;

    public AssentoDTO() {
        super();
    }

    public AssentoDTO(Assentos obj) {
        super();
        this.id = obj.getId();
        this.assento = obj.getAssento();
        this.situacao = obj.getSituacao();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

}
