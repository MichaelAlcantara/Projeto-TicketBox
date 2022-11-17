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
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Cinema implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id // Irá identificar que é um ID
	@GeneratedValue(strategy = GenerationType.IDENTITY) // AUTO_INCREMENT
	private Integer idCinema;
	private String nomeCinema;
	private String cidade;
	@JsonFormat(pattern = "dd/MM/yyyy")
	protected LocalDate hAbrir = LocalDate.now();
	@JsonFormat(pattern = "dd/MM/yyyy")
	protected LocalDate hFechar = LocalDate.now();
	
	@JsonIgnore
	@OneToMany(mappedBy = "cinema") // Um para muitos
	private List<Sessao> sessao = new ArrayList<>();

	public Cinema() {
    }

    public Cinema(Integer id, String nomeCinema, String cidade, Sessao sessao) {
		super();
	}

	public Cinema(Integer idCinema, String nomeCinema, String cidade) {
		super();
		this.idCinema = idCinema;
		this.nomeCinema = nomeCinema;
		this.cidade = cidade;
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

	@Override
	public int hashCode() {
		return Objects.hash(cidade, hAbrir, hFechar, idCinema, nomeCinema, sessao);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cinema other = (Cinema) obj;
		return Objects.equals(cidade, other.cidade) && Objects.equals(hAbrir, other.hAbrir)
				&& Objects.equals(hFechar, other.hFechar) && Objects.equals(idCinema, other.idCinema)
				&& Objects.equals(nomeCinema, other.nomeCinema) && Objects.equals(sessao, other.sessao);
	}

}
