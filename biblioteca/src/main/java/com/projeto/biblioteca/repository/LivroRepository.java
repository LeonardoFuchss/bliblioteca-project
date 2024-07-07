package com.projeto.biblioteca.repository;

import com.projeto.biblioteca.model.Livro;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LivroRepository extends JpaRepository<Livro, Integer> {
    Livro findByNome(String name);

}
