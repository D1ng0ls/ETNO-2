package com.academico.models.model;

import java.util.List;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "CIDADE")

public class Cidade {
	private Long idCidade;
	private String codCidade;
	private String nomeCidade;
	private List<Usuario> usuarios;
	
	public Cidade() {
	}

	public Cidade(Long idCidade, String codCidade, String nomeCidade) {
		this.idCidade = idCidade;
		this.codCidade = codCidade;
		this.nomeCidade = nomeCidade;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CIDADE_SEQ")
	//@SequenceGenerator(sequenceName = "sequence_cidade", initialValue = 1, allocationSize = 1, name = "CIDADE_SEQ")
	@Column(name = "ID_CIDADE")

	public Long getIdCidade() {
		return idCidade;
	}

	public void setIdCidade(Long idCidade) {
		this.idCidade = idCidade;
	}

	@Column(name = "COD_CIDADE")
	
	public String getCodCidade() {
		return codCidade;
	}

	public void setCodCidade(String codCidade) {
		this.codCidade = codCidade;
	}
	
	@Column(name = "NOME_CIDADE")

	public String getNomeCidade() {
		return nomeCidade;
	}

	public void setNomeCidade(String nomeCidade) {
		this.nomeCidade = nomeCidade;
	}

	@OneToMany(mappedBy = "cidade") // Uma CIDADE para vários USUÁRIOS (mappeby, nome do atributo que aguarda a chave primaria Cidade em Usuario)
	
	public List<Usuario> getCidades() {
		return usuarios;
	}

	public void setCidades(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idCidade);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cidade other = (Cidade) obj;
		return Objects.equals(idCidade, other.idCidade);
	}

	@Override
	public String toString() {
		return "Cidade [idCidade=" + idCidade + ", codCidade=" + codCidade + ", nomeCidade=" + nomeCidade + "]";
	}	
}
