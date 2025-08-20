package com.projeto.eventsmaneger.dto;

import com.projeto.eventsmaneger.entity.UsuariosEnum;

import java.time.LocalDateTime;

public class UsuariosCreateDTO {
        private String email;
        private String senha;
        private String nome;
        private String telefone;
        private String cpf;
        private UsuariosEnum tipo;
        private LocalDateTime data_nascimento;
        //this.created_at = created_at;
        //this.updated_a = updated_a;


    public UsuariosCreateDTO() {
    }

    public UsuariosCreateDTO(String email, String senha, String nome, String telefone, String cpf, UsuariosEnum tipo, LocalDateTime data_nascimento) {
        this.email = email;
        this.senha = senha;
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
        this.tipo = tipo;
        this.data_nascimento = data_nascimento;
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public UsuariosEnum getTipo() {
        return tipo;
    }

    public void setTipo(UsuariosEnum tipo) {
        this.tipo = tipo;
    }

    public LocalDateTime getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(LocalDateTime data_nascimento) {
        this.data_nascimento = data_nascimento;
    }
}
