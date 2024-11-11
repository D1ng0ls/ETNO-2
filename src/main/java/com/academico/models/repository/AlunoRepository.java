package com.academico.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.academico.models.model.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long>{
	
}
