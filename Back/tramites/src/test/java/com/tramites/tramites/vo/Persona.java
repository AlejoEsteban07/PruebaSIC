package com.tramites.tramites.vo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "persona")
public class Persona {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	Integer idPersona;	
	
	Integer idTipoIdentificacion;
	String numeroIdentificacion;
	String nombres;
	String apellidos;
	Integer telefono;
	String direccion;
	String email;
	Integer idDependencia;
	String fechaIngreso;
	Integer idRol;
	String clave;
	
	
	public Persona() {
		
	}
	
	public Persona(Integer idPersona, Integer idTipoIdentificacion, String numeroIdentificacion, String nombres,
			String apellidos, Integer telefono, String direccion, String email, Integer idDependencia,
			String fechaIngreso, Integer idRol, String clave) {
		this.idPersona = idPersona;
		this.idTipoIdentificacion = idTipoIdentificacion;
		this.numeroIdentificacion = numeroIdentificacion;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.direccion = direccion;
		this.email = email;
		this.idDependencia = idDependencia;
		this.fechaIngreso = fechaIngreso;
		this.idRol = idRol;
		this.clave = clave;
	}
	
	
	
	public Integer getIdPersona() {
		return idPersona;
	}
	public void setIdPersona(Integer idPersona) {
		this.idPersona = idPersona;
	}
	public Integer getIdTipoIdentificacion() {
		return idTipoIdentificacion;
	}
	public void setIdTipoIdentificacion(Integer idTipoIdentificacion) {
		this.idTipoIdentificacion = idTipoIdentificacion;
	}
	public String getNumeroIdentificacion() {
		return numeroIdentificacion;
	}
	public void setNumeroIdentificacion(String numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public Integer getTelefono() {
		return telefono;
	}
	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getIdDependencia() {
		return idDependencia;
	}
	public void setIdDependencia(Integer idDependencia) {
		this.idDependencia = idDependencia;
	}
	public String getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	public Integer getIdRol() {
		return idRol;
	}
	public void setIdRol(Integer idRol) {
		this.idRol = idRol;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	
	

}
