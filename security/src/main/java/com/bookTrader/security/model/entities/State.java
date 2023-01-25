package com.bookTrader.security.model.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="states")
@Data
public class State {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="state_id")
    private Long id;

    @Column(name="state_name")
    private String name;

    @Column(name="state_description")
    private String description;

    @Column(name="state_color")
    private String color;

}
