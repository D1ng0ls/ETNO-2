package com.etno.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.etno.models.model.Noticia;

public interface NoticiaRepository extends JpaRepository<Noticia, Long>{

}
