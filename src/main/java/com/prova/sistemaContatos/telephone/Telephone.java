package com.prova.sistemaContatos.telephone;

import com.prova.sistemaContatos.contact.Contact;
import com.prova.sistemaContatos.telephoneType.TelephoneType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "telephones")
public class Telephone {

    @Id
    @GeneratedValue
    private Long idTelephone;
    private String telephone;
    @ManyToOne
    private TelephoneType telephoneTypeId;
    @ManyToOne
    private Contact contactId;
}
