package com.aydincalikoglu.factory.service;

import com.aydincalikoglu.factory.model.car.Car;
import com.aydincalikoglu.factory.model.car.CarType;
import com.aydincalikoglu.factory.model.car.type.Cabrio;
import com.aydincalikoglu.factory.model.car.type.Hatchback;
import com.aydincalikoglu.factory.model.car.type.Sedan;
import org.springframework.stereotype.Service;

@Service
public class CarService {

    public String create(CarType type) {
        Car car =  switch (type) {
            case CABRIO -> new Cabrio();
            case HATCHBACK -> new Hatchback();
            case SEDAN -> new Sedan();
        };
        return car.getType() + " Car has produced.";
    }
}
