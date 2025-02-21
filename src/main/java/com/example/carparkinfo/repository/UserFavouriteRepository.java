package com.example.carparkinfo.repository;

import com.example.carparkinfo.model.UserFavourite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserFavouriteRepository extends JpaRepository<UserFavourite, Long> {
    List<UserFavourite> findByUserId(Long userId);
}
