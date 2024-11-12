package com.etno.models.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "evento")
public class Evento {
	private String codEvento;
	private String logradouroEvento;
	private String numeroEvento;
	private String bairroEvento;
	private Long cepEvento;
	private String dataHorarioInicioEvento;
	private String dataHorarioFimEvento;
	
	public Evento() {

	}

	public Evento(String codEvento, String logradouroEvento, String numeroEvento, String bairroEvento, Long cepEvento, String dataHorarioInicioEvento, String dataHorarioFimEvento) {
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
	public String getDataHorarioInicioEvento() {
		return dataHorarioInicioEvento;
	}

	public void setDataHorarioInicioEvento(String dataHorarioInicioEvento) {
		this.dataHorarioInicioEvento = dataHorarioInicioEvento;
	}
	
	@Column(name= "dataHorarioFimEvento")
	public String getDataHorarioFimEvento() {
		return dataHorarioFimEvento;
	}

	public void setDataHorarioFimEvento(String dataHorarioFimEvento) {
		this.dataHorarioFimEvento = dataHorarioFimEvento;
	}
	
	//sem o hash code pois ainda nao peguei a chave primaria, ela é uma chave estrangeira da tabela postagem

	@Override
	public String toString() {
		return "Evento [codEvento=" + codEvento + ", logradouroEvento=" + logradouroEvento + ", numeroEvento="
				+ numeroEvento + ", bairroEvento=" + bairroEvento + ", cepEvento=" + cepEvento
				+ ", dataHorarioInicioEvento=" + dataHorarioInicioEvento + ", dataHorarioFimEvento="
				+ dataHorarioFimEvento + "]";
	}
}
