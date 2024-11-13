package com.etno.models.model;

import java.util.Objects;
import java.util.Set;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ETNO_EVENTO")
public class Evento extends Postagem {
	private String codEvento;
    private String logradouroEvento;
    private String numeroEvento;
    private String bairroEvento;
    private Long cepEvento;
    private LocalDateTime dataHorarioInicioEvento;
    private LocalDateTime dataHorarioFimEvento;
    private Cidade cidade;
    private Postagem postagem;
    private Set<Usuario> usuarios;

    public Evento() {}

    public Evento(String codEvento, String logradouroEvento, String numeroEvento, String bairroEvento, Long cepEvento,
                  LocalDateTime dataHorarioInicioEvento, LocalDateTime dataHorarioFimEvento) {
        this.codEvento = codEvento;
        this.logradouroEvento = logradouroEvento;
        this.numeroEvento = numeroEvento;
        this.bairroEvento = bairroEvento;
        this.cepEvento = cepEvento;
        this.dataHorarioInicioEvento = dataHorarioInicioEvento;
        this.dataHorarioFimEvento = dataHorarioFimEvento;
    }

    @Column(name = "COD_EVENTO", nullable = false)
    public String getCodEvento() {
        return codEvento;
    }

    public void setCodEvento(String codEvento) {
        this.codEvento = codEvento;
    }

    @Column(name = "LOGRADOURO_EVENTO")
    public String getLogradouroEvento() {
        return logradouroEvento;
    }

    public void setLogradouroEvento(String logradouroEvento) {
        this.logradouroEvento = logradouroEvento;
    }

    @Column(name = "NUMERO_EVENTO")
    public String getNumeroEvento() {
        return numeroEvento;
    }

    public void setNumeroEvento(String numeroEvento) {
        this.numeroEvento = numeroEvento;
    }

    @Column(name = "BAIRRO_EVENTO")
    public String getBairroEvento() {
        return bairroEvento;
    }

    public void setBairroEvento(String bairroEvento) {
        this.bairroEvento = bairroEvento;
    }

    @Column(name = "CEP_EVENTO")
    public Long getCepEvento() {
        return cepEvento;
    }

    public void setCepEvento(Long cepEvento) {
        this.cepEvento = cepEvento;
    }

    @Column(name = "DATA_HORARIO_INICIO_EVENTO")
    public LocalDateTime getDataHorarioInicioEvento() {
        return dataHorarioInicioEvento;
    }

    public void setDataHorarioInicioEvento(LocalDateTime dataHorarioInicioEvento) {
        this.dataHorarioInicioEvento = dataHorarioInicioEvento;
    }

    @Column(name = "DATA_HORARIO_FIM_EVENTO")
    public LocalDateTime getDataHorarioFimEvento() {
        return dataHorarioFimEvento;
    }

    public void setDataHorarioFimEvento(LocalDateTime dataHorarioFimEvento) {
        this.dataHorarioFimEvento = dataHorarioFimEvento;
    }

    @ManyToOne
    @JoinColumn(name = "FK_CIDADE_ID_CIDADE", referencedColumnName = "ID_CIDADE")
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
    
    @ManyToOne
    @JoinColumn(name = "FK_POSTAGEM_ID_POSTAGEM", referencedColumnName = "ID_POSTAGEM")
    public Postagem getPostagem() {
		return postagem;
	}

	public void setPostagem(Postagem postagem) {
		this.postagem = postagem;
	}

	@Override
    public int hashCode() {
        return Objects.hash(getIdPostagem());
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
        return Objects.equals(getIdPostagem(), other.getIdPostagem());
    }

    @Override
    public String toString() {
        return "Evento [codEvento=" + codEvento + ", logradouroEvento=" + logradouroEvento + ", numeroEvento="
                + numeroEvento + ", bairroEvento=" + bairroEvento + ", cepEvento=" + cepEvento
                + ", dataHorarioInicioEvento=" + dataHorarioInicioEvento + ", dataHorarioFimEvento="
                + dataHorarioFimEvento + "]";
    }
}
