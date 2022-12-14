package com.idat.TuristaMicroservicio.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
public class TuristaHospedajeFK implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -880860275590647835L;

	/**
	 * 
	 */
	
	
	
	@Column(name="id_turista",nullable = false)
	private int idTurista;
	
	@Column(name="id_hospedaje",nullable = false)
	private int idHospedaje;
	

}
