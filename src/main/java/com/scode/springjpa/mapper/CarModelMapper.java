package com.scode.springjpa.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.scode.springjpa.entity.CarModelEntity;
import com.scode.springjpa.response.CarModelResponse;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CarModelMapper {
	CarModelResponse sourceToDestination(CarModelEntity source);
	CarModelEntity destinationToSource(CarModelResponse destination);
}
