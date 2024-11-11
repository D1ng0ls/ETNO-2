package com.academico.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.academico.models.model.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, Long>{

}
