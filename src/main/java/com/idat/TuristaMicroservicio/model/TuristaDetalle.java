package com.idat.TuristaMicroservicio.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="detalle_turista")
@Getter
@Setter
public class TuristaDetalle {
	
	@Id
	private TuristaHospedajeFK fk= new TuristaHospedajeFK();

}
