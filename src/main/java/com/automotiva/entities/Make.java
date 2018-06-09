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
public class Make implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long idMake;
	
	private String title;
	
	@OneToMany(mappedBy = "make",cascade = CascadeType.ALL, orphanRemoval=true, fetch = FetchType.LAZY)
	private Collection<Part> parts ;

	public Long getId() {
		return idMake;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Collection<Part> getNum_parts() {
		return parts;
	}

	public void setNum_parts(Collection<Part> num_parts) {
		this.parts = num_parts;
	}

}
