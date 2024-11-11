package com.academico.models.model;

import java.util.Objects;

public class Avaliacao {
	private Long idAvaliacao;
	private String codAvaliacao;
	private String descricao;
	
	public Avaliacao() {
	}

	public Avaliacao(Long idAvaliacao, String codAvaliacao, String descricao) {
		this.idAvaliacao = idAvaliacao;
		this.codAvaliacao = codAvaliacao;
		this.descricao = descricao;
	}

	public Long getIdAvaliacao() {
		return idAvaliacao;
	}

	public void setIdAvaliacao(Long idAvaliacao) {
		this.idAvaliacao = idAvaliacao;
	}

	public String getCodAvaliacao() {
		return codAvaliacao;
	}

	public void setCodAvaliacao(String codAvaliacao) {
		this.codAvaliacao = codAvaliacao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idAvaliacao);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Avaliacao other = (Avaliacao) obj;
		return Objects.equals(idAvaliacao, other.idAvaliacao);
	}

	@Override
	public String toString() {
		return "Avaliacao [idAvaliacao=" + idAvaliacao + ", codAvaliacao=" + codAvaliacao + ", descricao=" + descricao
				+ "]";
	}	
}
