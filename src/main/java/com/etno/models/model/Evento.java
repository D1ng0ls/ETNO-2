package com.etno.models.model;

import java.util.Objects;
import java.util.Set;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "evento")
public class Evento {
	private String codEvento;
	private String logradouroEvento;
	private String numeroEvento;
	private String bairroEvento;
	private Long cepEvento;
	private LocalDateTime  dataHorarioInicioEvento;
	private LocalDateTime  dataHorarioFimEvento;
	private Postagem postagem;
	private Cidade cidade;
	private Set<Usuario> usuarios;
	
	public Evento() {

	}

	public Evento(String codEvento, String logradouroEvento, String numeroEvento, String bairroEvento, Long cepEvento, LocalDateTime dataHorarioInicioEvento, LocalDateTime dataHorarioFimEvento) {
		this.codEvento = codEvento;
		this.logradouroEvento = logradouroEvento;
		this.numeroEvento = numeroEvento;
		this.bairroEvento = bairroEvento;
		this.cepEvento = cepEvento;
		this.dataHorarioInicioEvento = dataHorarioInicioEvento;
		this.dataHorarioFimEvento = dataHorarioFimEvento;
	}
	
	@Column(name= "codEvento", nullable = false)
	public String getCodEvento() {
		return codEvento;
	}

	public void setCodEvento(String codEvento) {
		this.codEvento = codEvento;
	}

	@Column(name= "logradouroEvento")
	public String getLogradouroEvento() {
		return logradouroEvento;
	}

	public void setLogradouroEvento(String logradouroEvento) {
		this.logradouroEvento = logradouroEvento;
	}

	@Column(name= "numeroEvento")
	public String getNumeroEvento() {
		return numeroEvento;
	}

	public void setNumeroEvento(String numeroEvento) {
		this.numeroEvento = numeroEvento;
	}

	@Column(name= "bairroEvento")
	public String getBairroEvento() {
		return bairroEvento;
	}

	public void setBairroEvento(String bairroEvento) {
		this.bairroEvento = bairroEvento;
	}
	
	@Column(name= "cepEvento")
	public Long getCepEvento() {
		return cepEvento;
	}

	public void setCepEvento(Long cepEvento) {
		this.cepEvento = cepEvento;
	}
	
	@Column(name= "dataHorarioInicioEvento")
	public LocalDateTime getDataHorarioInicioEvento() {
		return dataHorarioInicioEvento;
	}

	public void setDataHorarioInicioEvento(LocalDateTime dataHorarioInicioEvento) {
		this.dataHorarioInicioEvento = dataHorarioInicioEvento;
	}
	
	@Column(name= "dataHorarioFimEvento")
	public LocalDateTime getDataHorarioFimEvento() {
		return dataHorarioFimEvento;
	}

	public void setDataHorarioFimEvento(LocalDateTime dataHorarioFimEvento) {
		this.dataHorarioFimEvento = dataHorarioFimEvento;
	}
	
	@Id
	@MapsId
	@OneToOne
	@JoinColumn(name = "fk_Postagem_idPostagem", referencedColumnName = "idPostagem")
	public Postagem getPostagem() {
		return postagem;
	}

	public void setPostagem(Postagem postagem) {
		this.postagem = postagem;
	}
	
	@ManyToOne
	@JoinColumn(name = "fk_Cidade_idCidade", referencedColumnName = "idCidade")
	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	
	@ManyToMany(mappedBy = "eventos")
	public Set<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Set<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	@Override
	public int hashCode() {
		return Objects.hash(postagem);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Evento other = (Evento) obj;
		return Objects.equals(postagem, other.postagem);
	}

	@Override
	public String toString() {
		return "Evento [codEvento=" + codEvento + ", logradouroEvento=" + logradouroEvento + ", numeroEvento="
				+ numeroEvento + ", bairroEvento=" + bairroEvento + ", cepEvento=" + cepEvento
				+ ", dataHorarioInicioEvento=" + dataHorarioInicioEvento + ", dataHorarioFimEvento="
				+ dataHorarioFimEvento + "]";
	}
}
