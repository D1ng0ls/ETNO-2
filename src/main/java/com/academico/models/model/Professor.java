package com.academico.models.model;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "PROFESSOR")

public class Professor {
	private Long idProfessor;
	private String codProfessor;
	private String nomeProfessor;
	private Usuario usuario;
	
	public Professor() {
	}

	public Professor(Long idProfessor, String codProfessor, String nomeProfessor, Usuario usuario) {
		this.idProfessor = idProfessor;
		this.codProfessor = codProfessor;
		this.nomeProfessor = nomeProfessor;
		this.usuario = usuario;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PROFESSOR_SEQ")
	//@SequenceGenerator(sequenceName = "sequence_professor", initialValue = 1, allocationSize = 1, name = "PROFESSOR_SEQ")
	@Column(name = "ID_PROFESSOR")
	
	public Long getIdProfessor() {
		return idProfessor;
	}

	public void setIdProfessor(Long idProfessor) {
		this.idProfessor = idProfessor;
	}
	
	@Column(name = "COD_PROFESSOR")

	public String getCodProfessor() {
		return codProfessor;
	}

	public void setCodProfessor(String codProfessor) {
		this.codProfessor = codProfessor;
	}
	
	@Column(name = "NOME_PROFESSOR")

	public String getNomeProfessor() {
		return nomeProfessor;
	}

	public void setNomeProfessor(String nomeProfessor) {
		this.nomeProfessor = nomeProfessor;
	}
	
	@MapsId
	@OneToOne
	@JoinColumn(name = "ID_USUARIO", referencedColumnName = "ID_USUARIO")

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idProfessor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Professor other = (Professor) obj;
		return Objects.equals(idProfessor, other.idProfessor);
	}

	@Override
	public String toString() {
		return "Professor [idProfessor=" + idProfessor + ", codProfessor=" + codProfessor + ", nomeProfessor="
				+ nomeProfessor + ", usuario=" + usuario + "]";
	}
	
	
	
	
	
}
