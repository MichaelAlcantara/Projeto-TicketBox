package com.michael.backend.domain.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.michael.backend.domain.Cinema;
import com.michael.backend.domain.Sessao;

public class CinemaDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer idCinema;
    private String nomeCinema;
    private String cidade;
    protected LocalDate hAbrir = LocalDate.now();
    protected LocalDate hFechar = LocalDate.now();
    @JsonIgnore
    private List<Sessao> sessao = new ArrayList<>();

    public CinemaDTO() {
        super();
    }

    public CinemaDTO(Cinema obj) {
        super();
        this.idCinema = obj.getIdCinema();
        this.nomeCinema = obj.getNomeCinema();
        this.cidade = obj.getCidade();
        this.hAbrir = obj.gethAbrir();
        this.hFechar = obj.gethFechar();
        this.sessao = obj.getSessao();
    }

    public Integer getIdCinema() {
        return idCinema;
    }

    public void setIdCinema(Integer idCinema) {
        this.idCinema = idCinema;
    }

    public String getNomeCinema() {
        return nomeCinema;
    }

    public void setNomeCinema(String nomeCinema) {
        this.nomeCinema = nomeCinema;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public List<Sessao> getSessao() {
        return sessao;
    }

    public void setSessao(List<Sessao> sessao) {
        this.sessao = sessao;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public LocalDate gethAbrir() {
        return hAbrir;
    }

    public LocalDate gethFechar() {
        return hFechar;
    }

}
