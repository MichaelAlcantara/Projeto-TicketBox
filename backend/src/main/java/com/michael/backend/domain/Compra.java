package com.michael.backend.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Compra {
	
	@Id // Irá identificar que é um ID
	@GeneratedValue(strategy = GenerationType.IDENTITY) // AUTO_INCREMENT
	private Integer idCompra;
	private Double vlInteira;
	private Double vlMeia;
	
	@JsonIgnore
	@ManyToOne //Muitos para 1
	@JoinColumn(name = "id_sessao")
	private Sessao sessao;
	
	@JsonIgnore
	@ManyToOne //Muitos para 1
	@JoinColumn(name = "id_cliente")
	private Cliente cliente;
	
	@JsonIgnore
	@ManyToOne //Muitos para 1
	@JoinColumn(name = "id_pagamento")
	private FormaPagamento pagamento;
	
	public Compra() {
		super();
	}
	
	
	public Compra(Integer idCompra, Double vlInteira, Double vlMeia, Sessao sessao, Cliente cliente,
			FormaPagamento pagamento) {
		super();
		this.idCompra = idCompra;
		this.vlInteira = vlInteira;
		this.vlMeia = vlMeia;
		this.sessao = sessao;
		this.cliente = cliente;
		this.pagamento = pagamento;
	}


	public Integer getIdCompra() {
		return idCompra;
	}
	public void setIdCompra(Integer idCompra) {
		this.idCompra = idCompra;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Sessao getSessao() {
		return sessao;
	}
	public void setSessao(Sessao sessao) {
		this.sessao = sessao;
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


	public FormaPagamento getPagamento() {
		return pagamento;
	}


	public void setPagamento(FormaPagamento pagamento) {
		this.pagamento = pagamento;
	}
	
	
}
