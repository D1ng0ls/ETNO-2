package com.etno.models.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.etno.models.repository.PermissaoRepository;
import com.etno.models.service.PermissaoService;
import com.etno.models.service.dto.converter.PermissaoConverter;
import com.etno.models.service.dto.request.PermissaoRequest;
import com.etno.models.service.dto.response.PermissaoResponse;
import com.etno.models.service.exception.EntityNotFoundException;

@Service
@Transactional
public class PermissaoServiceImpl implements PermissaoService {
	
	@Autowired
	private PermissaoRepository permissaoRepository;
	
	@Override
	public PermissaoResponse create(PermissaoRequest entity) {
		var permissao = PermissaoConverter.toPermissao(entity);
		
		permissao.setNomePermissao(entity.getNomePermissao());
		permissao.setCodPermissao(entity.getNomePermissao());
		permissao = permissaoRepository.saveAndFlush(permissao);
		
		var permissaoResponse = PermissaoConverter.toPermissaoResponse(permissao);
		return permissaoResponse;
	}

	@Override
	public PermissaoResponse update(Long id, PermissaoRequest entity) {
		var permissao = permissaoRepository.findById(id)
				.orElseThrow(
						()-> new EntityNotFoundException(
								String.format("Permissão não localizada %s", 
								String.valueOf(id))));
		
		
		permissao.setNomePermissao(entity.getNomePermissao());
		permissao.setCodPermissao(entity.getNomePermissao());
		permissao = permissaoRepository.saveAndFlush(permissao);
		
		return PermissaoConverter.toPermissaoResponse(permissao);
	}

	@Override
	public void deleteById(Long id) {
		permissaoRepository.deleteById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public PermissaoResponse findById(Long id) {
		var permissao = permissaoRepository.findById(id).orElseThrow(()-> new EntityNotFoundException(
				String.format("Permissão não localizada %s", String.valueOf(id))));
		
		var permissaoResponse = PermissaoConverter.toPermissaoResponse(permissao);
		
		return permissaoResponse;
	}
}
