package com.aydincalikoglu.factory.model.car.type;

import com.aydincalikoglu.factory.model.car.Car;

public class Sedan implements Car {
    @Override
    public String getType() {
        return this.getClass().getSimpleName();
    }
}
