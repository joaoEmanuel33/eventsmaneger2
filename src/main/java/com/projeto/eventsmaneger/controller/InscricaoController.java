package com.projeto.eventsmaneger.controller;

import com.projeto.eventsmaneger.dto.InscricoesCreateDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/v1/incricao")
public class InscricaoController {
    @GetMapping("/{id}")
    public InscricoesCreateDTO findById(@PathVariable("id")UUID id){
     return service.findById(id);
    }
    @GetMapping
    public List<InscricoesCreateDTO> findAll(){
        return service.findAll();
    }
    @PostMapping
    public InscricoesCreateDTO save(@RequestBody InscricoesCreateDTO inscricoesCreateDTO){
        return service.save(inscricoesCreateDTO);
    }
    @PutMapping("/{id}")
    public InscricoesCreateDTO upadate(@PathVariable("id") UUID id, @RequestBody InscricoesCreateDTO inscricoesCreateDTO){
        return service.update(id, inscricoesCreateDTO);
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id")UUID id ){
        service.deleteById(id);
    }
}
