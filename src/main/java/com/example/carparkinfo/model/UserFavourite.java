package com.example.carparkinfo.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "user_favourites")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserFavourite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long userId;

    @ManyToOne
    @JoinColumn(name = "carpark_id", nullable = false)
    private Carpark carpark;
}
