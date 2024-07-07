package com.projeto.biblioteca.repository;

import com.projeto.biblioteca.model.Livro;
import com.projeto.biblioteca.model.Usuario;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    Usuario findByEmail(String email);


}
