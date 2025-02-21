package com.example.carparkinfo.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "carparks")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Carpark {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String carParkNo;

    private String address;
    private double xCoord;
    private double yCoord;
    private String carParkType;
    private String typeOfParkingSystem;
    private String shortTermParking;
    private String freeParking;
    private String nightParking;
    private int carParkDecks;
    private double gantryHeight;

    @Column(name = "car_park_basement")
    private String carParkBasement;  // Change from boolean to String to match CSV data

}
