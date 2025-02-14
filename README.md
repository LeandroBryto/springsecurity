# springsecurity

📌 Sobre o projeto

Este projeto demonstra como implementar autenticação e autorização usando Spring Security 6 com JWT.

🚀 Tecnologias utilizadas

Java 21

Spring Boot 3.4.2

Spring Security 6

OAuth2 Resource Server

MySQL

⚙️ Configuração do ambiente

Clone o repositório:

git clone https://github.com/seu-usuario/springsecurity.git

Acesse a pasta do projeto:

cd springsecurity

Configure o banco de dados MySQL no application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/sua_base_de_dados
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha

Execute o projeto:

mvn spring-boot:run

🛠 Como interagir com o banco de dados?

Utilizamos o Beekeeper Community

📡 Como interagir com a API?

Utilizamos o Bruno

🐳 Rodando com Docker

Construa a imagem Docker:

docker build -t springsecurity .

Execute o container:

docker run -p 8080:8080 springsecurity

📖 Documentação da API (Swagger)

Acesse a documentação interativa no navegador:

http://localhost:8080/swagger-ui.html

👨‍💻 Desenvolvido por

Leandro Barreto de Brito

