package com.scode.springjpa.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.scode.springjpa.mapper.ResponseMapper;
import com.scode.springjpa.repository.CarModelRepository;
import com.scode.springjpa.response.CarModelResponse;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CarService {
	
//	private final CarModelMapper carModelMapper;
	private final CarModelRepository carModelRepository;
	private final ResponseMapper responseMapper;

	public List<CarModelResponse> carModels() {
		return carModelRepository.findAll().stream()
				.map(carEntity -> responseMapper.mapCarModel(carEntity))
				.collect(Collectors.toList());
	}
	
}
