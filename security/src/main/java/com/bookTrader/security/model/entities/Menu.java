package com.bookTrader.security.model.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name="menus")
@Data
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="menu_id")
    private Long id;

    @Column(name="menu_action")
    private String action;

    @Column(name="menu_icon")
    private String icon;

    @OneToOne
    @JoinColumn(name = "menu_father_id", referencedColumnName= "menu_id")
    @JsonBackReference
    private Menu parentMenu;

    @Column(name="menu_description")
    private String description;

    @Column(name="menu_name")
    private String name;

    @ManyToMany(fetch=FetchType.LAZY, mappedBy="menus")
    @JsonBackReference
    private List<Rol> roles;


}
