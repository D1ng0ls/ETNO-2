package com.etno.models.model;

import java.util.Objects;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ETNO_POSTAGEM")
@Inheritance(strategy = InheritanceType.JOINED)
public class Postagem {
	private Long idPostagem;
	private String codPostagem;
	private String tituloPostagem;
	private LocalDateTime dataPostagem;
	private String imagemPostagem;
	private String urlPostagem;
	private Integer tipoPostagem;
	private Evento evento;
	private Noticia noticia;
	private Usuario usuario;
	
	public Postagem() {
		
	}

	public Postagem(Long idPostagem, String codPostagem, String tituloPostagem, LocalDateTime dataPostagem, String imagemPostagem, String urlPostagem, Integer tipoPostagem) {
		this.idPostagem = idPostagem;
		this.codPostagem = codPostagem;
		this.tituloPostagem = tituloPostagem;
		this.dataPostagem = dataPostagem;
		this.imagemPostagem = imagemPostagem;
		this.urlPostagem = urlPostagem;
		this.tipoPostagem = tipoPostagem;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "ID_POSTAGEM")
	public Long getIdPostagem() {
		return idPostagem;
	}

	public void setIdPostagem(Long idPostagem) {
		this.idPostagem = idPostagem;
	}
	
	@Column(name= "COD_POSTAGEM", nullable = false)
	public String getCodPostagem() {
		return codPostagem;
	}

	public void setCodPostagem(String codPostagem) {
		this.codPostagem = codPostagem;
	}
	
	@Column(name= "TITULO_POSTAGEM")
	public String getTituloPostagem() {
		return tituloPostagem;
	}
	
	public void setTituloPostagem(String tituloPostagem) {
		this.tituloPostagem = tituloPostagem;
	}

	@Column(name= "DATA_POSTAGEM")
	public LocalDateTime getDataPostagem() {
		return dataPostagem;
	}

	public void setDataPostagem(LocalDateTime dataPostagem) {
		this.dataPostagem = dataPostagem;
	}
	
	@Column(name= "IMAGEM_POSTAGEM")
	public String getImagemPostagem() {
		return imagemPostagem;
	}

	public void setImagemPostagem(String imagemPostagem) {
		this.imagemPostagem = imagemPostagem;
	}
	
	@Column(name= "URL_POSTAGEM")
	public String getUrlPostagem() {
		return urlPostagem;
	}

	public void setUrlPostagem(String urlPostagem) {
		this.urlPostagem = urlPostagem;
	}
	
	@Column(name= "TIPO_POSTAGEM")
	public Integer getTipoPostagem() {
		return tipoPostagem;
	}

	public void setTipoPostagem(Integer tipoPostagem) {
		this.tipoPostagem = tipoPostagem;
	}
	
	@OneToOne(mappedBy = "postagem")
	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}
	
	@OneToOne(mappedBy = "postagem")
	public Noticia getNoticia() {
		return noticia;
	}

	public void setNoticia(Noticia noticia) {
		this.noticia = noticia;
	}
	
	@ManyToOne
	@JoinColumn(name = "FK_USUARIO_ID_USUARIO", referencedColumnName = "ID_USUARIO")
	public Usuario getUsuario() {
		return usuario;
	}
	
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(idPostagem);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Postagem other = (Postagem) obj;
		return Objects.equals(idPostagem, other.idPostagem);
	}

	@Override
	public String toString() {
		return "Postagem [idPostagem=" + idPostagem + ", codPostagem=" + codPostagem + ", tituloPostagem="
				+ tituloPostagem + ", dataPostagem=" + dataPostagem + ", imagemPostagem=" + imagemPostagem
				+ ", urlPostagem=" + urlPostagem + ", tipoPostagem=" + tipoPostagem + "]";
	}
	
	
}
