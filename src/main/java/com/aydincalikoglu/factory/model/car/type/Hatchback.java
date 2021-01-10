package com.aydincalikoglu.factory.model.car.type;

import com.aydincalikoglu.factory.model.car.Car;

public class Hatchback implements Car {
    @Override
    public String getType() {
        return this.getClass().getSimpleName();
    }
}
