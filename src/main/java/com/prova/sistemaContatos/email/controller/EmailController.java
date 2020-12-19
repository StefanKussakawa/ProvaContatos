package com.prova.sistemaContatos.email.controller;

import com.prova.sistemaContatos.contact.Contact;
import com.prova.sistemaContatos.email.Email;
import com.prova.sistemaContatos.email.repository.EmailRepository;
import com.prova.sistemaContatos.user.User;
import com.prova.sistemaContatos.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping(value = "/emails")
public class EmailController {

    @Autowired
    EmailRepository emailRepository;

    @PostMapping
    public ResponseEntity<Email> createEmail(@RequestBody Email email) {
        email = emailRepository.save(email);
        return new ResponseEntity<>(email, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public Email getEmailById(@PathVariable(value = "id")Long id) {
        return emailRepository.findByIdEmail(id);
    }

    @GetMapping
    public List<Email> getAllEmails() {
        return emailRepository.findAll();
    }

    @GetMapping("/contact/{id}")
    public List<Email> getAllEmailsOfUserById(@PathVariable Long id) {
        return emailRepository.findByContactId(id);
    }
}
