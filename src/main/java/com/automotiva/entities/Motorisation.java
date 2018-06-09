package com.automotiva.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Motorisation implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8868045198765987104L;
	@Id
	@GeneratedValue
	private Long idMotorisation;

	private String nom;

	@OneToMany(mappedBy = "moteur", cascade = CascadeType.ALL, orphanRemoval=true, fetch = FetchType.LAZY)
	private Collection<Carburant> carburant;

	public Long getIdMotorisation() {
		return idMotorisation;
	}

	public void setIdMotorisation(Long idMotorisation) {
		this.idMotorisation = idMotorisation;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Collection<Carburant> getCarburant() {
		return carburant;
	}

	public void setCarburant(Collection<Carburant> carburant) {
		this.carburant = carburant;
	}

}
