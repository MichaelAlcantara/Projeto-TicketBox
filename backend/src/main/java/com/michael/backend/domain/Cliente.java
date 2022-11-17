package com.michael.backend.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.web.bind.annotation.CrossOrigin;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.michael.backend.domain.dto.ClienteDTO;

@Entity
@CrossOrigin("http://localhost:4200")
public class Cliente implements Serializable{
    
    private static final long serialVersionUID = 1L;
	
	@Id // Irá identificar que é um ID
	@GeneratedValue(strategy = GenerationType.IDENTITY) // AUTO_INCREMENT
	private Integer idCliente;
	private String email;
	private String senha;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate dNascimento;
	
	@JsonIgnore
	@OneToMany(mappedBy = "cliente") // Um para muitos
	private List<Compra> compra = new ArrayList<>();
		
	public Cliente() {
		super();
	}

    public Cliente(Integer idCliente, String email, String senha, LocalDate dNascimento) {
        super();
        this.idCliente = idCliente;
        this.email = email;
        this.senha = senha;
        this.dNascimento = dNascimento;
    }
    
    public Cliente(ClienteDTO obj) {
        super();
        this.idCliente = obj.getIdCliente();
        this.email = obj.getEmail();
        this.senha = obj.getSenha();
        this.dNascimento = obj.getdNascimento();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public LocalDate getdNascimento() {
        return dNascimento;
    }

}
