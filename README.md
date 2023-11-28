
```markdown
# BooksJPA - Sistema de Gerenciamento de Livros

Este projeto é um sistema de gerenciamento de livros construído com Spring Boot e JPA.

## Funcionalidades

- Listagem de todos os livros
- Busca de livro por ISBN
- Adição de novos livros
- Atualização de informações de livros
- Exclusão de livros

## Tecnologias Utilizadas

- **Spring Boot:** Facilita a criação de aplicativos Java baseados em Spring, com configuração mínima.
- **Spring Data JPA:** Facilita a implementação de repositórios de dados baseados em JPA.
- **H2 Database (para desenvolvimento):** Banco de dados em memória para facilitar o desenvolvimento e teste.
- **Maven:** Ferramenta de automação de construção e gerenciamento de dependências.

## Configuração do Ambiente de Desenvolvimento

1. Clone o repositório: `git clone https://github.com/seu-usuario/books-jpa.git`
2. Abra o projeto em sua IDE de escolha (Eclipse, IntelliJ, etc.).
3. Execute a classe `BooksJpaApplication` para iniciar a aplicação.

## Uso da API

A API oferece endpoints RESTful para realizar operações CRUD em livros. Aqui estão alguns exemplos:

- **Listar todos os livros:**
  ```
  GET /livros
  ```

- **Buscar livro por ISBN:**
  ```
  GET /livros/{isbn}
  ```

- **Adicionar novo livro:**
  ```
  POST /livros
  ```
  Corpo da solicitação (JSON):
  ```json
  {
    "titulo": "Título do Livro",
    "autor": "Nome do Autor",
    "isbn": 123456789,
    "genero": "Gênero do Livro",
    "preco": 29.99
  }
  ```

- **Atualizar informações do livro:**
  ```
  PUT /livros/{isbn}
  ```
  Corpo da solicitação (JSON):
  ```json
  {
    "titulo": "Novo Título",
    "autor": "Novo Autor",
    "genero": "Novo Gênero",
    "preco": 39.99
  }
  ```

- **Excluir livro por ISBN:**
  ```
  DELETE /livros/{isbn}
  ```
