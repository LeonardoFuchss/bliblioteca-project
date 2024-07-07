package com.projeto.biblioteca.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Bean;

@Getter
@Setter
public class EmprestimoDto {
    private String nomeLivro;
    private String emailUsuario;
}
