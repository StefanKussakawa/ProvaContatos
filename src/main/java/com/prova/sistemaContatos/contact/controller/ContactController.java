package com.prova.sistemaContatos.contact.controller;

import com.prova.sistemaContatos.contact.Contact;
import com.prova.sistemaContatos.contact.repository.ContactRepository;
import com.prova.sistemaContatos.user.User;
import com.prova.sistemaContatos.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/contacts")
public class ContactController {

    @Autowired
    ContactRepository contactRepository;

    @PostMapping
    public ResponseEntity<Contact> createContact(@RequestBody Contact contact) {
        contact = contactRepository.save(contact);
        return new ResponseEntity<>(contact, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public Contact getContactById(@PathVariable(value = "id")Long id) {
        return contactRepository.findByIdContact(id);
    }

    @GetMapping
    public List<Contact> getAllContacts() {
        return contactRepository.findAll();
    }

    @GetMapping("/user/{id}")
    public List<Contact> getAllContactsOfUserById(@PathVariable Long id) {
        return contactRepository.findByUserId(id);
    }

}
