package com.michael.backend.domain.dto;

import java.io.Serializable;

import com.michael.backend.domain.Assentos;

public class AssentoDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String nome;
    private Boolean situacao;
    private Integer qtd;

    public AssentoDTO() {
        super();
    }

    public AssentoDTO(Assentos obj) {
        super();
        this.id = obj.getId();
        this.nome = obj.getNome();
        this.situacao = obj.getSituacao();
        this.qtd = obj.getQtd();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean getSituacao() {
        return situacao;
    }

    public void setSituacao(Boolean situacao) {
        this.situacao = situacao;
    }

    public Integer getQtd() {
        return qtd;
    }

    public void setQtd(Integer qtd) {
        this.qtd = qtd;
    }

}
