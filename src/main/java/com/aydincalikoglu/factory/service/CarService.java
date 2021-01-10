package com.aydincalikoglu.factory.service;

import com.aydincalikoglu.factory.model.car.CarType;
import com.aydincalikoglu.factory.model.car.type.Cabrio;
import com.aydincalikoglu.factory.model.car.type.Hatchback;
import com.aydincalikoglu.factory.model.car.type.Sedan;
import org.springframework.stereotype.Service;

@Service
public class CarService {

    public String create(CarType type) {
        return switch (type) {
            case CABRIO -> new Cabrio().getType();
            case HATCHBACK -> new Hatchback().getType();
            case SEDAN -> new Sedan().getType();
        } + " Car has produced.";
    }
}
