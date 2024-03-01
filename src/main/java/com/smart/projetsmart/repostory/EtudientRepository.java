package com.smart.projetsmart.repostory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smart.projetsmart.entity.Etudient;

@Repository
public interface EtudientRepository extends JpaRepository<Etudient , Long> {
    public     Etudient findByNom(String nom);
}
