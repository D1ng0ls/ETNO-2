package com.etno.models.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.etno.models.repository.UsuarioRepository;
import com.etno.models.service.UsuarioService;
import com.etno.models.service.dto.request.UsuarioRequest;
import com.etno.models.service.dto.response.UsuarioResponse;
import com.etno.models.service.dto.converter.UsuarioConverter;
import com.etno.models.service.exception.EntityNotFoundException;

@Service
@Transactional
public class UsuarioServiceImpl implements UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Override
	public UsuarioResponse create(UsuarioRequest entity) {
		var usuario = UsuarioConverter.toUsuario(entity);
		
		usuario.setNomeUsuario(entity.getNomeUsuario());
		usuario.setCodUsuario(entity.getCodUsuario());
		usuario = usuarioRepository.saveAndFlush(usuario);
		
		var usuarioResponse = UsuarioConverter.toUsuarioResponse(usuario);
		return usuarioResponse;
	}

	@Override
	public UsuarioResponse update(Long id, UsuarioRequest entity) {
		var usuario = usuarioRepository.findById(id)
				.orElseThrow(
						()-> new EntityNotFoundException(
								String.format("Usuário não localizado %s", 
								String.valueOf(id))));
		
		
		usuario.setCodUsuario(entity.getCodUsuario());
		usuario.setNomeUsuario(entity.getNomeUsuario());

		usuario = usuarioRepository.saveAndFlush(usuario);
		
		return UsuarioConverter.toUsuarioResponse(usuario);
	}

	@Override
	public void deleteById(Long id) {
		usuarioRepository.deleteById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public UsuarioResponse findById(Long id) {
		var usuario = usuarioRepository.findById(id).orElseThrow(()-> new EntityNotFoundException(
				String.format("Usuario não localizado %s", String.valueOf(id))));
		
		var usuarioResponse = UsuarioConverter.toUsuarioResponse(usuario);
		
		return usuarioResponse;
	}
}