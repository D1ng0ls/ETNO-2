package com.etno.models.model;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ETNO_NOTICIA")
public class Noticia extends Postagem {
    private String codNoticia;
    private Postagem postagem;

    public Noticia() {}

    public Noticia(String codNoticia) {
        this.codNoticia = codNoticia;
    }

    @Column(name = "COD_NOTICIA", nullable = false)
    public String getCodNoticia() {
        return codNoticia;
    }

    public void setCodNoticia(String codNoticia) {
        this.codNoticia = codNoticia;
    }
    
    @ManyToOne
    @JoinColumn(name = "FK_POSTAGEM_ID_POSTAGEM", referencedColumnName = "ID_POSTAGEM")
    public Postagem getPostagem() {
		return postagem;
	}

	public void setPostagem(Postagem postagem) {
		this.postagem = postagem;
	}

    @Override
    public String toString() {
        return "Noticia [codNoticia=" + codNoticia + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(codNoticia);
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Noticia other = (Noticia) obj;
        return Objects.equals(codNoticia, other.codNoticia);
    }
}