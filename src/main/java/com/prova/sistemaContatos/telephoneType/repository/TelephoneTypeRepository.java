package com.prova.sistemaContatos.telephoneType.repository;

import com.prova.sistemaContatos.telephoneType.TelephoneType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TelephoneTypeRepository extends JpaRepository<TelephoneType, Long> {
    TelephoneType findByIdTelephoneType(long id);
}
