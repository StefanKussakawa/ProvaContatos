package com.prova.sistemaContatos.telephone.controller;

import com.prova.sistemaContatos.telephone.Telephone;
import com.prova.sistemaContatos.telephone.repository.TelephoneRepository;
import com.prova.sistemaContatos.user.User;
import com.prova.sistemaContatos.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/telephones")
public class TelephoneController {

    @Autowired
    TelephoneRepository telephoneRepository;

    @PostMapping
    public ResponseEntity<Telephone> createTelephone(@RequestBody Telephone telephone) {
        telephone = telephoneRepository.save(telephone);
        return new ResponseEntity<>(telephone, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public Telephone getTelephoneById(@PathVariable(value = "id")Long id) {
        return telephoneRepository.findByIdTelephone(id);
    }

    @GetMapping
    public List<Telephone> getAllTelephones() {
        return telephoneRepository.findAll();
    }

}
