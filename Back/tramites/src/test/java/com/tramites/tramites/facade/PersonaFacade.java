package com.tramites.tramites.facade;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import com.tramites.tramites.repository.PersonaRepository;
import com.tramites.tramites.vo.Persona;

public class PersonaFacade {
	
	
	@Autowired
    private PersonaRepository personaRepository;
	
	
	public String crearPersona(Integer idTipoIdentificacion,	String numeroIdentificacion,	String nombres,	String apellidos,
			Integer telefono,	String direccion,	String email,	Integer idDependencia,	String fechaIngreso,	Integer idRol, String clave) {		
		
		Persona persona = new Persona();
        persona.setIdTipoIdentificacion(idTipoIdentificacion);
        persona.setNumeroIdentificacion(numeroIdentificacion);
        persona.setNombres(nombres);
        persona.setApellidos(apellidos);
        persona.setTelefono(telefono);
        persona.setDireccion(direccion);
        persona.setEmail(email);
        persona.setIdDependencia(idDependencia);
        persona.setFechaIngreso(fechaIngreso);
        persona.setIdRol(idRol);
        persona.setClave(clave);
		personaRepository.save(persona);        
        return "Persona creada correctamente";         
        
	}
	
	
	public Boolean consultaPersona(String numeroIdentificacion, String clave) {
		Persona persona = new Persona();
		persona = personaRepository.findByNumeroIdentificacion(numeroIdentificacion);
	    if(persona.getClave().equals(clave)) {
	    	return true;
	    }
	    else {
	    	return false;
	    }
		 		
	}
	
	
	

}
