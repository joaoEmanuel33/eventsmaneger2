package com.projeto.eventsmaneger.controller;

import com.projeto.eventsmaneger.dto.UsuariosCreateDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/v1/usuarios")
public class UsuarioController {
    @GetMapping ("/{id}")
    public UsuariosCreateDTO findById(@PathVariable ("id") UUID id){
        return service.findById(id);
    }
    @GetMapping
    public List<UsuariosCreateDTO> findAll(){
        return service.findAll();
    }
    @PostMapping
    public UsuariosCreateDTO save(@RequestBody UsuariosCreateDTO usuariosCreateDTO){
        return service.save(usuariosCreateDTO);
    }
    @PutMapping("/{id}")
    public UsuariosCreateDTO upadate(@PathVariable("id") UUID id, @RequestBody UsuariosCreateDTO usuariosCreateDTO){
        return service.update(id, usuariosCreateDTO);
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id")UUID id ){
        service.deleteById(id);
    }
}
