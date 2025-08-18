package com.projeto.eventsmaneger.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "inscricao")
public class Inscricao {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "UUID")
    @Column(nullable = false, updatable = false)
    private UUID id;

    //chaves estrangeiras
    @ManyToOne
    @JoinColumn(name="Evento_id", nullable = false)
    private Evento evento;

    @ManyToOne
    @JoinColumn(name="Usuarios_id", nullable = false)
    private Usuarios usuarios;

    @Column(nullable = false)
    private InscricaoStatusEnum statusPagamento;
    @Column(nullable = false)
    private LocalDateTime dataHora;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Inscricao() {
    }

    public Inscricao(UUID id, Evento evento, Usuarios usuarios, InscricaoStatusEnum statusPagamento, LocalDateTime dataHora, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.evento = evento;
        this.usuarios = usuarios;
        this.statusPagamento = statusPagamento;
        this.dataHora = dataHora;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    //getter e setters
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public Usuarios getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
    }

    public InscricaoStatusEnum getStatusPagamento() {
        return statusPagamento;
    }

    public void setStatusPagamento(InscricaoStatusEnum statusPagamento) {
        this.statusPagamento = statusPagamento;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
