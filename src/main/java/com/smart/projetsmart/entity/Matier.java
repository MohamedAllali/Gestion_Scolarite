package com.smart.projetsmart.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Matier {
    
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    @Id
    private Long id;
    @Column
    private String name;
    @Column
    private String libelle_matier
     @ManyToOne
    private  Proffesseur proffesseur;

}
