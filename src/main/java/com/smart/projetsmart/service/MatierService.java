package com.smart.projetsmart.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.smart.projetsmart.entity.Matier;
import com.smart.projetsmart.repostory.MatierRepository;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Service
public class MatierService {
    
   
    private  MatierRepository matierRepository;

    public  ResponseEntity<Object> createMatier(Matier matier) {
        try {
            matierRepository.save(matier);
            return ResponseEntity.ok().body("Matier created successfully");
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }

    public  ResponseEntity<Matier> updateM( Matier matier , long id) {
        Optional<Matier> optionalMatier = matierRepository.findById(id);
        if (optionalMatier.isPresent()) {
            Matier existingMatier = optionalMatier.get();
            existingMatier.setlibelleMatier(matier.getlibelleMatier());
            
            return ResponseEntity.ok().body(matierRepository.save(existingMatier));
        }
        return ResponseEntity.notFound().build();
    } 

    public ResponseEntity<Object> findMatierByName(String name) {
        // Optional<Matier> optionalMatier = matierRepository.findByNom(name);
        // if (optionalMatier.isPresent()) {
        //     Matier matier = optionalMatier.get();
        //     return ResponseEntity.ok().body(matier);
        // return null;
        // }
        return null;   
    }
    
    public ResponseEntity<Object> deleteMatier(Long id) {
        Optional<Matier> optionalMatier = matierRepository.findById(id);
        if (optionalMatier.isPresent()) {
            Matier matier = optionalMatier.get();
            matierRepository.delete(matier);
            return ResponseEntity.ok().body("Matier deleted successfully");
        }
        return ResponseEntity.notFound().build();
    }

}