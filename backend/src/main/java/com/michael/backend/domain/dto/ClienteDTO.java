package com.michael.backend.domain.dto;

import java.time.LocalDate;

import org.springframework.web.bind.annotation.CrossOrigin;

import com.michael.backend.domain.Cliente;

@CrossOrigin("http://localhost:4200")
public class ClienteDTO {

    private Integer idCliente;
    private String email;
    private String senha;
    private LocalDate dNascimento;

    public ClienteDTO(Integer id, String nome) {
        super();
    }

    public ClienteDTO(Cliente obj) {
        super();
        this.idCliente = obj.getIdCliente();
        this.email = obj.getEmail();
        this.senha = obj.getSenha();
        this.dNascimento = obj.getdNascimento();
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
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

    public LocalDate getdNascimento() {
        return dNascimento;
    }

    public void setdNascimento(LocalDate dNascimento) {
        this.dNascimento = dNascimento;
    }

}
