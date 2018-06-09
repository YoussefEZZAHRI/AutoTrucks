package com.automotiva.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Carburant implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue
	private Long idCarburant;
	private String type;
	
	 @ManyToOne
		@JoinColumn(name="CODE_MOTEUR")
		private Motorisation moteur;
	
	public Carburant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Carburant(Long idCarburant, String type) {
		super();
		this.idCarburant = idCarburant;
		this.type = type;
	}
	public Long getIdCarburant() {
		return idCarburant;
	}
	public void setIdCarburant(Long idCarburant) {
		this.idCarburant = idCarburant;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	

}
