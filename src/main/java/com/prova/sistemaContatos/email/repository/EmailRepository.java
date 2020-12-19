package com.prova.sistemaContatos.email.repository;

import com.prova.sistemaContatos.email.Email;
import com.prova.sistemaContatos.telephone.Telephone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmailRepository extends JpaRepository<Email, Long> {

    Email findByIdEmail(long id);

    @Query("SELECT a FROM Email a WHERE contact_id = ?1")
    List<Email> findByContactId (long id);
}
