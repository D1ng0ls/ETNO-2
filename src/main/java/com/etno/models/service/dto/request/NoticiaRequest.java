package com.etno.models.service.dto.request;

public class NoticiaRequest {
	private String codNoticia;
	
	public NoticiaRequest() {
		
	}

	public NoticiaRequest(String codNoticia) {

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
