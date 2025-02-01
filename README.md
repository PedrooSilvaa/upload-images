# Upload Images

Projeto desenvolvido com **Java** e **Spring Boot**, com foco no aprendizado de **upload de imagens** e armazenamento em um banco de dados relacional (**MySQL**).  

O projeto recebe uma imagem, a converte para **Base64** e a salva como **BLOB** no banco de dados. Também implementa um método **GET** para buscar a imagem pelo nome do arquivo e exibi-la.

## 🚀 Tecnologias Utilizadas

- **Java**: Linguagem principal do projeto.
- **Spring Boot**: Framework para construção da API.
- **MySQL**: Banco de dados utilizado para armazenamento das imagens.
- **JPA/Hibernate**: ORM para manipulação dos dados.
- **Spring Web**: Para criação dos endpoints REST.

## ✨ Funcionalidades

- **Upload de Imagem**: Recebe uma imagem e a armazena no banco de dados.
- **Conversão para Base64**: A imagem é transformada antes do armazenamento.
- **Armazenamento como BLOB**: Utiliza um banco relacional para salvar os arquivos.
- **Recuperação de Imagem**: Endpoint GET para buscar a imagem pelo nome do arquivo e exibi-la.

## 🛠️ Como Executar o Projeto

Para executar o projeto localmente, siga os passos abaixo:

1. Clone o repositório:
   ```bash
   git clone https://github.com/PedrooSilvaa/upload-images.git
