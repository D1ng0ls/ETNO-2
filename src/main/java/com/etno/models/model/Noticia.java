package com.etno.models.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "noticia")
public class Noticia {
	private String codNoticia;

	public Noticia() {
		
	}

	public Noticia(String codNoticia) {
		this.codNoticia = codNoticia;
	}
	
	@Column(name= "codNoticia", nullable = false)
	public String getCodNoticia() {
		return codNoticia;
	}

	public void setCodNoticia(String codNoticia) {
		this.codNoticia = codNoticia;
	}

	//sem o hash code pois ainda nao peguei a chave primaria, ela é uma chave estrangeira da tabela postagem

	@Override
	public String toString() {
		return "Noticia [codNoticia=" + codNoticia + "]";
	}
}
