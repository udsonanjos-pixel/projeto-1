Meu projeto de biblioteca em java.

# Sistema de Gerenciamento de Biblioteca

Aplicaçâo voltada para o controle de acervo, usuários e empréstimos de livros, desenvolvida como projeto prático durante a graduação em Análise e Desenvolvimento de Sistemas na UCSAL.

## Tecnologias e Conceitos Utilizados

- **Linguagem:** Java
- **Paradigma:** Programação Orientada a Objetos (POO)
- **Estruturas de Dados:** Uso de Coleções (Collections) para manipulação dinâmica de registros em memória.
- **Robustez:** Implementação de tratamento de exceções para consistência dos fluxos de negócio.

## Estrutura do Projeto

O sistema está modularizado nos seguintes componentes principais dentro do pacote `src/biblioteca`:

- `Main.java`: Ponto de entrada da aplicação que gerencia a execução e interação do sistema.
- `Biblioteca.java`: Classe responsável pela regra de negócio, concentrando as coleções de dados e os métodos de gerenciamento do acervo.
- `Livro.java`: Modelo representativo dos dados e atributos do acervo.
- `Usuario.java`: Modelo representativo dos dados dos locatários.
