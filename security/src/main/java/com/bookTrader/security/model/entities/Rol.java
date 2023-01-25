package com.bookTrader.security.model.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name="rols")
@Data
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="rol_id")
    private Long idRol;

    @OneToOne
    @JoinColumn(name= "state_id", referencedColumnName= "state_id")
    private State state;

    @Column(name="rol_name")
    private String name;

    @Column(name="rol_description")
    private String description;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "rols_menus",
            joinColumns = @JoinColumn(name = "rol_id", referencedColumnName = "rol_id"),
            inverseJoinColumns = @JoinColumn(name = "menu_id", referencedColumnName = "menu_id"))
    private List<Menu> menus;
}
