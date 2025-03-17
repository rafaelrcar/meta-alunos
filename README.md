# 📘 Metas Alunos - JHipster

Este projeto foi criado utilizando [JHipster](https://www.jhipster.tech/) e tem como objetivo permitir o cadastro de alunos e suas metas de notas nas 4 áreas do ENEM:

- **Linguagens, Códigos e suas Tecnologias**
- **Ciências Humanas e suas Tecnologias**
- **Ciências da Natureza e suas Tecnologias**
- **Matemática e suas Tecnologias**

O acesso é feito apenas pelo administrador, que pode cadastrar alunos e definir suas metas de notas.

---

## 🚀 Funcionalidades

- Login como administrador
- Cadastro de alunos
- Cadastro de metas de notas para os alunos

---

## 🏗️ Instalação

### 1️⃣ Pré-requisitos

Certifique-se de ter os seguintes requisitos instalados:

- [Node.js](https://nodejs.org/) (versão recomendada: LTS)
- [npm](https://www.npmjs.com/)
- [Java JDK 17+](https://adoptium.net/)
- [Docker](https://www.docker.com/) e [Docker Compose](https://docs.docker.com/compose/)
- [JHipster CLI](https://www.jhipster.tech/):

  ```sh
  npm install -g generator-jhipster
  ```
  ### 2️⃣ Clonar o repositório
  ```sh
  git clone https://github.com/rafaelrcar/meta-alunos
  cd meta-alunos
  ```
  ### 3️⃣ Instalar dependências
  ```sh
  npm install
  ```
  ##🚀 Executando a Aplicação
  ### 1. Subir o banco de dados PostgreSQL com Docker
  ```sh
  docker-compose -f src/main/docker/postgresql.yml up -d
  ```
  ### 2. Rodar a aplicação no ambiente de desenvolvimento
   ```sh
  npm start
  ```
   A aplicação estará disponível em: http://localhost:9000
  ### 3. Rodar a aplicação no ambiente de produção
  ```sh
  ./mvnw -Pprod
  ```
  ## 🔑 Acesso e Uso

Acesse a plataforma em: [http://localhost:9000](http://localhost:9000)  

Faça login como administrador:  
- **Usuário:** `admin`
- **Senha:** `admin`

Passos para testar a aplicação:
1. Crie um aluno chamado **Lucas**.
2. Crie uma meta de **800 pontos** para o aluno **Lucas**.

## 📌 Tecnologias Utilizadas

- **JHipster** (Monolithic Application)
- **Spring Boot** (Backend)
- **Angular** (Frontend)
- **PostgreSQL** (Banco de Dados - Produção)
- **H2 Database** (Banco de Dados - Desenvolvimento)
- **JWT** (Autenticação)
