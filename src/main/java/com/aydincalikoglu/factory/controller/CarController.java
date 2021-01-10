package com.aydincalikoglu.factory.controller;

import com.aydincalikoglu.factory.model.car.CarRequest;
import com.aydincalikoglu.factory.service.CarService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/cars")
public class CarController {

    private final CarService carService;

    CarController(CarService carService) {
        this.carService = carService;
    }

    @PostMapping(produces = MediaType.TEXT_PLAIN_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<String> create(@RequestBody CarRequest request) {
        return new ResponseEntity<>(carService.create(request.getType()), HttpStatus.CREATED);
    }

}
