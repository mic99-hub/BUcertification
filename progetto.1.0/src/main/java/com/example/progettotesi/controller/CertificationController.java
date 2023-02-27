package com.example.progettotesi.controller;

import com.example.progettotesi.model.Certification;
import com.example.progettotesi.service.CertificationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/certification")
public class CertificationController {
    private CertificationService certificationService;

    public CertificationController(CertificationService certificationService){
        super();
        this.certificationService=certificationService;
    }

    @PostMapping()
    public ResponseEntity<Certification> saveCertification(@RequestBody Certification certification){
        return new ResponseEntity<Certification>(certificationService.saveCertification(certification) , HttpStatus.CREATED);
    }







}
