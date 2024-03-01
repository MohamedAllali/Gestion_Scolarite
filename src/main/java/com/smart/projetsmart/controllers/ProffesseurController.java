package com.smart.projetsmart.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.smart.projetsmart.entity.Proffesseur;
import com.smart.projetsmart.service.ProffesseurService;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController 
@RequestMapping("/proffesseurs")

public class ProffesseurController {
    
    @Autowired
    private ProffesseurService service;

    @PostMapping("/create")
    public ResponseEntity<Object> createProffesseur(@RequestBody Proffesseur proffesseur) {
        return service.createProffesseur(proffesseur);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Proffesseur> updateProffesseur(@PathVariable Long id, @RequestBody Proffesseur proffesseur ) {
        return service.updateProffesseur( proffesseur );
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Object> deleteProffesseur(@PathVariable Long id){
            return service.deleteProffesseur(id);
    }

    @GetMapping("/name")
    public ResponseEntity<Object> findProffesseurByName(@RequestParam String name){
        return service.findProffesseurByName(name);
     
    }


}
