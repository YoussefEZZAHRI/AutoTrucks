package com.automotiva.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.automotiva.entities.Carburant;

public interface CarburantRepository extends JpaRepository<Carburant, Long>{

}
