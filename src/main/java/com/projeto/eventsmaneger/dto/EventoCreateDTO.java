package com.projeto.eventsmaneger.dto;

import com.projeto.eventsmaneger.entity.EventoEnum;

import java.time.LocalDateTime;

public class EventoCreateDTO {
        private String nome;
        private String descricao;
        private EventoEnum tipo;
        private String local;
        private LocalDateTime data_inicio;
        private LocalDateTime data_final;
        private String link_evento;
        private String link_imagem;
        //this.created_at = created_at;
        //this.updated_at = updated_at;


    public EventoCreateDTO() {
    }

    public EventoCreateDTO(String nome, String descricao, EventoEnum tipo, String local, LocalDateTime data_inicio, LocalDateTime data_final, String link_evento, String link_imagem) {
        this.nome = nome;
        this.descricao = descricao;
        this.tipo = tipo;
        this.local = local;
        this.data_inicio = data_inicio;
        this.data_final = data_final;
        this.link_evento = link_evento;
        this.link_imagem = link_imagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public EventoEnum getTipo() {
        return tipo;
    }

    public void setTipo(EventoEnum tipo) {
        this.tipo = tipo;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public LocalDateTime getData_inicio() {
        return data_inicio;
    }

    public void setData_inicio(LocalDateTime data_inicio) {
        this.data_inicio = data_inicio;
    }

    public LocalDateTime getData_final() {
        return data_final;
    }

    public void setData_final(LocalDateTime data_final) {
        this.data_final = data_final;
    }

    public String getLink_evento() {
        return link_evento;
    }

    public void setLink_evento(String link_evento) {
        this.link_evento = link_evento;
    }

    public String getLink_imagem() {
        return link_imagem;
    }

    public void setLink_imagem(String link_imagem) {
        this.link_imagem = link_imagem;
    }
}
