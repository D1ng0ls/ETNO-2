package com.academico.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.academico.models.model.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Long> {

}
