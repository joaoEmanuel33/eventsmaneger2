package com.projeto.eventsmaneger.repository;

import com.projeto.eventsmaneger.entity.Evento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EventoRepository extends JpaRepository<Evento, UUID> {
}
