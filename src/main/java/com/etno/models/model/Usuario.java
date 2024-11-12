package com.etno.models.model;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {
	private Long idUsuario;
	private String codUsuario;
	private String nomeUsuario;
	private String emailUsuario;
	private String senhaUsuario;
	private String fotoUsuario;
	
	
	public Usuario() {
		
	}

	public Usuario(Long idUsuario, String codUsuario, String nomeUsuario, String emailUsuario, String senhaUsuario,String fotoUsuario) {
		this.idUsuario = idUsuario;
		this.codUsuario = codUsuario;
		this.nomeUsuario = nomeUsuario;
		this.emailUsuario = emailUsuario;
		this.senhaUsuario = senhaUsuario;
		this.fotoUsuario = fotoUsuario;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "idUsuario")
	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	@Column(name= "codUsuario", nullable = false)
	public String getCodUsuario() {
		return codUsuario;
	}

	public void setCodUsuario(String codUsuario) {
		this.codUsuario = codUsuario;
	}

	@Column(name= "nomeUsuario")
	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	
	@Column(name= "emailUsuario")
	public String getEmailUsuario() {
		return emailUsuario;
	}

	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
	}
	
	@Column(name= "senhaUsuario")
	public String getSenhaUsuario() {
		return senhaUsuario;
	}

	public void setSenhaUsuario(String senhaUsuario) {
		this.senhaUsuario = senhaUsuario;
	}
	
	@Column(name= "fotoUsuario")
	public String getFotoUsuario() {
		return fotoUsuario;
	}

	public void setFotoUsuario(String fotoUsuario) {
		this.fotoUsuario = fotoUsuario;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idUsuario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(idUsuario, other.idUsuario);
	}

	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", codUsuario=" + codUsuario + ", nomeUsuario=" + nomeUsuario
				+ ", emailUsuario=" + emailUsuario + ", senhaUsuario=" + senhaUsuario + ", fotoUsuario=" + fotoUsuario
				+ "]";
	}
	
}