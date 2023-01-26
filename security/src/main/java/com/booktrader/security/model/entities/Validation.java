package com.booktrader.security.model.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="validations")
@Data
public class Validation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="validation_id")
    private Long id;

    @Column(name="validation_code")
    private String code;

    @Column(name="validation_creation")
    private String creation;

    @OneToOne
    @JoinColumn(name= "user_id", referencedColumnName= "user_id")
    private User user;

}
