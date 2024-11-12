package com.etno.models.service.exception;

// Tratar erros do negócio (sistema acadêmico)

public class NegocioException extends RuntimeException {

	private static final long serialVersionUID = -7765486624997328081L;
	
	// Construtores

	public NegocioException(String message) {
		super(message);
	}

	public NegocioException(String message, Throwable cause) {
		super(message, cause);
	}
}
