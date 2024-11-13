package com.etno.models.service.dto.request;

public class CidadeRequest {
	private Long idCidade;
	private String codCidade;
	private String nomeCidade;
	
	public CidadeRequest() {
		
	}

	public CidadeRequest(Long idCidade, String codCidade, String nomeCidade) {
		this.idCidade = idCidade;
		this.codCidade = codCidade;
		this.nomeCidade = nomeCidade;
	}

	public Long getIdCidade() {
		return idCidade;
	}

	public void setIdCidade(Long idCidade) {
		this.idCidade = idCidade;
	}

	public String getCodCidade() {
		return codCidade;
	}

	public void setCodCidade(String codCidade) {
		this.codCidade = codCidade;
	}

	public String getNomeCidade() {
		return nomeCidade;
	}

	public void setNomeCidade(String nomeCidade) {
		this.nomeCidade = nomeCidade;
	}

	@Override
	public String toString() {
		return "CidadeRequest [idCidade=" + idCidade + ", codCidade=" + codCidade + ", nomeCidade=" + nomeCidade + "]";
	}
}
