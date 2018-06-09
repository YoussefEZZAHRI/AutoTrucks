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
public class Brand implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -98495992221130975L;

	@Id
	@GeneratedValue
	private Long id;

	private String title;

	private String slug;

	private String initial;

	@OneToMany(mappedBy = "brand", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
	private Collection<Model> modele;

	@OneToMany(mappedBy = "brand", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
	private Collection<Part> parts;

	public Brand() {
	}

	public Brand(String brand) {
		this.title = brand;
	}

	public Collection<Model> getModele() {
		return modele;
	}

	public void setModele(Collection<Model> modele) {
		this.modele = modele;
	}

	public Collection<Part> getParts() {
		return parts;
	}

	public void setParts(Collection<Part> parts) {
		this.parts = parts;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public String getInitial() {
		return initial;
	}

	public void setInitial(String initial) {
		this.initial = initial;
	}

}
