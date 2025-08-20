package com.projeto.eventsmaneger.repository;

import com.projeto.eventsmaneger.entity.Inscricao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface InscricaoRepository extends JpaRepository<Inscricao, UUID> {
}
