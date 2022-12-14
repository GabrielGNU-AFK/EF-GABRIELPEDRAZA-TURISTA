package com.idat.TuristaMicroservicio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.TuristaMicroservicio.model.Turista;

@Repository
public interface TuristaRepository extends JpaRepository<Turista, Integer> {

}
