package com.automotiva.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.automotiva.entities.Model;

public interface ModelRepository extends JpaRepository<Model, Long>{

}
