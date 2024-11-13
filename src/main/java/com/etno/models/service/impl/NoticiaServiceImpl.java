package com.etno.models.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.etno.models.repository.NoticiaRepository;
import com.etno.models.service.NoticiaService;
import com.etno.models.service.dto.converter.NoticiaConverter;
import com.etno.models.service.dto.request.NoticiaRequest;
import com.etno.models.service.dto.response.NoticiaResponse;
import com.etno.models.service.exception.EntityNotFoundException;

@Service
@Transactional
public class NoticiaServiceImpl implements NoticiaService {

	@Autowired
	private NoticiaRepository noticiaRepository;
	
	@Override
	public NoticiaResponse create(NoticiaRequest entity) {
		var noticia = NoticiaConverter.toNoticia(entity);
		
		noticia = noticiaRepository.saveAndFlush(noticia);
		
		var noticiaResponse = NoticiaConverter.toNoticiaResponse(noticia);
		return noticiaResponse;
	}

	@Override
	public NoticiaResponse update(Long id, NoticiaRequest entity) {
		var noticia = noticiaRepository.findById(id)
				.orElseThrow(
						()-> new EntityNotFoundException(
								String.format("Notícia não localizado %s", 
								String.valueOf(id))));
		
		
		noticia.setCodNoticia(entity.getCodNoticia());
		
		
		noticia = noticiaRepository.saveAndFlush(noticia);
		
		return NoticiaConverter.toNoticiaResponse(noticia);
	}

	@Override
	public void deleteById(Long id) {
		noticiaRepository.deleteById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public NoticiaResponse findById(Long id) {
		var noticia = noticiaRepository.findById(id).orElseThrow(()-> new EntityNotFoundException(
				String.format("Notícia não localizada %s", String.valueOf(id))));
		
		var noticiaResponse = NoticiaConverter.toNoticiaResponse(noticia);
		
		return noticiaResponse;
	}
}
