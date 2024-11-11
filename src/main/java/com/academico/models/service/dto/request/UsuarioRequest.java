package com.academico.models.service.dto.request;

import com.academico.models.model.Cidade;

public class UsuarioRequest {
	
	private Long idUsuario;
	private String codUsuario;
	private String nomeUsuario;
	private String email;
	private String senha;
	private String foto;
	private Integer tipo;
	private Long codigoCidade;
	private Integer idade;
	
	public UsuarioRequest() {
	}

	public UsuarioRequest(Long idUsuario, String codUsuario, String nomeUsuario, String email, String senha,
			String foto, Integer tipo, Long codigoCidade, Integer idade) {
		this.idUsuario = idUsuario;
		this.codUsuario = codUsuario;
		this.nomeUsuario = nomeUsuario;
		this.email = email;
		this.senha = senha;
		this.foto = foto;
		this.tipo = tipo;
		this.codigoCidade = codigoCidade;
		this.idade = idade;
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getCodUsuario() {
		return codUsuario;
	}

	public void setCodUsuario(String codUsuario) {
		this.codUsuario = codUsuario;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public Integer getTipo() {
		return tipo;
	}

	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}

	public Long getCodigoCidade() {
		return codigoCidade;
	}

	public void setCidade(Long codigoCidade) {
		this.codigoCidade = codigoCidade;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "UsuarioRequest [idUsuario=" + idUsuario + ", codUsuario=" + codUsuario + ", nomeUsuario=" + nomeUsuario
				+ ", email=" + email + ", senha=" + senha + ", foto=" + foto + ", tipo=" + tipo + ", cidade=" + codigoCidade
				+ ", idade=" + idade + "]";
	}
}
