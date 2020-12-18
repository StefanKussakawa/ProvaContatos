package com.prova.sistemaContatos.contact.repository;

import com.prova.sistemaContatos.contact.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {

    Contact findByIdContact(long id);

    @Query("SELECT a FROM Contact a WHERE user_id = ?1")
    List<Contact> findByUserId (long id);
}
