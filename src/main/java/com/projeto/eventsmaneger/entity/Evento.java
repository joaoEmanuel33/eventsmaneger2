package com.projeto.eventsmaneger.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "evento")
public class Evento {
    @Id
    @GeneratedValue ( strategy = GenerationType.AUTO,generator ="UUID")
    @Column(nullable = false,updatable = false)
    private UUID id;
    private String nome;
    @Column(nullable = false)
    private String descricao;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private EventoEnum tipo;
    @Column(nullable = false)
    private Date data;
    @Column(nullable = false)
    private String Local;
    @Column(nullable = false)
    private LocalDateTime data_inicio;
    @Column(nullable = false)
    private LocalDateTime data_final;
    private double valor;
    private String link_evento;
    private String link_imagem;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;

    //relacionamento objeto inscricao
    @OneToMany(mappedBy = "evento")
    private List<Inscricao> inscricoes;

    public Evento() {
    }

    public Evento(UUID id, String nome, String descricao, EventoEnum tipo, Date data, String local, LocalDateTime data_inicio, LocalDateTime data_final, String link_evento, String link_imagem, LocalDateTime created_at, LocalDateTime updated_at, double valor) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.tipo = tipo;
        this.data = data;
        Local = local;
        this.data_inicio = data_inicio;
        this.data_final = data_final;
        this.valor = valor;
        this.link_evento = link_evento;
        this.link_imagem = link_imagem;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    //getter e setter
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
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

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getLocal() {
        return Local;
    }

    public void setLocal(String local) {
        Local = local;
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

    public void  setValor(double valor){
        this.valor = valor;
    }

    public void getValor(){
        return valor;
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

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }

    public LocalDateTime getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(LocalDateTime updated_at) {
        this.updated_at = updated_at;
    }

    public List<Inscricao> getInscricoes() {
        return inscricoes;
    }

    public void setInscricoes(List<Inscricao> inscricoes) {
        this.inscricoes = inscricoes;
    }
}
