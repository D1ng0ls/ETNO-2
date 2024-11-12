package com.etno.web.controllers;

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
import com.etno.models.model.Noticia;
import com.etno.models.service.NoticiaService;

@RestController
@RequestMapping(value = "/rest/noticia")
public class NoticiaController {
	
	@Autowired
	private NoticiaService noticiaService;
	
	@PostMapping(value = "/create", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> create(@RequestBody Noticia noticia) {
		var response = noticiaService.create(noticia);
		
		return ResponseEntity.status(HttpStatus.CREATED.value()).body(response);
	}
	
	@PutMapping(value = "/modify/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> update(@PathVariable Long id, @RequestBody Noticia noticia) {
		var response = noticiaService.update(id, noticia);
		
		return ResponseEntity.status(HttpStatus.OK.value()).body(response);
	}
	
	@GetMapping(value = "/find/{id}")
	public ResponseEntity<?> findById(@PathVariable Long id) {
		var response = noticiaService.findById(id);
		
		return ResponseEntity.status(HttpStatus.OK.value()).body(response);
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public ResponseEntity<?> deleteById(@PathVariable Long id) {
		noticiaService.deleteById(id);
		
		return ResponseEntity.status(HttpStatus.NO_CONTENT.value()).body("Notícia excluída com sucesso!");
	}
}
