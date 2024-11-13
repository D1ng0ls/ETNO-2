package com.etno.models.service.dto.request;

import java.time.LocalDateTime;

public class PostagemRequest {
	private Long idPostagem;
	private String codPostagem;
	private String tituloPostagem;
	private LocalDateTime dataPostagem;
	private String imagemPostagem;
	private String urlPostagem;
	private Integer tipoPostagem;
	private Long codUsuario;
	
	public PostagemRequest() {

	}

	public PostagemRequest(Long idPostagem, String codPostagem, String tituloPostagem, LocalDateTime dataPostagem, String imagemPostagem, String urlPostagem, Integer tipoPostagem, Long codUsuario) {
		this.idPostagem = idPostagem;
		this.codPostagem = codPostagem;
		this.tituloPostagem = tituloPostagem;
		this.dataPostagem = dataPostagem;
		this.imagemPostagem = imagemPostagem;
		this.urlPostagem = urlPostagem;
		this.tipoPostagem = tipoPostagem;
		this.codUsuario = codUsuario;
	}

	public Long getIdPostagem() {
		return idPostagem;
	}

	public void setIdPostagem(Long idPostagem) {
		this.idPostagem = idPostagem;
	}

	public String getCodPostagem() {
		return codPostagem;
	}

	public void setCodPostagem(String codPostagem) {
		this.codPostagem = codPostagem;
	}

	public String getTituloPostagem() {
		return tituloPostagem;
	}

	public void setTituloPostagem(String tituloPostagem) {
		this.tituloPostagem = tituloPostagem;
	}

	public LocalDateTime getDataPostagem() {
		return dataPostagem;
	}

	public void setDataPostagem(LocalDateTime dataPostagem) {
		this.dataPostagem = dataPostagem;
	}

	public String getImagemPostagem() {
		return imagemPostagem;
	}

	public void setImagemPostagem(String imagemPostagem) {
		this.imagemPostagem = imagemPostagem;
	}

	public String getUrlPostagem() {
		return urlPostagem;
	}

	public void setUrlPostagem(String urlPostagem) {
		this.urlPostagem = urlPostagem;
	}

	public Integer getTipoPostagem() {
		return tipoPostagem;
	}

	public void setTipoPostagem(Integer tipoPostagem) {
		this.tipoPostagem = tipoPostagem;
	}

	public Long getCodUsuario() {
		return codUsuario;
	}

	public void setCodUsuario(Long codUsuario) {
		this.codUsuario = codUsuario;
	}

	@Override
	public String toString() {
		return "PostagemRequest [idPostagem=" + idPostagem + ", codPostagem=" + codPostagem + ", tituloPostagem="
				+ tituloPostagem + ", dataPostagem=" + dataPostagem + ", imagemPostagem=" + imagemPostagem
				+ ", urlPostagem=" + urlPostagem + ", tipoPostagem=" + tipoPostagem + ", codUsuario=" + codUsuario
				+ "]";
	}
	
	
}
