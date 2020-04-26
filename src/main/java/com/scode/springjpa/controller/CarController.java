package com.scode.springjpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.scode.springjpa.response.CarModelResponse;
import com.scode.springjpa.service.CarService;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/api/cars")
@Api(value = "Cars", tags = "cars")
public class CarController {
	
	@Autowired
	private CarService carService;

	@GetMapping(value = "/v1/models", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public List<CarModelResponse> getAllCars() {
		return carService.carModels();
	}
	
}
