package com.prova.sistemaContatos.telephoneType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "telephone_types")
public class TelephoneType {

    @Id
    @GeneratedValue
    private Long idTelephoneType;
    private String name;
}
