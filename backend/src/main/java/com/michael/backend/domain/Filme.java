package com.michael.backend.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Filme implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id // Irá identificar que é um ID
    @GeneratedValue(strategy = GenerationType.IDENTITY) // AUTO_INCREMENT
    private Integer idFilme;

    private String nomeFilme;
    private String genero;
    @JsonFormat(pattern = "dd/MM/yyyy")
    protected LocalDate dLancamento = LocalDate.now();
    private Integer faixaEtaria;
    private Integer duracao;
    private String descricao;
    private Integer estadoLancamento;

    @ManyToOne // Muitos para 1
    @JoinColumn(name = "cinema_id")
    private Cinema cinema;

    @OneToMany(mappedBy = "filme") // Um para muitos
    private List<Sessao> sessao = new ArrayList<>();

    public Filme() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Filme(Integer idFilme, String nomeFilme, String genero, Integer faixaEtaria,
            Integer duracao, String descricao, Integer estadoLancamento, Cinema cine) {
        super();
        this.idFilme = idFilme;
        this.nomeFilme = nomeFilme;
        this.genero = genero;
        this.faixaEtaria = faixaEtaria;
        this.duracao = duracao;
        this.descricao = descricao;
        this.estadoLancamento = estadoLancamento;
        this.cinema = cine;
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

    public Integer getFaixaEtaria() {
        return faixaEtaria;
    }

    public void setFaixaEtaria(Integer faixaEtaria) {
        this.faixaEtaria = faixaEtaria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Sessao> getSessao() {
        return sessao;
    }

    public void setSessao(List<Sessao> sessao) {
        this.sessao = sessao;
    }

    public LocalDate getdLancamento() {
        return dLancamento;
    }

    public Integer getDuracao() {
        return duracao;
    }

    public Integer getEstadoLancamento() {
        return estadoLancamento;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dLancamento, descricao, duracao, estadoLancamento, faixaEtaria, genero, idFilme, nomeFilme,
                sessao);
    }

    public Cinema getCinema() {
        return cinema;
    }

    public void setCinema(Cinema cinema) {
        this.cinema = cinema;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Filme other = (Filme) obj;
        return Objects.equals(dLancamento, other.dLancamento) && Objects.equals(descricao, other.descricao)
                && Objects.equals(duracao, other.duracao) && Objects.equals(estadoLancamento, other.estadoLancamento)
                && Objects.equals(faixaEtaria, other.faixaEtaria) && Objects.equals(genero, other.genero)
                && Objects.equals(idFilme, other.idFilme) && Objects.equals(nomeFilme, other.nomeFilme)
                && Objects.equals(sessao, other.sessao);
    }
}
