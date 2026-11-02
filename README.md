# Freezer CRUD API

API RESTful construída com Spring Boot voltada ao gerenciamento e inventário de itens, implementando operações básicas de criação, leitura, atualização e exclusão (CRUD).
O projeto foi desenvolvido como laboratório prático para assimilação da arquitetura em camadas de aplicações backend e aprendizados de banco relacional.

---

## Objetivos de Aprendizado

- Compreender e aplicar a arquitetura de software dividida em camadas (Controller, Service, Repository).
- Conhecer a interface de integração do Spring Boot e seus conceitos.
- Contato com bancos de dados relacionais.

---

## Padrões Arquiteturais Aplicados

- Controller: Camada de entrada para interceptação de requisições HTTP.
- Service: Centralização da lógica de negócios, regras de validação de dados e integridade dos itens cadastrados.
- Repository: Abstração por meio do banco de dados H2, permitindo resultados mais rápidos diante de um problema mais simples.
- Model/Entity: Classes de modelo contendo as anotações de mapeamento para as tabelas correspondentes do banco de dados.

---

## Tecnologias Utilizadas

- Linguagem: Java 21
- Framework: Spring Boot (Spring Web, Spring Data JPA, Spring Dev Tools)
- Banco de Dados: H2 Database (em memória para ambiente de testes e desenvolvimento)
- Interface: Endpoints HTTP / Console H2

---

## Mecânicas da API

- Operações CRUD: Suporte a métodos GET, POST, PUT e DELETE para administração dos recursos da entidade.
- Persistência em Memória: Configuração de banco relacional H2 para execução ágil sem dependências externas de infraestrutura.

---

## Desenvolvimento e Implementações

- Estrutura base da API construída com fluxo completo entre endpoint, regras de negócio e persistência. As divisões principais do projeto englobam:

- FoodController: Exposição dos endpoints REST e roteamento de requisições.
- FoodService: Camada responsável pelas regras de validação cadastral e atualização de registros.
- Food: Interface JPA responsável pelas operações diretas de consulta e escrita no banco H2.
- Food: Entidade JPA que define os atributos e metadados armazenados na tabela do banco.