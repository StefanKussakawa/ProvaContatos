package com.prova.sistemaContatos.email;

import com.prova.sistemaContatos.contact.Contact;
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
@Table(name = "emails")
public class Email {

    @Id
    @GeneratedValue
    private Long idEmail;
    private String email;
    @ManyToOne
    private Contact contactId;

}
