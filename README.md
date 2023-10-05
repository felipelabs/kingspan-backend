# Projeto de Avaliação Kingspan Isoeste

Neste projeto, foi desenvolvida uma API simples para realizar a avaliação proposta durante a entrevista. 
A API permite o cadastro de informações como nome, username e email, fornecendo a funcionalidade necessária para atender aos requisitos da avaliação.

## Tecnologias Utilizadas

- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring MVC](https://docs.spring.io/spring-framework/reference/web/webmvc.html)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [SpringDoc OpenAPI 3](https://springdoc.org/v2/#spring-webflux-support)
- [Postman](https://www.postman.com/)

## Práticas adotadas

- SOLID
- API REST
- Consultas com Spring Data JPA
- Injeção de Dependências
- Tratamento de respostas de erro
- Geração automática do Swagger com a OpenAPI 3

## Instalação

- Primeiramente precisamos do banco de dados que iremos utilizar no projeto o [Postgres 12](https://www.enterprisedb.com/downloads/postgres-postgresql-downloads).
- Após a instalação precisamos de uma IDE para a importação do projeto back-end, existem varios exemplos como VsCode, Atom, Intellij.
- Também iremos precisar do postman para testar as rotas da nossa aplicação.

## Execução

Com o postgres rodando vamos criar uma base de dados com o seguinte comando:
```
create database table_api
```
Após vamos clonar o projeto com o seguinte link:

```
https://github.com/felipelabs/kingspan-backend.git
```
Em seguida podemos importar o projeto em uma IDE e executar o projeto, com o projeto em execução
iremos abrir o postman e usar os endpoints `POST, GET, PUT E O DELETE`.

Segue abaixo as rotas para testes:

- **POST :** `localhost:8080/user`
- **GET :** `localhost:8080/users`
- **GET POR ID :** `localhost:8080/user/"ID DESEJADO"`
- **PUT :** `localhost:8080/user/"ID DESEJADO"`
- **DELETE :** `localhost:8080/user/"ID DESEJADO"`

Lembrando que nos metodos `POST E PUT` é necessário passar como parametrô um JSON, segue abaixo como exemplo:

```
$ http POST :8080/todos nome="Teste API" descricao="Teste" prioridade=1

[
  {
    "email":"exemplo@exemplo.com",
    "username":"exemplo",
    "name":"exemplo"
  }
]
```

O OpenAPI poderá ser visualizado em [localhost:8080/v3/api-docs](http://localhost:8080/v3/api-docs/)