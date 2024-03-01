package com.smart.projetsmart.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.smart.projetsmart.entity.Etudient;
import com.smart.projetsmart.service.EtudientService;

@RestController
@RequestMapping("/etudients")
public class EtudientController {
 
    @Autowired
    private EtudientService service;

    @PostMapping("/create")
    public ResponseEntity<Object> createEtudient(@RequestBody Etudient etudient) {
        return service.createEtudient(etudient);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Etudient> updateEtudient(@PathVariable Long id, @RequestBody Etudient etudient) {
        return service.updateEtudient( etudient);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Object> deleteEtudient(@PathVariable Long id){
            return service.deleteEtudient(id);
    }

    @GetMapping("/name")
    public ResponseEntity<Object> findEtudientByName(@RequestParam String name){
        return service.findEtudientByName(name);

    }

}