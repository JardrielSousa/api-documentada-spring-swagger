# Descrição

A classe `UsuarioController` é um controlador REST responsável pela gestão de usuários em um aplicativo Spring Boot. Utiliza anotações do Spring Web para definir endpoints que permitem criar, obter, listar e deletar usuários. A classe faz uso do repositório `UsuarioRepository` para interagir com a base de dados e fornece os seguintes endpoints:

- **`GET /users`**: Retorna uma lista de todos os usuários cadastrados.
- **`GET /users/{username}`**: Retorna um usuário específico com base no nome de usuário.
- **`DELETE /users/{id}`**: Remove um usuário da base de dados com base no ID.
- **`POST /users`**: Adiciona um novo usuário à base de dados.

### Campos e Métodos

- **Logger**: Utiliza SLF4J para registrar mensagens de log em diferentes níveis (debug, info, warn).
- **`usuarioRepository`**: Instância do repositório `UsuarioRepository` injetada pelo Spring, responsável pelas operações de persistência de dados.
- **Métodos**:
  - `getUsers()`: Retorna todos os usuários.
  - `getUser(String username)`: Retorna um usuário específico pelo nome de usuário.
  - `delete(Integer id)`: Remove um usuário pelo ID.
  - `getUser(Usuario usuario)`: Salva um novo usuário.

# Instruções de Uso

1. **Listar Todos os Usuários**:
   - **Método HTTP**: `GET`
   - **Endpoint**: `/users`
   - **Descrição**: Retorna uma lista de todos os usuários cadastrados.

2. **Obter Usuário por Nome de Usuário**:
   - **Método HTTP**: `GET`
   - **Endpoint**: `/users/{username}`
   - **Parâmetro**: `{username}` - Nome de usuário do usuário a ser obtido.
   - **Descrição**: Retorna o usuário correspondente ao nome de usuário fornecido.

3. **Excluir Usuário por ID**:
   - **Método HTTP**: `DELETE`
   - **Endpoint**: `/users/{id}`
   - **Parâmetro**: `{id}` - ID do usuário a ser excluído.
   - **Descrição**: Remove o usuário com o ID fornecido.

4. **Salvar Novo Usuário**:
   - **Método HTTP**: `POST`
   - **Endpoint**: `/users`
   - **Corpo da Requisição**: JSON representando o usuário a ser salvo.
   - **Descrição**: Adiciona um novo usuário à base de dados.

### Exemplos de Requisição

- **Listar Usuários**:
  ```http
  GET /users HTTP/1.1
  Host: example.com


