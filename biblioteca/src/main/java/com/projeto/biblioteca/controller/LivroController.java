package com.projeto.biblioteca.controller;

import com.projeto.biblioteca.dto.EmprestimoDto;
import com.projeto.biblioteca.model.Livro;
import com.projeto.biblioteca.service.impl.LivroServiceImpl;
import com.projeto.biblioteca.service.impl.UsuarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Livro")
public class LivroController {

    @Autowired
    private LivroServiceImpl livroService;
    @Autowired
    private UsuarioServiceImpl usuarioService;

    @PostMapping("/save")
    public void save(@RequestBody Livro livro) {
        livroService.novoLivro(livro);
    }
    @GetMapping("/getAll")
    public ResponseEntity<List<Livro>> getAll() {
        return ResponseEntity.ok(livroService.buscarTodos());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Livro>> buscarPorId(@PathVariable Integer id){
        return ResponseEntity.ok(livroService.buscarPorId(id));
    }
    @GetMapping("/delete/{id}")
    public void deletarPorId(@PathVariable Integer id){
       livroService.deletar(id);
    }
    @PostMapping("/emprestimo")
    public void emprestar(@RequestBody EmprestimoDto emprestimoDto){

        String livro = emprestimoDto.getNomeLivro();
        String emailUsuario = emprestimoDto.getEmailUsuario();
        livroService.emprestimo(livro, emailUsuario);
    }
}
