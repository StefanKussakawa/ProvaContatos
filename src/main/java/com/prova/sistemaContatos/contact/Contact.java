package com.prova.sistemaContatos.contact;

import com.prova.sistemaContatos.email.Email;
import com.prova.sistemaContatos.telephone.Telephone;
import com.prova.sistemaContatos.user.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "contacts")
public class Contact {

    @Id
    @GeneratedValue
    private Long idContact;
    private String name;
    @ManyToOne
    private User userId;
}
