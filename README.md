# 🦫 Capybara API (Backend)

Esta é a **API REST** responsável por gerenciar as informações do nosso sistema de capivaras. Ela atua como o servidor que recebe os pedidos do aplicativo, processa as regras de negócio e salva os dados no banco de dados.

---

## Tecnologias Utilizadas

- **Java 21**
- **Spring Boot** (v4.1.0)
- **Spring Data JPA** — comunicação com o banco de dados
- **Banco de Dados H2** — banco em memória para testes rápidos
- **Maven** — gerenciador de dependências

---

## Como Funciona?

O backend fornece os endpoints para que o frontend consiga **ler, criar, atualizar e deletar** capivaras.

Utilizamos o banco **H2**, que roda em memória. Isso significa que toda vez que a API for reiniciada, a lista de capivaras será zerada — o que é perfeito para a fase de desenvolvimento!

---

## Pré-requisitos

Antes de rodar o projeto, certifique-se de ter instalado:

- [Java 21+](https://adoptium.net/)
- [Maven](https://maven.apache.org/) *(ou use o wrapper `./mvnw` incluso no projeto)*

---

## Como Rodar o Projeto

Abra o terminal na raiz da pasta `capybara-api` e execute os comandos abaixo:

**1. Limpar o cache do projeto:**

```bash
./mvnw clean
```

**2. Iniciar o servidor:**

```bash
./mvnw spring-boot:run
```

> A API estará disponível em: **http://localhost:8080/api/capivaras**

---

## 📡 Endpoints Disponíveis

| Método   | Rota       | Descrição                                                   |
|----------|------------|-------------------------------------------------------------|
| `GET`    | `/`        | Retorna a lista de todas as capivaras cadastradas.          |
| `POST`   | `/`        | Cria uma nova capivara. Requer o envio de um JSON.          |
| `PUT`    | `/{id}`    | Atualiza os dados de uma capivara específica pelo seu ID.   |
| `DELETE` | `/{id}`    | Remove uma capivara do banco de dados pelo seu ID.          |

---

## Exemplo de JSON para Cadastro e Atualização

```json
{
  "nome": "Capitu",
  "peso": 45.5,
  "habitat": "Pantanal",
  "descricao": "Adora frutinhas!"
}
```

---

## 🗂️ Estrutura do Projeto

```
capybara-api/
├── src/
│   └── main/
│       ├── java/         # Código-fonte Java
│       └── resources/    # Configurações (application.properties)
├── pom.xml               # Dependências Maven
└── mvnw                  # Maven Wrapper
```

---

> **Dica:** Certifique-se de que o backend esteja rodando antes de iniciar o aplicativo frontend!
