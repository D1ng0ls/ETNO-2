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
import com.etno.models.model.Usuario;
import com.etno.models.service.UsuarioService;
import com.etno.models.service.dto.request.UsuarioRequest;

@RestController
@RequestMapping(value = "/rest/v1/usuario")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@PostMapping(value = "/salvar", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> save(@RequestBody UsuarioRequest usuarioRequest) {
		var usuarioResponse = usuarioService.save(usuarioRequest); // Retorna a instância da entidade usuario
		
		return ResponseEntity.status(HttpStatus.CREATED.value()).body(usuarioResponse);
	}
	
	@PutMapping(value = "/alterar/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> update(@PathVariable Long id, @RequestBody UsuarioRequest usuarioRequest) {
		var usuarioAlterado = usuarioService.update(id, usuarioRequest); // Retorna a instância da entidade usuario
		
		return ResponseEntity.status(HttpStatus.OK.value()).body(usuarioAlterado);
	}
	
	@GetMapping(value = "/buscar/{id}")
	public ResponseEntity<?> findById(@PathVariable Long id) {
		var usuarioCadastrado = usuarioService.findById(id); // Retorna a instância da entidade usuario
		
		return ResponseEntity.status(HttpStatus.OK.value()).body(usuarioCadastrado);
	}
	
	@DeleteMapping(value = "/excluir/{id}")
	public ResponseEntity<?> deleteById(@PathVariable Long id) {
		usuarioService.deleteById(id); // Retorna a instância da entidade usuario
		
		return ResponseEntity.status(HttpStatus.NO_CONTENT.value()).body("Usuario excluída com sucesso!");
	}
}
