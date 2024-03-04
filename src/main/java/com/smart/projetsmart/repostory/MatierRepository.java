package com.smart.projetsmart.repostory;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smart.projetsmart.entity.Matier;


@Repository
public interface MatierRepository extends JpaRepository<Matier, Long> {
   Optional<Matier> findByName(String lebelleMatier);
   
}