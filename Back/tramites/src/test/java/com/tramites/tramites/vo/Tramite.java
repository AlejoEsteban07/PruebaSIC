package com.tramites.tramites.vo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tramite")
public class Tramite {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	Integer Id;
	Integer anoRadicacion;
	String nombreTramite;
	String descripcion;
	String personaRadico;
	String funcionarioRecibio;
	
	
	public Tramite() {		
	}
	
	public Tramite(Integer id, Integer anoRadicacion, String nombreTramite, String descripcion, String personaRadico,
			String funcionarioRecibio) {
		Id = id;
		this.anoRadicacion = anoRadicacion;
		this.nombreTramite = nombreTramite;
		this.descripcion = descripcion;
		this.personaRadico = personaRadico;
		this.funcionarioRecibio = funcionarioRecibio;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public Integer getAnoRadicacion() {
		return anoRadicacion;
	}

	public void setAnoRadicacion(Integer anoRadicacion) {
		this.anoRadicacion = anoRadicacion;
	}

	public String getNombreTramite() {
		return nombreTramite;
	}

	public void setNombreTramite(String nombreTramite) {
		this.nombreTramite = nombreTramite;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getPersonaRadico() {
		return personaRadico;
	}

	public void setPersonaRadico(String personaRadico) {
		this.personaRadico = personaRadico;
	}

	public String getFuncionarioRecibio() {
		return funcionarioRecibio;
	}

	public void setFuncionarioRecibio(String funcionarioRecibio) {
		this.funcionarioRecibio = funcionarioRecibio;
	}
	
	
	
	

}
