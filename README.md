# viacep-restTemplate-spring

## responsibilities

This project is responsible for consuming the zip-code api (via-cep) in a simple way using restTemplate.

### :books: Table of contents

- [viacep-restTemplate-spring](#viacep-resttemplate-spring)
  - [responsibilities](#responsibilities)
    - [:books: Table of contents](#books-table-of-contents)
    - [:inbox\_tray: Input](#inbox_tray-input)
    - [:outbox\_tray: Output](#outbox_tray-output)
    - [:memo: Requirements](#memo-requirements)
    - [:package: Third-party dependencies](#package-third-party-dependencies)
    - [:computer: How to](#computer-how-to)
      - [Run locally](#run-locally)
        - [Endpoint usage example](#endpoint-usage-example)

---

### :inbox_tray: Input

- **Endpoints**: /rest-api/busca/cep

---

### :outbox_tray: Output

-
  {
    "cep": "12345-324",
    "endereco": "Rua teste",
    "bairro": "Teste",
    "cidade": "Cidade",
    "estado": "TS"
  }

---

### :memo: Requirements

- [Java 17](https://www.oracle.com/java/technologies/downloads/#java17)

- [Maven 3.3+](https://maven.apache.org/download.cgi)

---

### :package: Third-party dependencies

- [Via-Cep](https://viacep.com.br/)

---

### :computer: How to

#### Run locally

- Run local (default port: 8080, Configure the port by changing `server.port` in **application.yml**)

```bash
mvn spring-boot:run
```

##### Endpoint usage example

- Request

```curl
curl -X 'GET' \ 
  'http://localhost:8080/rest-api/busca/123214'
```

---
