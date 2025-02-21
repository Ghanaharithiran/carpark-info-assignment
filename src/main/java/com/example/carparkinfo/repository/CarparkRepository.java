package com.example.carparkinfo.repository;

import com.example.carparkinfo.model.Carpark;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarparkRepository extends JpaRepository<Carpark, Long> {
    
    List<Carpark> findByFreeParking(String freeParking);

    List<Carpark> findByNightParking(String nightParking);

    List<Carpark> findByGantryHeightGreaterThanEqual(double height);
}
