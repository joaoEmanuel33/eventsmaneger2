package com.projeto.eventsmaneger.dto;

import com.projeto.eventsmaneger.entity.InscricaoStatusEnum;

import java.time.LocalDateTime;

public class InscricoesCreateDTO {
        private String evento;
        private String usuarios;
        private InscricaoStatusEnum statusPagamento;
        private LocalDateTime dataHora;
        //this.createdAt = createdAt;
        //this.updatedAt = updatedAt;


    public InscricoesCreateDTO() {
    }

    public InscricoesCreateDTO(String evento, String usuarios, InscricaoStatusEnum statusPagamento, LocalDateTime dataHora) {
        this.evento = evento;
        this.usuarios = usuarios;
        this.statusPagamento = statusPagamento;
        this.dataHora = dataHora;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public String getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(String usuarios) {
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
}
