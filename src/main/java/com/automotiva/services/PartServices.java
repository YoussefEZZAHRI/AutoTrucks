package com.automotiva.services;


import java.util.Collection;
import java.util.List;

import com.automotiva.entities.Part;


public interface PartServices {

	public Part getPartByCategory(String cat);
	public Part getPartByReference(String ref);
	public void createPart(Part nvPiece);
	public List<Part> getPartByBrand(String brand);
	public Collection<Part> getAllParts();
}
