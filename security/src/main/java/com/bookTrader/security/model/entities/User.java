package com.bookTrader.security.model.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="users")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_id")
    private Long id;

    @Column(name="user_first_name")
    private String firstName;

    @Column(name="user_middle_name")
    private String middleName;

    @Column(name="user_first_lastname")
    private String firstLastname;

    @Column(name="user_second_lastname")
    private String secondLastname;

    @Column(name="user_user")
    private String user;

    @Column(name="user_password")
    private String password;

    @OneToOne
    @JoinColumn(name= "state_id", referencedColumnName= "state_id")
    private State state;

    @Column(name="user_mail")
    private String mail;

    //@Column(name="city_id")
    //private String city_id;

    @Column(name="user_identification")
    private String identification;

    @Column(name="user_phone")
    private String phone;

    @Column(name="user_avatar")
    private String avatar;

    @OneToOne
    @JoinColumn(name= "rol_id", referencedColumnName= "rol_id")
    private Rol rol;

    @Column(name="user_score")
    private String score;


}
