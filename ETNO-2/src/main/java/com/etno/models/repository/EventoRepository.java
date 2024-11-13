package com.etno.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.etno.models.model.Evento;

public interface EventoRepository extends JpaRepository<Evento, Long>{

}
