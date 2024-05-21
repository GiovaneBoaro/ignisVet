# ignisVet
## O objetivo do projeto é aprender a usar o Spring Boot para desenvolver uma API Rest, com algumas funcionalidades. A ideia é desenvolver um CRUD, sendo as quatro operações fundamentais das aplicações: cadastro, listagem, atualização e exclusão de informações.

## Aprender também como validar as informações que chegam na nossa API, usando o Bean Validation. Depois, aprendendo a utilização de paginação e ordenação das informações que a API vai devolver.

--

##Tecnologias:
Spring Boot 3
Java 17
Lombok
MySQL/ Flyway
JPA/Hibernate
Maven
Insomnia

--

Utilizar o banco de dados MySQL para armazenar as informações da API e junto com ele usar a biblioteca Flyway. Isso para ter o controle do histórico de evolução do banco de dados.

A camada de persistência da aplicação será feita com a JPA (Java Persistence API), com o Hibernate como implementação dessa especificação e usando os módulos do Spring Boot, para tornar esse processo o mais simples possível.

Usar o Maven para gerenciar as dependências do projeto, e também para gerar o build da aplicação. Por último, como será focado na API Rest (apenas no Back-end), não teremos interface gráfica, como páginas HTML e nem Front-end e aplicativo mobile.

Mas para testar a API, utilizar o Insomnia, sendo uma ferramenta usada para testes em API. Com ela, é possível simular a requisição para a API e verificar se as funcionalidades implementadas estão funcionando.
