package com.etno.models.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.etno.models.repository.CidadeRepository;
import com.etno.models.service.CidadeService;
import com.etno.models.service.dto.converter.CidadeConverter;
import com.etno.models.service.dto.request.CidadeRequest;
import com.etno.models.service.dto.response.CidadeResponse;
import com.etno.models.service.exception.EntityNotFoundException;

@Service
@Transactional
public class CidadeServiceImpl implements CidadeService {
	
	@Autowired
	private CidadeRepository cidadeRepository;
	
	@Override
	public CidadeResponse create(CidadeRequest entity) {
		var cidade = CidadeConverter.toCidade(entity);
		
		cidade.setNomeCidade(entity.getNomeCidade());
		cidade.setCodCidade(entity.getCodCidade());
		cidade = cidadeRepository.saveAndFlush(cidade);
		
		var cidadeResponse = CidadeConverter.toCidadeResponse(cidade);
		return cidadeResponse;
	}

	@Override
	public CidadeResponse update(Long id, CidadeRequest entity) {
		var cidade = cidadeRepository.findById(id)
				.orElseThrow(
						()-> new EntityNotFoundException(
								String.format("Cidade não localizada %s", 
								String.valueOf(id))));
		
		
		cidade.setNomeCidade(entity.getNomeCidade());
		cidade.setCodCidade(entity.getCodCidade());
		cidade = cidadeRepository.saveAndFlush(cidade);
		
		return CidadeConverter.toCidadeResponse(cidade);
	}

	@Override
	public void deleteById(Long id) {
		cidadeRepository.deleteById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public CidadeResponse findById(Long id) {
		var cidade = cidadeRepository.findById(id).orElseThrow(()-> new EntityNotFoundException(
				String.format("Cidade não localizada %s", String.valueOf(id))));
		
		var cidadeResponse = CidadeConverter.toCidadeResponse(cidade);
		
		return cidadeResponse;
	}
}
