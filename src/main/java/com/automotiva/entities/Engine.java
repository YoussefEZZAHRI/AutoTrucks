package com.automotiva.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Engine implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7974183328649049574L;
	@Id
	@GeneratedValue
	private int	id ;
	private String title;
	private int submodel_id;
	private String make;
	private	String year;
	private	String model;
	private String submodel;
	private int num_parts;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getSubmodel_id() {
		return submodel_id;
	}
	public void setSubmodel_id(int submodel_id) {
		this.submodel_id = submodel_id;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getSubmodel() {
		return submodel;
	}
	public void setSubmodel(String submodel) {
		this.submodel = submodel;
	}
	public int getNum_parts() {
		return num_parts;
	}
	public void setNum_parts(int num_parts) {
		this.num_parts = num_parts;
	}
	
	
}
