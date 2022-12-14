package com.idat.TuristaMicroservicio.service;

import java.util.List;

import com.idat.TuristaMicroservicio.dto.TuristaDTO;

public interface TuristaService {
	
	List<TuristaDTO> listar();
	void guardar(TuristaDTO turist);
	

}
