package com.prova.sistemaContatos.telephone.repository;

import com.prova.sistemaContatos.telephone.Telephone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TelephoneRepository extends JpaRepository<Telephone, Long> {
    Telephone findByIdTelephone(long id);
}
