package com.projeto.eventsmaneger.service;

import com.projeto.eventsmaneger.dto.EventoCreateDTO;
import com.projeto.eventsmaneger.entity.Evento;
import com.projeto.eventsmaneger.repository.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class EventoService {
    @Autowired
    private EventoRepository repository;

    public EventoCreateDTO findById(UUID id) {
       Evento evento =  repository.findById(id).orElseThrow();
       EventoCreateDTO eventoCreateDTO = convertToDto(evento);
       return eventoCreateDTO = new EventoCreateDTO();
    }
    public EventoCreateDTO convertToDto(Evento evento){
        EventoCreateDTO eventoCreateDTO = new EventoCreateDTO();
        eventoCreateDTO.setNome(evento.getNome());
        eventoCreateDTO.setDescricao(evento.getDescricao());
        eventoCreateDTO.setTipo(evento.getTipo());
        eventoCreateDTO.setLocal(evento.getLocal());
        eventoCreateDTO.setData_inicio(evento.getData_inicio());
        eventoCreateDTO.setData_final(evento.getData_final());
        eventoCreateDTO.setLink_evento(evento.getLink_evento());
        eventoCreateDTO.setLink_imagem(evento.getLink_imagem());
        return eventoCreateDTO;
    }
    public Evento convertToEntity(EventoCreateDTO eventoCreateDTO){
        Evento evento = new Evento();
        evento.setNome(eventoCreateDTO.getNome());
        evento.setDescricao(eventoCreateDTO.getDescricao());
        evento.setTipo(eventoCreateDTO.getTipo());
        evento.setLocal(eventoCreateDTO.getLocal());
        evento.setData_inicio(eventoCreateDTO.getData_inicio());
        evento.setData_final(eventoCreateDTO.getData_final());
        evento.setLink_evento(eventoCreateDTO.getLink_evento());
        evento.setLink_imagem(eventoCreateDTO.getLink_imagem());
        return evento;
    }




}
