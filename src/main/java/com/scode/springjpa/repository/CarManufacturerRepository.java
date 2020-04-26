package com.scode.springjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scode.springjpa.entity.CarManufacturerEntity;

public interface CarManufacturerRepository extends JpaRepository<CarManufacturerEntity, Long> {
	
}
