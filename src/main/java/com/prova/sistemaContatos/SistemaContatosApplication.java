package com.prova.sistemaContatos;

import com.prova.sistemaContatos.contact.repository.ContactRepository;
import com.prova.sistemaContatos.email.controller.EmailController;
import com.prova.sistemaContatos.telephone.controller.TelephoneController;
import com.prova.sistemaContatos.telephoneType.controller.TelephoneTypeController;
import com.prova.sistemaContatos.user.controller.UserController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class SistemaContatosApplication {

	public static void main(String[] args) {
		SpringApplication.run(SistemaContatosApplication.class, args);
	}

}
