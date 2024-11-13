package com.etno.models.service.dto.response;

public class NoticiaResponse {
	private String codNoticia;
	
	public NoticiaResponse() {
	}

	public NoticiaResponse(String codNoticia) {
		this.codNoticia = codNoticia;
	}

	public String getCodNoticia() {
		return codNoticia;
	}

	public void setCodNoticia(String codNoticia) {
		this.codNoticia = codNoticia;
	}

	@Override
	public String toString() {
		return "NoticiaRequest [codNoticia=" + codNoticia + "]";
	}
}
