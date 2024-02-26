package com.smart.projetsmart.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Proffesseur {
    
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    @Id
    private Long id;
    @Column
    private String matricule;
    @Column
    private String name;
    @Column
    private String prenom;
    @Column
    private String num_telephone;
    @Column
    private String date_naissance;
   

}
