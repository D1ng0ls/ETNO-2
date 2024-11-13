package com.etno.models.service.exception;

// Tratamento de erro não encontrado

public class EntityNotFoundException extends NegocioException {

	private static final long serialVersionUID = 3259249954242083756L;

	public EntityNotFoundException(String message) {
		super(message);
	}
}
