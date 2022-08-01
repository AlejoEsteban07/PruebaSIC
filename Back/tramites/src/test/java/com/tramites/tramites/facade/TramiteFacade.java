package com.tramites.tramites.facade;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.tramites.tramites.repository.TramiteRepository;
import com.tramites.tramites.vo.Tramite;

public class TramiteFacade {
	
	
	@Autowired
    private TramiteRepository tramiteRepository;
	
	
	public Optional<Tramite> consultaTramite(Integer id) {
	       return tramiteRepository.findById(id);		
	}
	
	public Iterable<Tramite> consultaTodosTramites() {
	       return tramiteRepository.findAll();		
	}
	
	
	
	
	public String crearTramite(Integer anoRadicacion, String nombreTramite, String descripcion, String personaRadico,
			String funcionarioRecibio) {
		
		Tramite tramite = new Tramite();
		tramite.setAnoRadicacion(anoRadicacion);
		tramite.setNombreTramite(nombreTramite);
		tramite.setDescripcion(descripcion);
		tramite.setPersonaRadico(personaRadico);
		tramite.setFuncionarioRecibio(funcionarioRecibio);
		tramiteRepository.save(tramite);
		return "Se creo correctamente el tramite";		
	}

}
