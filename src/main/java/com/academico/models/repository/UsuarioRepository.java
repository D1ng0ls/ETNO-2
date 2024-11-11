package com.academico.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.academico.models.model.Usuario;
																			// <?> classe genérica, qualquer dado
public interface UsuarioRepository extends JpaRepository<Usuario, Long> { 	// <> classe genérica (passo um dado), 
																			// trabalha com qualquer tipo de dado

}
