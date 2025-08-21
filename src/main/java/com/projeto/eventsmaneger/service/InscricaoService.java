package com.projeto.eventsmaneger.service;

import com.projeto.eventsmaneger.dto.InscricoesCreateDTO;
import com.projeto.eventsmaneger.entity.Inscricao;
import com.projeto.eventsmaneger.repository.InscricaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class InscricaoService {
    @Autowired
    private InscricaoRepository repository;

    public InscricoesCreateDTO findById(UUID id){
        Inscricao inscricao = repository.findById(id).orElseThrow();
        InscricoesCreateDTO inscricoesCreateDTO = convertToDTO(inscricao);
        return inscricoesCreateDTO = new InscricoesCreateDTO();
    }
    public InscricoesCreateDTO convertToDTO(Inscricao inscricao){
        InscricoesCreateDTO dto = new InscricoesCreateDTO();
        dto.setEvento(inscricao.getEvento());
        dto.setUsuarios(inscricao.getUsuarios());
        dto.setStatusPagamento(inscricao.getStatusPagamento());
        dto.setDataHora(inscricao.getDataHora());
        return dto;
    }
    public Inscricao convertToEntity(InscricoesCreateDTO inscricoesCreateDTO){
        Inscricao inscricao = new Inscricao();
        inscricao.setEvento(inscricoesCreateDTO.getEvento());
        inscricao.setUsuarios(inscricoesCreateDTO.getUsuarios());
        inscricao.setStatusPagamento(inscricoesCreateDTO.getStatusPagamento());
        inscricao.setDataHora(inscricoesCreateDTO.getDataHora());
    }

}
