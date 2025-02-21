package com.example.carparkinfo.batch;

import com.example.carparkinfo.model.Carpark;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

@Component
public class CarparkCSVProcessor implements ItemProcessor<Carpark, Carpark> {

    @Override
    public Carpark process(@SuppressWarnings("null") Carpark carpark) {
        if (carpark.getCarParkBasement() != null && carpark.getCarParkBasement().equalsIgnoreCase("Y")) {
            carpark.setCarParkBasement("Yes");
        } else {
            carpark.setCarParkBasement("No");
        }
        return carpark;
    }
}
