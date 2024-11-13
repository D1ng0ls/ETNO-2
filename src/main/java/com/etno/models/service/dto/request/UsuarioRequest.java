package com.etno.models.service.dto.request;

public class UsuarioRequest {
	private Long idUsuario;
	private String codUsuario;
	private String nomeUsuario;
	private String emailUsuario;
	private String senhaUsuario;
	private String fotoUsuario;
	
	public UsuarioRequest() {
		
	}

	public UsuarioRequest(Long idUsuario, String codUsuario, String nomeUsuario, String emailUsuario, String senhaUsuario, String fotoUsuario) {
		this.idUsuario = idUsuario;
		this.codUsuario = codUsuario;
		this.nomeUsuario = nomeUsuario;
		this.emailUsuario = emailUsuario;
		this.senhaUsuario = senhaUsuario;
		this.fotoUsuario = fotoUsuario;
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

	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
	}

	public String getSenhaUsuario() {
		return senhaUsuario;
	}

	public void setSenhaUsuario(String senhaUsuario) {
		this.senhaUsuario = senhaUsuario;
	}

	public String getFotoUsuario() {
		return fotoUsuario;
	}

	public void setFotoUsuario(String fotoUsuario) {
		this.fotoUsuario = fotoUsuario;
	}

	@Override
	public String toString() {
		return "UsuarioRequest [idUsuario=" + idUsuario + ", codUsuario=" + codUsuario + ", nomeUsuario=" + nomeUsuario
				+ ", emailUsuario=" + emailUsuario + ", senhaUsuario=" + senhaUsuario + ", fotoUsuario=" + fotoUsuario
				+ "]";
	}
	
	
}
