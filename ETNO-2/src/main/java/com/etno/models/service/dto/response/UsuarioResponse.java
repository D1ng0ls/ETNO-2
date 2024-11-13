package com.etno.models.service.dto.response;

public class UsuarioResponse {
	private Long idUsuario;
	private String codUsuario;
	private String nomeUsuario;
	private String emailUsuario;
	
	public UsuarioResponse() {
		
	}

	public UsuarioResponse(Long idUsuario, String codUsuario, String nomeUsuario, String emailUsuario) {
		this.idUsuario = idUsuario;
		this.codUsuario = codUsuario;
		this.nomeUsuario = nomeUsuario;
		this.emailUsuario = emailUsuario;
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getCodUsuario() {
		return codUsuario;
	}

	public void setCodUsuario(String codUsuario) {
		this.codUsuario = codUsuario;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getEmailUsuario() {
		return emailUsuario;
	}

	public void setEmail(String emailUsuario) {
		this.emailUsuario = emailUsuario;
	}

	@Override
	public String toString() {
		return "UsuarioResponse [idUsuario=" + idUsuario + ", codUsuario=" + codUsuario + ", nomeUsuario=" + nomeUsuario
				+ ", email=" + emailUsuario + "]";
	}
	
	
}
