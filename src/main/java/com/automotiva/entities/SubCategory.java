package com.automotiva.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class SubCategory implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4147769598337557995L;

	@Id
	@GeneratedValue
	private Long id;

	private String title;

	private String slug;

	@ManyToOne
	@JoinColumn(name = "CATEGORY")
	private Category category;

	// @ManyToOne
	// @JoinColumn(name = "VEHICULE")
	// private Vehicule vehicule;
	//
	@OneToMany(mappedBy = "subCategory", cascade = CascadeType.ALL, orphanRemoval=true, fetch = FetchType.LAZY)
	private Collection<Part> parts;

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

	public Category getCategory_id() {
		return category;
	}

	public void setCategory_id(Category category_id) {
		this.category = category_id;
	}

}
