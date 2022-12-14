package com.idat.TuristaMicroservicio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.TuristaMicroservicio.model.TuristaDetalle;

@Repository
public interface DetalleTuristaRepository  extends JpaRepository<TuristaDetalle, Integer>{

}
