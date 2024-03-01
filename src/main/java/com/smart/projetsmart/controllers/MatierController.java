package com.smart.projetsmart.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.smart.projetsmart.entity.Matier;
import com.smart.projetsmart.service.MatierService;

@RestController
@RequestMapping("/matieres")
public class MatierController {
 
    @Autowired
    private MatierService service;

    @PostMapping("/create")
    public ResponseEntity<Object> createMatier(@RequestBody Matier matier) {
        return service.createMatier(matier);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Matier> updateMatier(@PathVariable Long id, @RequestBody Matier matier) {
        return service.updateM( matier , id);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Object> deleteMatier(@PathVariable Long id){
        return service.deleteMatier(id);
    }

    @GetMapping("/name")
    public ResponseEntity<Object> findEtudientByName(@RequestParam String name){
        return service.findMatierByName(name);
 
    }


}