package com.etno.models.service.dto.request;

import java.time.LocalDateTime;


public class EventoRequest {
	private String codEvento;
	private String logradouroEvento;
	private String numeroEvento;
	private String bairroEvento;
	private Long cepEvento;
	private LocalDateTime dataHorarioInicioEvento;
	private LocalDateTime dataHorarioFimEvento;
	private Long codPostagem;
	private Long codCidade;
	
	public EventoRequest() {

	}

	public EventoRequest(String codEvento, String logradouroEvento, String numeroEvento, String bairroEvento,
			Long cepEvento, LocalDateTime dataHorarioInicioEvento, LocalDateTime dataHorarioFimEvento, Long codPostagem,
			Long codCidade) {

		this.codEvento = codEvento;
		this.logradouroEvento = logradouroEvento;
		this.numeroEvento = numeroEvento;
		this.bairroEvento = bairroEvento;
		this.cepEvento = cepEvento;
		this.dataHorarioInicioEvento = dataHorarioInicioEvento;
		this.dataHorarioFimEvento = dataHorarioFimEvento;
		this.codPostagem = codPostagem;
		this.codCidade = codCidade;
	}

	public String getCodEvento() {
		return codEvento;
	}

	public void setCodEvento(String codEvento) {
		this.codEvento = codEvento;
	}

	public String getLogradouroEvento() {
		return logradouroEvento;
	}

	public void setLogradouroEvento(String logradouroEvento) {
		this.logradouroEvento = logradouroEvento;
	}

	public String getNumeroEvento() {
		return numeroEvento;
	}

	public void setNumeroEvento(String numeroEvento) {
		this.numeroEvento = numeroEvento;
	}

	public String getBairroEvento() {
		return bairroEvento;
	}

	public void setBairroEvento(String bairroEvento) {
		this.bairroEvento = bairroEvento;
	}

	public Long getCepEvento() {
		return cepEvento;
	}

	public void setCepEvento(Long cepEvento) {
		this.cepEvento = cepEvento;
	}

	public LocalDateTime getDataHorarioInicioEvento() {
		return dataHorarioInicioEvento;
	}

	public void setDataHorarioInicioEvento(LocalDateTime dataHorarioInicioEvento) {
		this.dataHorarioInicioEvento = dataHorarioInicioEvento;
	}

	public LocalDateTime getDataHorarioFimEvento() {
		return dataHorarioFimEvento;
	}

	public void setDataHorarioFimEvento(LocalDateTime dataHorarioFimEvento) {
		this.dataHorarioFimEvento = dataHorarioFimEvento;
	}

	public Long getCodPostagem() {
		return codPostagem;
	}

	public void setCodPostagem(Long codPostagem) {
		this.codPostagem = codPostagem;
	}

	public Long getCodCidade() {
		return codCidade;
	}

	public void setCodCidade(Long codCidade) {
		this.codCidade = codCidade;
	}

	@Override
	public String toString() {
		return "EventoRequest [codEvento=" + codEvento + ", logradouroEvento=" + logradouroEvento + ", numeroEvento="
				+ numeroEvento + ", bairroEvento=" + bairroEvento + ", cepEvento=" + cepEvento
				+ ", dataHorarioInicioEvento=" + dataHorarioInicioEvento + ", dataHorarioFimEvento="
				+ dataHorarioFimEvento + ", codPostagem=" + codPostagem + ", codCidade=" + codCidade + "]";
	}
}
