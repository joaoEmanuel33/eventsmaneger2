package com.projeto.eventsmaneger.service;

import com.projeto.eventsmaneger.dto.UsuariosCreateDTO;
import com.projeto.eventsmaneger.entity.Usuarios;
import com.projeto.eventsmaneger.entity.UsuariosEnum;
import com.projeto.eventsmaneger.repository.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.UUID;

@Service
public class UsuarioService {
    @Autowired
    private UsuariosRepository repository;

    public UsuariosCreateDTO findById(UUID id){
        Usuarios usuarios = repository.findById(id).orElseThrow();
        UsuariosCreateDTO usuariosCreateDTO = convertToDTO(usuarios);
        return usuariosCreateDTO = new UsuariosCreateDTO();
    }
    public UsuariosCreateDTO convertToDTO(Usuarios usuarios){
        UsuariosCreateDTO dto = new UsuariosCreateDTO();
        dto.setEmail(usuarios.getEmail());
        dto.setSenha(usuarios.getSenha());
        dto.setNome(usuarios.getNome());
        dto.setTelefone(usuarios.getTelefone());
        dto.setCpf(usuarios.getCpf());
        dto.setTipo(usuarios.getTipo());
        dto.setData_nascimento(usuarios.getData_nascimento());
        return dto;
    }
    public Usuarios convertToEntity(UsuariosCreateDTO usuariosCreateDTO){
        Usuarios usuarios = new Usuarios();
        usuarios.setEmail(usuariosCreateDTO.getEmail());
        usuarios.setSenha(usuariosCreateDTO.getSenha());
        usuarios.setNome(usuariosCreateDTO.getNome());
        usuarios.setTelefone(usuariosCreateDTO.getTelefone());
        usuarios.setCpf(usuariosCreateDTO.getCpf());
        usuarios.setTipo(usuariosCreateDTO.getTipo());
        usuarios.setData_nascimento(usuarios.getData_nascimento());
        return usuarios;
    }
}
