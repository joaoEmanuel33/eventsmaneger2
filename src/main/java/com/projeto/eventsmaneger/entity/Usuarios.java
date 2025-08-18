package com.projeto.eventsmaneger.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "usuarios")
public class Usuarios {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "UUID")
    @Column(nullable = false,updatable = false)
    private UUID id;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String senha;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String telefone;
    @Column(nullable = false)
    private String cpf;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private UsuariosEnum tipo;
    @Column(nullable = false)
    private Date data_nascimento;
    private LocalDateTime created_at;
    private LocalDateTime updated_a;

    @OneToMany(mappedBy = "usuarios")
    private List<Inscricao> inscricoes;

    public Usuarios() {
    }

    public Usuarios(UUID id, String email, String senha, String nome, String telefone, String cpf, UsuariosEnum tipo, Date data_nascimento, LocalDateTime created_at, LocalDateTime updated_a) {
        this.id = id;
        this.email = email;
        this.senha = senha;
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
        this.tipo = tipo;
        this.data_nascimento = data_nascimento;
        this.created_at = created_at;
        this.updated_a = updated_a;
    }

    //getter e setters
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
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

    public Date getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(Date data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }

    public LocalDateTime getUpdated_a() {
        return updated_a;
    }

    public void setUpdated_a(LocalDateTime updated_a) {
        this.updated_a = updated_a;
    }

    public List<Inscricao> getInscricoes() {
        return inscricoes;
    }

    public void setInscricoes(List<Inscricao> inscricoes) {
        this.inscricoes = inscricoes;
    }
}
