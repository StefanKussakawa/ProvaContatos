package com.prova.sistemaContatos.email.repository;

import com.prova.sistemaContatos.email.Email;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmailRepository extends JpaRepository<Email, Long> {
    Email findByIdEmail(long id);
}
