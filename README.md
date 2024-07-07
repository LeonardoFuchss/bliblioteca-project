# Projeto Sistema de Biblioteca Simples
### Este projeto foi desenvolvido com Java e com o Spring Framework.
### Dependências utilizadas no projeto: 
- <strong>SPRING BOOT:</strong>
Framework que simplifica a configuração e a inicialização de aplicações Spring, proporcionando um ambiente de desenvolvimento rápido e produtivo.
- <strong>SPRING WEB:</strong>
  Framework que facilita a criação de aplicações web e <strong>APIs RESTful</strong>, fornecendo ferramentas para manipulação de requisições HTTP, roteamento e integração com outras tecnologias web.
- <strong>SPRING DATA JPA:</strong>
  Simplifica o acesso e a manipulação de dados em aplicações Java, fornecendo uma camada de abstração para o JPA (Java Persistence API), permitindo interações eficientes com bancos de dados relacionais.
- <strong>LOMBOK:</strong>
  Biblioteca que reduz o código boilerplate em Java, gerando automaticamente getters, setters, construtores e outros métodos comuns através de anotações.
- <strong>H2 CONSOLE:</strong>
  Banco de dados em memórias, utilizado para realizar testes para visualizar e manipular dados.
  
### O projeto possui APIs para:
  - Adicionar um USUÁRIO e um LIVRO no sistema
  - Buscar todos os USUÁRIOS e todos os LIVROS
  - Buscar por identificador um USUÁRIO específico e um LIVRO específico
  - Deletar um USUÁRIO e deletar um LIVRO por identificador
  - Realizar um empréstimo com base no email do USUÁRIO e no nome do LIVRO
  - Ao efetuar o empréstimo, atualiza a disponibilidade do LIVRO e o livro no qual o USUÁRIO pegou emprestado
