package com.etno.models.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.etno.models.repository.CidadeRepository;
import com.etno.models.repository.EventoRepository;
import com.etno.models.service.EventoService;
import com.etno.models.service.dto.converter.EventoConverter;
import com.etno.models.service.dto.request.EventoRequest;
import com.etno.models.service.dto.response.EventoResponse;
import com.etno.models.service.exception.EntityNotFoundException;

@Service
@Transactional
public class EventoServiceImpl implements EventoService{
	
	@Autowired
	private EventoRepository eventoRepository;
	
	@Autowired
	private CidadeRepository cidadeRepository;
	
	@Override
	public EventoResponse create(EventoRequest entity) {
		var evento = EventoConverter.toEvento(entity);
		
		var cidade = cidadeRepository.findById(entity.getCodCidade());
		
		evento.setCidade(cidade.get());
		evento.setLogradouroEvento(entity.getLogradouroEvento());
		evento.setBairroEvento(entity.getBairroEvento());
		evento.setNumeroEvento(entity.getNumeroEvento());
		evento.setCepEvento(entity.getCepEvento());
		evento.setDataHorarioInicioEvento(entity.getDataHorarioInicioEvento());
		evento.setDataHorarioFimEvento(entity.getDataHorarioFimEvento());

		evento = eventoRepository.saveAndFlush(evento);
		
		var eventoResponse = EventoConverter.toEventoResponse(evento);
		return eventoResponse;
	}

	@Override
	public EventoResponse update(Long id, EventoRequest entity) {
		var cidade = cidadeRepository.findById(entity.getCodCidade());
		
		var evento = eventoRepository.findById(id)
				.orElseThrow(
						()-> new EntityNotFoundException(
								String.format("Evento não localizado %s", 
								String.valueOf(id))));
		
		
		evento.setCidade(cidade.get());
		evento.setLogradouroEvento(entity.getLogradouroEvento());
		evento.setBairroEvento(entity.getBairroEvento());
		evento.setNumeroEvento(entity.getNumeroEvento());
		evento.setCepEvento(entity.getCepEvento());
		evento.setDataHorarioInicioEvento(entity.getDataHorarioInicioEvento());
		evento.setDataHorarioFimEvento(entity.getDataHorarioFimEvento());
		
		evento = eventoRepository.saveAndFlush(evento);
		
		return EventoConverter.toEventoResponse(evento);
	}

	@Override
	public void deleteById(Long id) {
		eventoRepository.deleteById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public EventoResponse findById(Long id) {
		var evento = eventoRepository.findById(id).orElseThrow(()-> new EntityNotFoundException(
				String.format("Evento não localizado %s", String.valueOf(id))));
		
		var eventoResponse = EventoConverter.toEventoResponse(evento);
		
		return eventoResponse;
	}
}
