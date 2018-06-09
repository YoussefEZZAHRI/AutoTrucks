package com.automotiva.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Vehicule implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long idVehicule;
	private String nom;

	@ManyToOne
	@JoinColumn(name = "CODE_MOD")
	private Model model;

//	@OneToMany(mappedBy = "vehicule", fetch = FetchType.LAZY)
//	private Collection<SubCategory> CP;

	public Long getIdVehicule() {
		return idVehicule;
	}

	public void setIdVehicule(Long idVehicule) {
		this.idVehicule = idVehicule;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}

//	public Collection<SubCategory> getCP() {
//		return CP;
//	}
//
//	public void setCP(Collection<SubCategory> cP) {
//		CP = cP;
//	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
