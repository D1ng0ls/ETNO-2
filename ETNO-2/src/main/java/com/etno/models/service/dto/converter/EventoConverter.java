package com.etno.models.service.dto.converter;

import com.etno.models.model.Evento;
import com.etno.models.service.dto.request.EventoRequest;
import com.etno.models.service.dto.response.EventoResponse;

public class EventoConverter {
	public static Evento toEvento(EventoRequest eventoRequest) {
		return new Evento(
					eventoRequest.getCodEvento(),
					eventoRequest.getLogradouroEvento(),
					eventoRequest.getNumeroEvento(),
					eventoRequest.getBairroEvento(),
					eventoRequest.getCepEvento(),
					eventoRequest.getDataHorarioInicioEvento(),
					eventoRequest.getDataHorarioFimEvento()
				);
	}
	
	public static EventoResponse toEventoResponse(Evento evento) {
		return new EventoResponse(
					evento.getCodEvento(),
					evento.getLogradouroEvento(),
					evento.getNumeroEvento(),
					evento.getBairroEvento(),
					evento.getCepEvento(),
					evento.getDataHorarioInicioEvento(),
					evento.getDataHorarioFimEvento()
				);
	}
}
