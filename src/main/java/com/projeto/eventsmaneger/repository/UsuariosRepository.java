package com.projeto.eventsmaneger.repository;

import com.projeto.eventsmaneger.entity.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UsuariosRepository extends JpaRepository<Usuarios, UUID> {
}
