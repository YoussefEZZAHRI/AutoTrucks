package com.automotiva.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.automotiva.entities.Vehicule;

public interface VehiculeRepository extends  JpaRepository<Vehicule, Long>{

}
