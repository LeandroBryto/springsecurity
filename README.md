# 📌 Sobre o projeto

Este projeto demonstra como implementar autenticação e autorização usando Spring Security 6 com JWT.

🚀 **Tecnologias utilizadas**

- Java 21
- Spring Boot 3.4.2
- Spring Security 6
- OAuth2 Resource Server
- MySQL

⚙️ **Configuração do ambiente**

1. Clone o repositório:

    ```bash
    git clone https://github.com/seu-usuario/springsecurity.git
    ```

2. Acesse a pasta do projeto:

    ```bash
    cd springsecurity
    ```

3. Configure o banco de dados MySQL no arquivo `application.properties`:

    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/sua_base_de_dados
    spring.datasource.username=seu_usuario
    spring.datasource.password=sua_senha
    ```

4. Execute o projeto:

    ```bash
    mvn spring-boot:run
    ```

🛠 **Como interagir com o banco de dados?**

Utilizamos o **Beekeeper Community**.

📡 **Como interagir com a API?**

Utilizamos o **Bruno**.

🐳 **Rodando com Docker**

1. Construa a imagem Docker:

    ```bash
    docker build -t springsecurity .
    ```

2. Execute o container:

    ```bash
    docker run -p 8080:8080 springsecurity
    ```

📖 **Documentação da API (Swagger)**

Acesse a documentação interativa no navegador:

[http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

👨‍💻 **Desenvolvido por**

Leandro Barreto de Brito
