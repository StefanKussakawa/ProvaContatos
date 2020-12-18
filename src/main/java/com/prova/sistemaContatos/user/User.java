package com.prova.sistemaContatos.user;


import com.prova.sistemaContatos.contact.Contact;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "users", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class User{

    @Id
    @GeneratedValue
    private Long idUser;
    private String email;
    private String password;
}
