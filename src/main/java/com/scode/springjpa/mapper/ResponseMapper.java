package com.scode.springjpa.mapper;

import org.springframework.stereotype.Component;

import com.scode.springjpa.entity.CarBodyTypeEntity;
import com.scode.springjpa.entity.CarManufacturerEntity;
import com.scode.springjpa.entity.CarModelEntity;
import com.scode.springjpa.response.CarBodyTypeResponse;
import com.scode.springjpa.response.CarManufacturerResponse;
import com.scode.springjpa.response.CarModelResponse;

@Component
public class ResponseMapper {

	public CarManufacturerResponse mapManufacturer(CarManufacturerEntity manufacturerEntity) {
		return CarManufacturerResponse.builder().id(manufacturerEntity.getId())
				.brandName(manufacturerEntity.getBrandName()).about(manufacturerEntity.getAbout())
				.establishment(manufacturerEntity.getEstablishment()).headquarter(manufacturerEntity.getHeadquarter())
				.createdAt(manufacturerEntity.getCreatedAt()).createdBy(manufacturerEntity.getCreatedBy()).build();
	}

	public CarModelResponse mapCarModel(CarModelEntity carModelEntity) {
		return CarModelResponse.builder().id(carModelEntity.getId()).modelName(carModelEntity.getModelName())
				.details(carModelEntity.getDetails()).manufacturer(mapManufacturer(carModelEntity.getManufacturer()))
				.bodyType(bodyTypeMapper(carModelEntity.getBodyType())).createdAt(carModelEntity.getCreatedAt())
				.createdBy(carModelEntity.getCreatedBy()).build();
	}

	public CarBodyTypeResponse bodyTypeMapper(CarBodyTypeEntity carBodyTypeEntity) {
		return CarBodyTypeResponse.builder().id(carBodyTypeEntity.getId()).typeName(carBodyTypeEntity.getTypeName())
				.definition(carBodyTypeEntity.getDefinition()).createdAt(carBodyTypeEntity.getCreatedAt())
				.createdBy(carBodyTypeEntity.getCreatedBy()).build();
	}
}
