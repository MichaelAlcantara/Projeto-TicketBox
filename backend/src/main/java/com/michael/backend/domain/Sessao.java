package com.michael.backend.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
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
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Sessao implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id // Irá identificar que é um ID
    @GeneratedValue(strategy = GenerationType.IDENTITY) // AUTO_INCREMENT
    private Integer idSessao;

    @JsonFormat(pattern = "dd/MM/yyyy")
    protected LocalDate dDisponivel = LocalDate.now();
    private Double preco;

    @ManyToOne // Muitos para 1
    @JoinColumn(name = "filme_id")
    private Filme filme;

    @ManyToOne // Muitos para 1
    @JoinColumn(name = "cinema_id")
    private Cinema cinema;

    @JsonIgnore
    @OneToMany(mappedBy = "sessao") // Um para muitos
    private List<Compra> compra = new ArrayList<>();

    public Sessao() {
    }

    public Sessao(Integer idSessao, double preco, ArrayList<Filme> filmess, Cinema cinema) {
        super();
    }

    public Sessao(Integer idSessao, Double preco, Filme filme, Cinema cinema) {
        super();
        this.idSessao = idSessao;
        this.preco = preco;
        this.filme = filme;
        this.cinema = cinema;
    }

    public Sessao(Integer idSessao2) {
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

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public LocalDate getdDisponivel() {
        return dDisponivel;
    }

    public Cinema getCinema() {
        return cinema;
    }

    public void setCinema(Cinema cinema) {
        this.cinema = cinema;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cinema, compra, dDisponivel, filme, idSessao, preco);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Sessao other = (Sessao) obj;
        return Objects.equals(cinema, other.cinema) && Objects.equals(compra, other.compra)
                && Objects.equals(dDisponivel, other.dDisponivel) && Objects.equals(filme, other.filme)
                && Objects.equals(idSessao, other.idSessao) && Objects.equals(preco, other.preco);
    }
    
    
    
}
