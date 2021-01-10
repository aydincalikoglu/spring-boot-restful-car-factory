package com.aydincalikoglu.factory.model.car;

import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.core.convert.converter.Converter;

public enum CarType {
    CABRIO, HATCHBACK, SEDAN;

    @JsonCreator
    public static CarType fromString(String source) {
        return CarType.valueOf(source.toUpperCase());
    }
}
