package com.smart.projetsmart;


import static org.mockito.Mockito.when;
// import static org.mockito.Mockito.verify;
// import static org.mockito.Mockito.times;

import java.util.Optional;

// import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.smart.projetsmart.entity.Etudient;
import com.smart.projetsmart.repostory.EtudientRepository;
import com.smart.projetsmart.service.EtudientService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@RunWith(MockitoJUnitRunner.class)
public class EtudientServiceTest {

    @Mock
    private EtudientRepository etudiantRepository;

    @InjectMocks
    private EtudientService etudiantService;


    @Test
    public void testCreateEtudiant_Success() {
        // Given
        Etudient etudient = new Etudient();
        etudient.setMatricule("C11410");
        etudient.setNom("Mohamed");
        etudient.setPrenom("Bilal");
        etudient.setEmail("medbl@gmail.com");
        etudient.setNumTelephone("31313132");
        // etudient.setDateNaissance(12-11-1996);

        Mockito.when(etudiantRepository.save(etudient)).thenReturn(etudient);

        ResponseEntity<Object> response = etudiantService.createEtudiant(etudient);

        // Then
        assertNotNull(response);
        assertEquals(HttpStatus.OK, response.getStatusCode());
        // Add more assertions if necessary
    }

    @Test
    public void testUpdateEtudiant_Success() {
        // Given
        long id = 1L;
        Etudient existingEtudiant = new Etudient();
        
        assertNotNull(existingEtudiant);
        assertEquals("C11410", existingEtudiant.getMatricule());
        assertEquals("Mohamed", existingEtudiant.getNom());
        assertEquals("Bilal", existingEtudiant.getPrenom());
        assertEquals("medbl@gmail.com", existingEtudiant.getEmail());
        assertEquals("31313132", existingEtudiant.getNumTelephone());
        // assertEquals(12-11-1996, existingEtudiant.getDateNaissance());


        when(etudiantRepository.findById(id)).thenReturn(Optional.of(existingEtudiant));

        ResponseEntity<Etudient> response = etudiantService.updateEtudiant(existingEtudiant, id);

        
        assertNotNull(response);
        assertEquals(HttpStatus.OK, response.getStatusCode());
        
    }

}
