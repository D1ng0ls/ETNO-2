package com.academico.models.model;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity // Objt/Entidade que está na memória que será persistido.
@Table(name = "USUARIO") // Qual tabela fisica armazena o usuario.

public class Usuario {
	
	private Long idUsuario;
	private String codUsuario;
	private String nomeUsuario;
	private String email;
	private String senha;
	private String foto;
	private Integer tipo;
	private Cidade cidade;
	private Professor professor;
	private Aluno aluno;
	
	public Usuario() {

	}
	
	public Usuario(Long idUsuario, String codUsuario, String nomeUsuario, String email, String senha, String foto, Integer tipo) {
		this.idUsuario = idUsuario;
		this.codUsuario = codUsuario;
		this.nomeUsuario = nomeUsuario;
		this.email = email;
		this.senha = senha;
		this.foto = foto;
		this.tipo = tipo;
	}
	
	@Id // Referencia o ID	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	// @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "USUARIO_SEQ") // Como o banco esta gerenciando a geração de chaves primárias
	// @SequenceGenerator(sequenceName = "sequence_usuario", initialValue = 1, allocationSize = 1, name = "USUARIO_SEQ")
	@Column(name = "ID_USUARIO")
	
	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	@Column(name = "COD_USUARIO")

	public String getCodUsuario() {
		return codUsuario;
	}

	public void setCodUsuario(String codUsuario) {
		this.codUsuario = codUsuario;
	}
	
	@Column(name = "NOME_USUARIO")

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	
	@Column(name = "EMAIL")

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Column(name = "SENHA")

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	@Column(name = "FOTO")

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}
	
	@Column(name = "TIPO", nullable = false)

	public Integer getTipo() {
		return tipo;
	}

	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}

	@ManyToOne // Muitos USUARIOS para uma CIDADE
	@JoinColumn(name = "ID_CIDADE", referencedColumnName = "ID_CIDADE") // Junta as tabelas (tabela que receba a chave estrangeira)
	
	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	
	@OneToOne(mappedBy = "usuario")
	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	@OneToOne(mappedBy = "usuario")

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
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
		return "Usuario [codUsuario=" + codUsuario + ", nomeUsuario=" + nomeUsuario + ", email=" + email + ", senha="
				+ senha + ", foto=" + foto + ", tipo=" + tipo + "]";
	}
	
	
	
	
	
	
	
	// private (encapsulamento): essas classes nao conseguem ser acessadas diretamente
	// Os 'privates' de uma classe não podem ser acessados por outras classes
	/*
	private Long id;
	private String username;
	private String email;
	private String password;
	
	
	
	public Usuario() {
	}

	public Usuario(Long id, String username, String email, String password) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", username=" + username + ", email=" + email + ", password=" + password + "]";
	}	*/
}
