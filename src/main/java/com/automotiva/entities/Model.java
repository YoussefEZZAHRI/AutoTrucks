package com.automotiva.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Model implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8741257123842343238L;
	@Id
	@GeneratedValue
	private Long idModele;

	private String title;

	@ManyToOne
	@JoinColumn(name = "BRAND")
	private Brand brand;

	@ManyToOne
	@JoinColumn(name = "YEAR")
	private Year year;

	public Long getIdModele() {
		return idModele;
	}

	public void setIdModele(Long idModele) {
		this.idModele = idModele;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Year getYear() {
		return year;
	}

	public void setYear(Year year) {
		this.year = year;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	// @OneToMany(mappedBy="model",fetch=FetchType.LAZY)
	// private Collection<Motorisation> moteur;

}
