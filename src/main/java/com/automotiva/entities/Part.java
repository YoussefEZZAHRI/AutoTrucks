package com.automotiva.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Part implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long id;

	private String title;

	private LocalDate date_post;
	
	private String description;

	@OneToMany(mappedBy = "part", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
	private Collection<Photo> photos = new HashSet<Photo>();

	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "BRAND")
	private Brand brand;

	@ManyToOne
	@JoinColumn(name = "MAKE")
	private Make make;

	@ManyToOne
	@JoinColumn(name = "SUB_CATEGORY")
	private SubCategory subCategory;

	private String part_number;

	private String manufacturer_number;

	@Column
	@ElementCollection(targetClass = String.class)
	private List<String> prices = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public LocalDate getDate_post() {
		return date_post;
	}

	public Make getMake() {
		return make;
	}

	public void setMake(Make make) {
		this.make = make;
	}

	public void setDate_post(LocalDate date_post) {
		this.date_post = date_post;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Collection<Photo> getPhotos() {
		return photos;
	}

	public void setPhotos(Collection<Photo> photos) {
		this.photos = photos;
	}

	public String getPart_number() {
		return part_number;
	}

	public void setPart_number(String part_number) {
		this.part_number = part_number;
	}

	public String getManufacturer_number() {
		return manufacturer_number;
	}

	public void setManufacturer_number(String manufacturer_number) {
		this.manufacturer_number = manufacturer_number;
	}

	public List<String> getPrices() {
		return prices;
	}

	public void setPrices(List<String> prices) {
		this.prices = prices;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public SubCategory getSubCategory() {
		return subCategory;
	}

	public void setSubCategory(SubCategory subCategory) {
		this.subCategory = subCategory;
	}

}
