package com.grokonez.jwtauthentication.controller;

import com.grokonez.jwtauthentication.model.Imc;
import com.grokonez.jwtauthentication.repository.ImcRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;
import java.util.ArrayList;
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/")
public class ImcController {

    @Autowired
    private ImcRepository imcRepository;

    @GetMapping("/imc/{id}")
    public ResponseEntity<Imc> getById(@PathVariable Long id){
        if(!imcRepository.findById(id).isPresent()){
            return ResponseEntity.notFound().build();
        }
        Optional<Imc> mood = imcRepository.findById(id);
        return ResponseEntity.ok(mood.get());
    }

    @PostMapping("/imcs/")
    public ResponseEntity<Imc> add(@RequestBody Imc imc){
        return ResponseEntity.ok(imcRepository.save(imc));
    }
}
