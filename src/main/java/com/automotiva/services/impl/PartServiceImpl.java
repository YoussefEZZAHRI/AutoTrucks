package com.automotiva.services.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.automotiva.dao.PartRepository;
import com.automotiva.entities.Part;
import com.automotiva.services.PartServices;

@Service
public class PartServiceImpl implements PartServices {

	@Resource
	private PartRepository pieceRepository;

	@Override
	public Part getPartByCategory(String cat) {

		return pieceRepository.findByCategory(cat);

	}

	@Override
	public Part getPartByReference(String ref) {

		return null;
	}

	@Override
	public void createPart(Part nvPart) {
		pieceRepository.save(nvPart);

	}

	@Override
	public List<Part> getPartByBrand(String brand) {
		return pieceRepository.findByBrand(brand);
	}

	@Override
	public List<Part> getAllParts() {
		return pieceRepository.findAll();
	}
}
