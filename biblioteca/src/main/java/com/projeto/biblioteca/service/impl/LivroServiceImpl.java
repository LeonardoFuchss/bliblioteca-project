package com.projeto.biblioteca.service.impl;

import com.projeto.biblioteca.model.Livro;
import com.projeto.biblioteca.model.Usuario;
import com.projeto.biblioteca.repository.LivroRepository;
import com.projeto.biblioteca.repository.UsuarioRepository;
import com.projeto.biblioteca.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class LivroServiceImpl implements LivroService {
    @Autowired
    private LivroRepository livroRepository;
    @Autowired
    private UsuarioRepository usuarioRepository;
    @Override
    public void novoLivro(Livro livro) {
        livroRepository.save(livro);
    }

    @Override
    public List<Livro> buscarTodos() {
        return livroRepository.findAll();
    }

    @Override
    public Optional<Livro> buscarPorId(Integer id) {
        return livroRepository.findById(id);
    }

    @Override
    public void deletar(Integer id) {
        livroRepository.deleteById(id);
    }
    @Transactional
    @Override
    public void emprestimo(String nome, String email) {
        Usuario usuario = usuarioRepository.findByEmail(email);
        Livro livro = livroRepository.findByNome(nome);

        if (usuario != null && livro != null) {
            livro.setDisponibilidade("Indisponivel");
            usuario.setLivroEmprestado(nome);
            livroRepository.save(livro);
            usuarioRepository.save(usuario);
        } else {
            System.out.println("Livro ou usuário não existem!");
        }
    }
}
