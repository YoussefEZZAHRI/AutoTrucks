package com.automotiva.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.automotiva.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
