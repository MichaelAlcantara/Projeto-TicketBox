package com.michael.backend.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class FormaPagamento {
	
	@Id // Irá identificar que é um ID
	@GeneratedValue(strategy = GenerationType.IDENTITY) // AUTO_INCREMENT
	private Integer idPagamento;
	private String forma;
	
	@OneToMany(mappedBy = "pagamento") // Um para muitos
	private List<Compra> compra = new ArrayList<>();
	
	public FormaPagamento() {
		super();
	}

	public FormaPagamento(Integer idPagamento, String forma) {
		super();
		this.idPagamento = idPagamento;
		this.forma = forma;
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
