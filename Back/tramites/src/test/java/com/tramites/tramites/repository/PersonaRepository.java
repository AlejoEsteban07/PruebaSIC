package com.tramites.tramites.repository;

import org.springframework.data.repository.CrudRepository;

import com.tramites.tramites.vo.Persona;

public interface PersonaRepository extends CrudRepository<Persona, Integer>{
	Persona findByNumeroIdentificacion(String numeroIdentificacion);

}
