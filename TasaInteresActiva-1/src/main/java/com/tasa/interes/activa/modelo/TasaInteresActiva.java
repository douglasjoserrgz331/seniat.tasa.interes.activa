package com.tasa.interes.activa.modelo;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="interesactiva", schema = "int-actv")
public class TasaInteresActiva {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="fecha_inicio")
	private Date fechaInicio;
	
	@Column(name="fecha_fin")
	private Date fechaFin;
	
	@Column(name="valor_tasa")
	private BigDecimal valorTasa;
	
	public TasaInteresActiva() {
		// TODO Auto-generated constructor stub
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public BigDecimal getValorTasa() {
		return valorTasa;
	}

	public void setValorTasa(BigDecimal valorTasa) {
		this.valorTasa = valorTasa;
	}

	public TasaInteresActiva(Long id, Date fechaInicio, Date fechaFin, BigDecimal valorTasa) {
		super();
		this.id = id;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.valorTasa = valorTasa;
	}
}
