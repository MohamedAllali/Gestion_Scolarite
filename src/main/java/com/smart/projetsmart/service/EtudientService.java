package com.smart.projetsmart.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.smart.projetsmart.entity.Etudient;
import com.smart.projetsmart.repostory.EtudientRepository;

@Service
public class EtudientService {
    
    @Autowired
    private  EtudientRepository etudientRepository;

    public  ResponseEntity<Object> createEtudiant(Etudient etudient) {
        try {
            etudientRepository.save(etudient);

            return ResponseEntity.ok().body("Etudient created successfully");
        } catch (Exception e) {

            return ResponseEntity.internalServerError().build();
        }
    }

    public  ResponseEntity<Etudient> updateEtudiant( Etudient etudient , long id) {
        Optional<Etudient> optionalEtudiant = etudientRepository.findById(id);
        if (optionalEtudiant.isPresent()) {
            Etudient existingEtudiant = optionalEtudiant.get();
            existingEtudiant.setMatricule(etudient.getMatricule());
            existingEtudiant.setNom(etudient.getNom());
            existingEtudiant.setPrenom(etudient.getPrenom());
            existingEtudiant.setEmail(etudient.getEmail());
            existingEtudiant.setNumTelephone(etudient.getNumTelephone());
            existingEtudiant.setDateNaissance(etudient.getDateNaissance());

            return ResponseEntity.ok().body(etudientRepository.save(existingEtudiant));
        }
        return ResponseEntity.notFound().build();
    } 

    public ResponseEntity<Object> findEtudientByName(String name) {
        throw new UnsupportedOperationException("Unimplemented method 'findEtudientByName'");
    }

   
    public ResponseEntity<Object> createEtudient(Etudient etudient) {

        if(etudient.equals(null))
             throw new UnsupportedOperationException("Unimplemented method 'createEtudient'");

        return ResponseEntity.status(HttpStatus.CREATED).body(etudientRepository.save(etudient));
    }

    public ResponseEntity<Etudient> updateEtudient(Etudient etudient) {

        // if(etudient.equals(null))
             throw new UnsupportedOperationException("Unimplemented method 'updateEtudient'");

        // return ResponseEntity.status(HttpStatus.UPDATED).body(etudientRepository.save(etudient)) ;
    }

    public ResponseEntity<Object> deleteEtudient(Long id) {
        
        throw new UnsupportedOperationException("Unimplemented method 'deleteEtudient'");
    }

}