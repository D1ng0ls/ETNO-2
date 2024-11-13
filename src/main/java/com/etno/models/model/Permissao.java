package com.etno.models.model;

import java.util.Objects;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "permissoes")
public class Permissao {
	private Long idPermissao;
	private String codPermissao;
	private String nomePermissao;
	private Set<Usuario> usuarios;
	
	public Permissao() {
		
	}

	public Permissao(Long idPermissao, String codPermissao, String nomePermissao) {
		this.idPermissao = idPermissao;
		this.codPermissao = codPermissao;
		this.nomePermissao = nomePermissao;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "idPermissao")
	public Long getIdPermissao() {
		return idPermissao;
	}

	public void setIdPermissao(Long idPermissao) {
		this.idPermissao = idPermissao;
	}
	
	@Column(name= "codPermissao", nullable = false)
	public String getCodPermissao() {
		return codPermissao;
	}

	public void setCodPermissao(String codPermissao) {
		this.codPermissao = codPermissao;
	}
	
	@Column(name= "nomePermissao")
	public String getNomePermissao() {
		return nomePermissao;
	}

	public void setNomePermissao(String nomePermissao) {
		this.nomePermissao = nomePermissao;
	}
	
	@ManyToMany(mappedBy = "permissoes")
	public Set<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Set<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idPermissao);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Permissao other = (Permissao) obj;
		return Objects.equals(idPermissao, other.idPermissao);
	}

	@Override
	public String toString() {
		return "Permissao [idPermissao=" + idPermissao + ", codPermissao=" + codPermissao + ", nomePermissao="
				+ nomePermissao + "]";
	}
	
	
}
