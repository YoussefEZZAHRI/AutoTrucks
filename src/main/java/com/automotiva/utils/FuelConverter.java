package com.automotiva.utils;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class FuelConverter implements AttributeConverter<Fuel, String> {
    @Override
    public String convertToDatabaseColumn(Fuel fuel) {
        return fuel.getShortName();
    }
 
    @Override
    public Fuel convertToEntityAttribute(String dbData) {
        return Fuel.fromShortName(dbData);
    }
 

}
