package com.smart.projetsmart.service;


import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.smart.projetsmart.entity.Proffesseur;
import com.smart.projetsmart.repostory.ProffesseurRepository;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Service
public class ProffesseurService {
    
    @Autowired
    private  ProffesseurRepository proffesseurRepository;

    public  ResponseEntity<Object> createEtudiant(Proffesseur proffesseur) {
        try {
            proffesseurRepository.save(proffesseur);

            return ResponseEntity.ok().body("Professeur created successfully");
        } catch (Exception e) {

            return ResponseEntity.internalServerError().build();
        }
    }

    public  ResponseEntity<Proffesseur> updateEtudiant( Proffesseur proffesseur , long id) {
        Optional<Proffesseur> optionalProffesseur  = proffesseurRepository.findById(id);
        if (optionalProffesseur.isPresent()) {
            Proffesseur existingProffesseur = optionalProffesseur.get();
            existingProffesseur.setMatricule(proffesseur.getMatricule());
            existingProffesseur.setNom(proffesseur.getNom());
            existingProffesseur.setPrenom(proffesseur.getPrenom());
            existingProffesseur.setEmail(proffesseur.getEmail());
            existingProffesseur.setNumTelephone(proffesseur.getNumTelephone());
            existingProffesseur.setDateNaissance(proffesseur.getDateNaissance());

            return ResponseEntity.ok().body(proffesseurRepository.save(existingProffesseur));
        }
        return ResponseEntity.notFound().build();
    }

    public ResponseEntity<Object> findEtudientByName(String name) {
        throw new UnsupportedOperationException("Unimplemented method 'findProffesseurByName'");
    }

   
    public ResponseEntity<Object> createProffesseur (Proffesseur proffesseur) {

        if(proffesseur.equals(null))
             throw new UnsupportedOperationException("Unimplemented method 'createProffesseur'");

        return ResponseEntity.status(HttpStatus.CREATED).body(proffesseurRepository.save(proffesseur));
    }

    public ResponseEntity<Proffesseur> updateProffesseur(Proffesseur etudient) {
        
        throw new UnsupportedOperationException("Unimplemented method 'updateEtudient'");
    }

    public ResponseEntity<Object> deleteProffesseur(Long id) {
        
        throw new UnsupportedOperationException("Unimplemented method 'deleteEtudient'");
    }

    public ResponseEntity<Object> findProffesseurByName(String name) {
       
        throw new UnsupportedOperationException("Unimplemented method 'findProffesseurByName'");
    }

}