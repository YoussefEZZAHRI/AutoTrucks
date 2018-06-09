package com.automotiva.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.automotiva.entities.Part;
@Repository
@CrossOrigin(origins = "http://localhost:4200")
public interface PartRepository extends JpaRepository<Part, Long>{

	@Query(value = " Select p from Part p where p.subCategory =:category ")
	Part findByCategory(@Param(value = "category")String cat);

	@Query(value = " Select p from Part p left join fetch p.brand b where b.title like %:brand%")
	List<Part> findByBrand(@Param(value = "brand")String br);

}
