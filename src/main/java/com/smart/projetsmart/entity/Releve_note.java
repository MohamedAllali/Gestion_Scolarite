package com.smart.projetsmart.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Releve_note {
    
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;


    @ManyToOne
    private  Matier matier;
    @ManyToOne
    private Etudient etudient;
    @ManyToOne
    private Notes notes;

}
