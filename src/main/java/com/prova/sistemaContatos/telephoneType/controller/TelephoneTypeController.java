package com.prova.sistemaContatos.telephoneType.controller;

import com.prova.sistemaContatos.telephoneType.TelephoneType;
import com.prova.sistemaContatos.telephoneType.repository.TelephoneTypeRepository;
import com.prova.sistemaContatos.user.User;
import com.prova.sistemaContatos.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping(value = "/telephonetypes")
public class TelephoneTypeController {

    @Autowired
    TelephoneTypeRepository telephoneTypeRepository;

    @PostMapping
    public ResponseEntity<TelephoneType> createTelephoneType(@RequestBody TelephoneType telephoneType) {
        telephoneType = telephoneTypeRepository.save(telephoneType);
        return new ResponseEntity<>(telephoneType, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public TelephoneType getTelephoneTypeById(@PathVariable(value = "id")Long id) {
        return telephoneTypeRepository.findByIdTelephoneType(id);
    }

    @GetMapping
    public List<TelephoneType> getAllTelephoneTypes() {
        return telephoneTypeRepository.findAll();
    }

}
