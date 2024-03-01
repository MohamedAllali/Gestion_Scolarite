package com.smart.projetsmart.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;



@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Matier {
    
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    @Id
    private Long id;
    @Column
    private String libelleMatier ;

    @ManyToOne
    private  Proffesseur proffesseur;

    public Object getlibelleMatier() {
      
        throw new UnsupportedOperationException("Unimplemented method 'getlibelleMatier'");
    }

    public void setlibelleMatier(Object getlibelleMatier) {
      
        throw new UnsupportedOperationException("Unimplemented method 'setlibelleMatier'");
    }



}