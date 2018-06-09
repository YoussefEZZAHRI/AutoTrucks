package com.automotiva.web;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.automotiva.entities.Part;
import com.automotiva.services.PartServices;
import com.automotiva.web.dto.PartDto;

@RestController
@RequestMapping("/parts")
@CrossOrigin(origins = "http://localhost:4200")
public class PieceController {
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

	@Resource
	private PartServices partService;

	@Resource
	private ModelMapper modelMapper;

	@GetMapping("/{id}/Categorie")
	public ResponseEntity<PartDto> getPieceByCategorie(@PathVariable("id") String categorie) {

		PartDto response = modelMapper.map(partService.getPartByCategory(categorie), PartDto.class);

		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	@PostMapping("/createPiece")
	public ResponseEntity<PartDto> createPiece(@Valid @RequestBody PartDto piece) {

		Part nvPiece = modelMapper.map(piece, Part.class);
		partService.createPart(nvPiece);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	@GetMapping("/{reference}/piece")
	public ResponseEntity<PartDto> getPieceByReference(@PathVariable("reference") String ref) {

		Part response = partService.getPartByReference(ref);

		return new ResponseEntity<PartDto>(modelMapper.map(response, PartDto.class), HttpStatus.OK);
	}

	@GetMapping("/{marque}/pieces")
	public ResponseEntity<List<PartDto>> getPieceByMarque(@PathVariable("marque") String ref) {

		List<Part> response = partService.getPartByBrand(ref);
		return new ResponseEntity<>(
				response.stream().map(item -> entToDto(item)).collect(Collectors.toList()),
				HttpStatus.OK);
	}
	@GetMapping("/All")
	public ResponseEntity<Collection<PartDto>> getAllParts() {

		Collection<Part> response = partService.getAllParts();
				return new ResponseEntity<>(
				response.stream().map(item -> entToDto(item)).collect(Collectors.toList()),
				HttpStatus.OK);
	}
	
	private PartDto entToDto(Part part){
		PartDto result = modelMapper.map(part, PartDto.class);
		result.setBrand(ObjectUtils.isEmpty(part.getBrand()) ? null : part.getBrand().getTitle());
		result.setSubCategory(ObjectUtils.isEmpty(part.getSubCategory()) ? null : part.getSubCategory().getTitle());
		return result;
	}
	public static void main(String[] args) {

		Set collection = new HashSet();
		collection.add("Jean");
		collection.add("Paul");
		collection.add("Jean");
		collection.add("Pierre");

		System.out.println("il y a "+ collection.size()+ " élément(s)");

		}
}
