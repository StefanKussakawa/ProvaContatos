package com.prova.sistemaContatos.telephone.repository;

import com.prova.sistemaContatos.contact.Contact;
import com.prova.sistemaContatos.telephone.Telephone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TelephoneRepository extends JpaRepository<Telephone, Long> {

    Telephone findByIdTelephone(long id);

    @Query("SELECT a FROM Telephone a WHERE contact_id = ?1")
    List<Telephone> findByContactId (long id);
}
