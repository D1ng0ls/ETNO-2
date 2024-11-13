package com.etno.models.model;

import java.util.List;
import java.util.Objects;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.JoinColumn;

@Entity
@Table(name = "ETNO_USUARIO")
public class Usuario {
	private Long idUsuario;
	private String codUsuario;
	private String nomeUsuario;
	private String emailUsuario;
	private String senhaUsuario;
	private String fotoUsuario;
	private List<Postagem> postagens;
	private Set<Permissao> permissoes;
	private Set<Evento> eventos;
	
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
	@Column(name= "ID_USUARIO")
	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	@Column(name= "COD_USUARIO", nullable = false)
	public String getCodUsuario() {
		return codUsuario;
	}

	public void setCodUsuario(String codUsuario) {
		this.codUsuario = codUsuario;
	}

	@Column(name= "NOME_USUARIO")
	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	
	@Column(name= "EMAIL_USUARIO")
	public String getEmailUsuario() {
		return emailUsuario;
	}

	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
	}
	
	@Column(name= "SENHA_USUARIO")
	public String getSenhaUsuario() {
		return senhaUsuario;
	}

	public void setSenhaUsuario(String senhaUsuario) {
		this.senhaUsuario = senhaUsuario;
	}
	
	@Column(name= "FOTO_USUARIO")
	public String getFotoUsuario() {
		return fotoUsuario;
	}

	public void setFotoUsuario(String fotoUsuario) {
		this.fotoUsuario = fotoUsuario;
	}
	
	@OneToMany(mappedBy = "usuario")
	public List<Postagem> getPostagens() {
		return postagens;
	}

	public void setPostagens(List<Postagem> postagens) {
		this.postagens = postagens;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idUsuario);							
	}
	
	@ManyToMany
	@JoinTable(
	    name = "ETNO_USUARIO_EVENTO",
	    joinColumns = @JoinColumn(name = "FK_USUARIO_ID_USUARIO"),
	    inverseJoinColumns = @JoinColumn(name = "FK_EVENTO_FK_POSTAGEM_ID_POSTAGEM")
	)
	public Set<Evento> getEventos() {
		return eventos;
	}

	public void setEventos(Set<Evento> eventos) {
		this.eventos = eventos;
	}

	@ManyToMany
	@JoinTable(
	    name = "ETNO_USUARIO_PERMISSAO",
	    joinColumns = @JoinColumn(name = "FK_USUARIO_ID_USUARIO"),
	    inverseJoinColumns = @JoinColumn(name = "FK_PERMISSAO_ID_PERMISSAO")
	)
	public Set<Permissao> getPermissoes() {
		return permissoes;
	}

	public void setPermissoes(Set<Permissao> permissoes) {
		this.permissoes = permissoes;
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