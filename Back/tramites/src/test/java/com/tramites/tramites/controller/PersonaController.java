package com.tramites.tramites.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tramites.tramites.facade.PersonaFacade;
import com.tramites.tramites.vo.Persona;

@CrossOrigin(origins = "http://localhost:4200" , maxAge = 3600)
@RestController
@RequestMapping("/persona")
public class PersonaController {

	@Autowired
	private PersonaFacade personaFacade;
	
	@GetMapping(value = "/consultaUsuario")
    public Boolean consultaPersona(@RequestParam("numeroIdentificacion") String numeroIdentificacion, @RequestParam("clave") String clave){
        return personaFacade.consultaPersona(numeroIdentificacion, clave);
    }
	
	
	@PostMapping(value = "/crearPersona")
    public String agregarPersona(@RequestParam("idTipoIdentificacion") Integer idTipoIdentificacion, @RequestParam("numeroIdentificacion") String numeroIdentificacion,
    		@RequestParam("nombres") String nombres, @RequestParam("apellidos") String apellidos, @RequestParam("telefono") Integer telefono,	
    		@RequestParam("direccion") String direccion, @RequestParam("email") String email, @RequestParam("idDependencia") Integer idDependencia,	
    		@RequestParam("fechaIngreso") String fechaIngreso,	@RequestParam("idRol") Integer idRol, @RequestParam("clave") String clave){       
         
        return personaFacade.crearPersona(idTipoIdentificacion,	numeroIdentificacion,	nombres,	apellidos,	telefono,	direccion,	email,	idDependencia,	fechaIngreso,idRol, clave);
    }
	
	
}
