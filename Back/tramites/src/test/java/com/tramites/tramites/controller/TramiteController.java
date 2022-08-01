package com.tramites.tramites.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tramites.tramites.facade.TramiteFacade;
import com.tramites.tramites.vo.Tramite;

@CrossOrigin(origins = "http://localhost:4200" , maxAge = 3600)
@RestController
@RequestMapping("/tramite")
public class TramiteController {
	
	@Autowired
	private TramiteFacade tramiteFacade;
	
	
	@GetMapping(value = "/consultaTramite")
    public Optional<Tramite> consultaTramite(@RequestParam("id") Integer id){
        return tramiteFacade.consultaTramite(id);
    }
	
	
	@PostMapping(value = "/crearTramite")
	public String crearTramite(@RequestParam("anoRadicacion") Integer anoRadicacion, @RequestParam("nombreTramite")  String nombreTramite,  @RequestParam("descripcion") String descripcion, 
			@RequestParam("personaRadico") String personaRadico, @RequestParam("funcionarioRecibio") String funcionarioRecibio) {
		
		return tramiteFacade.crearTramite(anoRadicacion, nombreTramite, descripcion, personaRadico, funcionarioRecibio);
		
	}
	
	@GetMapping(value = "/consultarTodosTramites")
    public Iterable<Tramite> consultarTodosTramites(){
		System.out.println("Ingreso a consultar");
        return tramiteFacade.consultaTodosTramites();
    }

}
