package com.projeto.biblioteca.service;

import com.projeto.biblioteca.model.Livro;

import java.util.List;
import java.util.Optional;

public interface LivroService {
    void novoLivro(Livro livro);
    List<Livro> buscarTodos();
    Optional<Livro> buscarPorId(Integer id);

    void deletar(Integer id);
    void emprestimo(String nomeLivro, String emailUsuario);
}
