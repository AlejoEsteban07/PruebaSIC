package com.tramites.tramites.vo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rol")
public class RolVO {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	Integer Id;
	
	String descripcion;

	public RolVO() {
		
	}
	
	public RolVO(Integer id, String descripcion) {
		super();
		Id = id;
		this.descripcion = descripcion;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	
	
	

}
