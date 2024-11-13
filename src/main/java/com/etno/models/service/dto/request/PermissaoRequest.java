package com.etno.models.service.dto.request;

public class PermissaoRequest {
	private Long idPermissao;
	private String codPermissao;
	private String nomePermissao;
	
	public PermissaoRequest() {
		
	}

	public PermissaoRequest(Long idPermissao, String codPermissao, String nomePermissao) {
		this.idPermissao = idPermissao;
		this.codPermissao = codPermissao;
		this.nomePermissao = nomePermissao;
	}

	public Long getIdPermissao() {
		return idPermissao;
	}

	public void setIdPermissao(Long idPermissao) {
		this.idPermissao = idPermissao;
	}

	public String getCodPermissao() {
		return codPermissao;
	}

	public void setCodPermissao(String codPermissao) {
		this.codPermissao = codPermissao;
	}

	public String getNomePermissao() {
		return nomePermissao;
	}

	public void setNomePermissao(String nomePermissao) {
		this.nomePermissao = nomePermissao;
	}

	@Override
	public String toString() {
		return "PermissaoRequest [idPermissao=" + idPermissao + ", codPermissao=" + codPermissao + ", nomePermissao="
				+ nomePermissao + "]";
	}
}