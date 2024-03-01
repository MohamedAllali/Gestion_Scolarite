package com.smart.projetsmart.repostory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smart.projetsmart.entity.Proffesseur;

@Repository
public interface ProffesseurRepository extends JpaRepository<Proffesseur , Long> {
    public     Proffesseur findByNom(String nom);
}
 