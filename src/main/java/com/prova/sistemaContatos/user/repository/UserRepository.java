package com.prova.sistemaContatos.user.repository;

import com.prova.sistemaContatos.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByIdUser(long id);
    User findByEmail(String email);
}
