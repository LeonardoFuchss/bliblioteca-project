package com.projeto.biblioteca.service;

import com.projeto.biblioteca.model.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioService {

    void criarUsuario(Usuario usuario);
    List<Usuario> buscarTodos();
    Optional<Usuario> buscarPorId(Integer id);

}
