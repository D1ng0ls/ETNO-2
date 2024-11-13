package com.etno.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.etno.models.model.Usuario;
																		
public interface UsuarioRepository extends JpaRepository<Usuario, Long> { 
																			
}