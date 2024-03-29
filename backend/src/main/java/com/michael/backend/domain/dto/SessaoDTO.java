package com.michael.backend.domain.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.michael.backend.domain.Sessao;

public class SessaoDTO implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    private Integer idSessao;
    @JsonFormat(pattern = "dd/MM/yyyy")
    protected LocalDate dDisponivel = LocalDate.now();
    private Double preco;
    private String nomeFilme;
    private String nomeCinema;
    private Integer idFilme;
    private Integer idCinema;

    public SessaoDTO(Integer id, Date dDisponivel2, Double preco2, Integer idFilme2, Integer idCinema2) {
        super();
    }

    public SessaoDTO(Sessao obj) {
        super();
        this.idSessao = obj.getIdSessao();
        this.dDisponivel = obj.getdDisponivel();
        this.preco = obj.getPreco();
        this.nomeFilme = obj.getFilme().getNomeFilme();
        this.nomeCinema = obj.getCinema().getNomeCinema();
        this.idFilme = obj.getFilme().getIdFilme();
        this.idCinema = obj.getCinema().getIdCinema();
    }

    public SessaoDTO(SessaoDTO obj) {

    }

    public Integer getIdSessao() {
        return idSessao;
    }

    public void setIdSessao(Integer idSessao) {
        this.idSessao = idSessao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public LocalDate getdDisponivel() {
        return dDisponivel;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public String getNomeCinema() {
        return nomeCinema;
    }

    public void setNomeCinema(String nomeCinema) {
        this.nomeCinema = nomeCinema;
    }

    public Integer getIdFilme() {
        return idFilme;
    }

    public void setIdFilme(Integer idFilme) {
        this.idFilme = idFilme;
    }

    public Integer getIdCinema() {
        return idCinema;
    }

    public void setIdCinema(Integer idCinema) {
        this.idCinema = idCinema;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dDisponivel, idCinema, idFilme, idSessao, nomeCinema, nomeFilme, preco);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        SessaoDTO other = (SessaoDTO) obj;
        return Objects.equals(dDisponivel, other.dDisponivel) && Objects.equals(idCinema, other.idCinema)
                && Objects.equals(idFilme, other.idFilme) && Objects.equals(idSessao, other.idSessao)
                && Objects.equals(nomeCinema, other.nomeCinema) && Objects.equals(nomeFilme, other.nomeFilme)
                && Objects.equals(preco, other.preco);
    }
    
    
}
