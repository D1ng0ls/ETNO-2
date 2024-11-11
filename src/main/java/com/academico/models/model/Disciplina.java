package com.academico.models.model;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class Disciplina {
	private Long idDisciplina;
	private String codDisciplina;
	private String nomeDisciplina;
	private String periodo;
	
	public Disciplina() {
	}

	public Disciplina(Long idDisciplina, String codDisciplina, String nomeDisciplina, String periodo) {
		this.idDisciplina = idDisciplina;
		this.codDisciplina = codDisciplina;
		this.nomeDisciplina = nomeDisciplina;
		this.periodo = periodo;
	}
	
	@Id
	@Column(name = "ID_DISCIPLINA")

	public Long getIdDisciplina() {
		return idDisciplina;
	}

	public void setIdDisciplina(Long idDisciplina) {
		this.idDisciplina = idDisciplina;
	}
	
	@Column(name = "COD_DISCIPLINA")

	public String getCodDisciplina() {
		return codDisciplina;
	}

	public void setCodDisciplina(String codDisciplina) {
		this.codDisciplina = codDisciplina;
	}
	
	@Column(name = "NOME_DISCIPLINA")

	public String getNomeDisciplina() {
		return nomeDisciplina;
	}

	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idDisciplina);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disciplina other = (Disciplina) obj;
		return Objects.equals(idDisciplina, other.idDisciplina);
	}

	@Override
	public String toString() {
		return "Disciplina [idDisciplina=" + idDisciplina + ", codDisciplina=" + codDisciplina + ", nomeDisciplina="
				+ nomeDisciplina + ", periodo=" + periodo + "]";
	}	
}
