package com.smart.projetsmart.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
public class Proffesseur {
    
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    @Id
    private Long id;
    @Column
    private String matricule;
    @Column
    private String nom;
    @Column
    private String prenom;
    @Column
    private String email;
    @Column
    private  String numTelephone;
    @Column
    private Date dateNaissance;


}
