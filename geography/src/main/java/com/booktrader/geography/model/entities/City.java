package com.booktrader.geography.model.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="cities")
@Data
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="city_id")
    private Long id;

    @Column(name="city_name")
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "state_id", nullable = false)
    private State state;

}
