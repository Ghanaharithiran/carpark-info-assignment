package com.example.carparkinfo.controller;

import com.example.carparkinfo.model.Carpark;
import com.example.carparkinfo.repository.CarparkRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/carparks")
public class CarparkController {

    private final CarparkRepository carparkRepository;

    public CarparkController(CarparkRepository carparkRepository) {
        this.carparkRepository = carparkRepository;
    }

    @GetMapping
    public List<Carpark> getAllCarparks() {
        return carparkRepository.findAll();
    }

    @GetMapping("/free")
    public List<Carpark> getFreeParkingCarparks() {
        return carparkRepository.findByFreeParking("YES");
    }

    @GetMapping("/night")
    public List<Carpark> getNightParkingCarparks() {
        return carparkRepository.findByNightParking("YES");
    }

    @GetMapping("/height/{height}")
    public List<Carpark> getCarparksByHeight(@PathVariable double height) {
        return carparkRepository.findByGantryHeightGreaterThanEqual(height);
    }
}
