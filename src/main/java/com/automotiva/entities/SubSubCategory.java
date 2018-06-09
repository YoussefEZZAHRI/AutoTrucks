package com.automotiva.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class SubSubCategory implements Serializable {

	/**
		 * 
		 */
	private static final long serialVersionUID = -7047331691944450993L;

	@Id
	@GeneratedValue
	private Long id;

	private String title;

	private String slug;

	private Long sub_category_id;

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

	public Long getSub_category_id() {
		return sub_category_id;
	}

	public void setSub_category_id(Long sub_category_id) {
		this.sub_category_id = sub_category_id;
	}

}
