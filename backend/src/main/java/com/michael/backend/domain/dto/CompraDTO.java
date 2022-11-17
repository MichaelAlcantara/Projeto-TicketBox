package com.michael.backend.domain.dto;

import com.michael.backend.domain.Compra;

public class CompraDTO {

    private Integer idCompra;
    private Double vlInteira;
    private Double vlMeia;
    private Integer sessao;
    private String filme;
    private String cinema;
    private Integer idCliente;
    private Integer idPagamento;
    private String emailCliente;
    private String formaPagamento;

    public CompraDTO() {
        super();
    }

    public CompraDTO(Compra obj) {
        super();
        this.idCompra = obj.getIdCompra();
        this.vlInteira = obj.getVlInteira();
        this.vlMeia = obj.getVlInteira();
        this.sessao = obj.getSessao().getIdSessao();
        this.cinema = obj.getSessao().getCinema().getNomeCinema();
        this.filme = obj.getSessao().getFilme().getNomeFilme();
        this.idCliente = obj.getCliente().getIdCliente();
        this.idPagamento = obj.getPagamento().getIdPagamento();
        this.emailCliente = obj.getCliente().getEmail();
        this.formaPagamento = obj.getPagamento().getForma();
    }

    public Integer getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Integer idCompra) {
        this.idCompra = idCompra;
    }

    public Double getVlInteira() {
        return vlInteira;
    }

    public void setVlInteira(Double vlInteira) {
        this.vlInteira = vlInteira;
    }

    public Double getVlMeia() {
        return vlMeia;
    }

    public void setVlMeia(Double vlMeia) {
        this.vlMeia = vlMeia;
    }

    public Integer getSessao() {
        return sessao;
    }

    public void setSessao(Integer sessao) {
        this.sessao = sessao;
    }

    public String getFilme() {
        return filme;
    }

    public void setFilme(String filme) {
        this.filme = filme;
    }

    public String getCinema() {
        return cinema;
    }

    public void setCinema(String cinema) {
        this.cinema = cinema;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Integer getIdPagamento() {
        return idPagamento;
    }

    public void setIdPagamento(Integer idPagamento) {
        this.idPagamento = idPagamento;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

}
