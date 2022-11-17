package com.michael.backend.domain.dto;

import com.michael.backend.domain.FormaPagamento;

public class FormaPagamentoDTO {
    private Integer idPagamento;
    private String forma;

    public FormaPagamentoDTO() {
        super();
        // TODO Auto-generated constructor stub
    }

    public FormaPagamentoDTO(FormaPagamento obj) {
        super();
        this.idPagamento = obj.getIdPagamento();
        this.forma = obj.getForma();
    }

    public Integer getIdPagamento() {
        return idPagamento;
    }

    public void setIdPagamento(Integer idPagamento) {
        this.idPagamento = idPagamento;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

}
