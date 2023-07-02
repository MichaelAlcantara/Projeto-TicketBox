package com.michael.backend.domain.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.michael.backend.domain.Filme;

public class FilmeDTO {

    private Integer idFilme;
    private String nomeFilme;
    private String genero;
    @JsonFormat(pattern = "dd/MM/yyyy")
    protected LocalDate dLancamento = LocalDate.now();
    private Integer faixaEtaria;
    private Integer duracao;
    private String descricao;
    private Integer estadoLancamento;
    private Integer idCinema;

    public FilmeDTO() {
        super();
        // TODO Auto-generated constructor stub
    }

    public FilmeDTO(Filme obj) {
        super();
        this.idFilme = obj.getIdFilme();
        this.nomeFilme = obj.getNomeFilme();
        this.genero = obj.getGenero();
        this.dLancamento = obj.getdLancamento();
        this.faixaEtaria = obj.getFaixaEtaria();
        this.duracao = obj.getDuracao();
        this.descricao = obj.getDescricao();
        this.estadoLancamento = obj.getEstadoLancamento();
        this.idCinema = obj.getCinema().getIdCinema();
    }

    public Integer getIdFilme() {
        return idFilme;
    }

    public void setIdFilme(Integer idFilme) {
        this.idFilme = idFilme;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public LocalDate getdLancamento() {
        return dLancamento;
    }

    public void setdLancamento(LocalDate dLancamento) {
        this.dLancamento = dLancamento;
    }

    public Integer getFaixaEtaria() {
        return faixaEtaria;
    }

    public void setFaixaEtaria(Integer faixaEtaria) {
        this.faixaEtaria = faixaEtaria;
    }

    public Integer getDuracao() {
        return duracao;
    }

    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getEstadoLancamento() {
        return estadoLancamento;
    }

    public void setEstadoLancamento(Integer estadoLancamento) {
        this.estadoLancamento = estadoLancamento;
    }

    public Integer getIdCinema() {
        return idCinema;
    }

    public void setIdCinema(Integer idCinema) {
        this.idCinema = idCinema;
    }

}
