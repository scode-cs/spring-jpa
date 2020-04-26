package com.scode.springjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scode.springjpa.entity.CarModelEntity;

public interface CarModelRepository extends JpaRepository<CarModelEntity, Long> {

}
