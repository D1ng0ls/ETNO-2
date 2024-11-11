package com.academico.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.academico.models.model.Professor;
import com.academico.models.service.ProfessorService;

@RestController
@RequestMapping(value = "/rest/v1/professor")
public class ProfessorController {
	
	@Autowired
	private ProfessorService professorService;
	
	@PostMapping(value = "/salvar", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> save(@RequestBody Professor professor) {
		var professorGravado = professorService.save(professor); // Retorna a instância da entidade professor
		
		return ResponseEntity.status(HttpStatus.CREATED.value()).body(professorGravado);
	}
	
	@PutMapping(value = "/alterar/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> update(@PathVariable Long id, @RequestBody Professor professor) {
		var professorAlterado = professorService.update(id, professor); // Retorna a instância da entidade professor
		
		return ResponseEntity.status(HttpStatus.OK.value()).body(professorAlterado);
	}
	
	@GetMapping(value = "/buscar/{id}")
	public ResponseEntity<?> findById(@PathVariable Long id) {
		var professorCadastrado = professorService.findById(id); // Retorna a instância da entidade professor
		
		return ResponseEntity.status(HttpStatus.OK.value()).body(professorCadastrado);
	}
	
	@DeleteMapping(value = "/excluir/{id}")
	public ResponseEntity<?> deleteById(@PathVariable Long id) {
		professorService.deleteById(id); // Retorna a instância da entidade professor
		
		return ResponseEntity.status(HttpStatus.NO_CONTENT.value()).body("Professor excluído com sucesso!");
	}
}
