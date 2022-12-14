package com.idat.TuristaMicroservicio.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.idat.TuristaMicroservicio.dto.TuristaDTO;
import com.idat.TuristaMicroservicio.model.Turista;
import com.idat.TuristaMicroservicio.repository.TuristaRepository;

@Service
public class TuristaServiceImpl  implements TuristaService{
	
	@Autowired
	private TuristaRepository repository;

	@Override
	public List<TuristaDTO> listar() {
		
		List<Turista> lista=repository.findAll();
		List<TuristaDTO> listadto= new ArrayList<>();
		TuristaDTO dto=null;
		for(Turista tur: lista) {
			dto=new TuristaDTO();
			dto.setIdtur(tur.getIdTurista());
			dto.setNomtur(tur.getNombreTurista());
			dto.setNrocel(tur.getNroCelular());
			dto.setDirecc(tur.getDireccion());
			listadto.add(dto);
			
		}
		
		return listadto;
	}

	@Override
	public void guardar(TuristaDTO turist) {
		Turista tur= new Turista();
		tur.setIdTurista(turist.getIdtur());
		tur.setNombreTurista(turist.getNomtur());
		tur.setDireccion(turist.getDirecc());
		tur.setNroCelular(turist.getNrocel());
		
		
	}

}
