package com.projeto.eventsmaneger.controller;

import com.projeto.eventsmaneger.dto.EventoCreateDTO;
import com.projeto.eventsmaneger.service.EventoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping ("/api/v1/evento")
//http://localhost:8080/api/v1/evento
public class EventoController {
    EventoService service;
    @GetMapping("/{id}")
    public EventoCreateDTO findByID(@PathVariable("id")UUID id){
        return service.findById(id);
    }
    @GetMapping
    public List<EventoCreateDTO> findAll(){
        return service.findAll();
    }
    @PostMapping
    public EventoCreateDTO save(@RequestBody EventoCreateDTO eventoCreateDTO){
        return service.save(eventoCreateDTO);
    }
    @PutMapping("/{id}")
    public EventoCreateDTO upadate(@PathVariable("id") UUID id, @RequestBody EventoCreateDTO eventoCreateDTO){
       return service.update(id, eventoCreateDTO);
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id")UUID id ){
        service.deleteById(id);
    }
}
