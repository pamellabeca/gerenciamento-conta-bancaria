## Desafio de Lógica de Programação em Java: Gerenciamento de Conta Bancária

### Introdução

Este README detalha o desafio de lógica de programação em Java que desenvolvi como parte do curso "Java: Criando sua Primeira Aplicação" da formação "Aprenda a Programar em Java com Programação Orientada a Objetos" na Alura. A professora Jacqueline Oliveira apresentou o conceito do desafio e utilizei meus conhecimentos adquiridos até aqui para criar um programa funcional e completo.

### Descrição do Desafio

Este desafio simula o gerenciamento de uma conta bancária, permitindo ao usuário realizar as seguintes operações:

* **Consultar saldo:** Exibe o saldo atual da conta.
* **Receber valor:** Adiciona um valor ao saldo da conta.
* **Transferir valor:** Remove um valor do saldo da conta, desde que o valor seja inferior ou igual ao saldo disponível.
* **Sair:** Encerra a aplicação.

### Pré-requisitos

Para executar este código, você precisa ter o Java instalado em seu computador. Você pode baixar o Java gratuitamente no site oficial: [https://www.oracle.com/br/java/technologies/downloads/](https://www.oracle.com/br/java/technologies/downloads/).

### Instruções de Uso

1. **Clone o repositório:** 

```bash
git clone https://github.com/pamellabeca/gerenciamento-conta-bancaria.git
```

2. **Compile o código:**

```bash
javac Main.java
```

3. **Execute o programa:**

```bash
java Main
```

4. **Siga as instruções na tela para realizar as operações desejadas.**

### Detalhes do Código

O código é composto por uma classe `Main` que contém o método `main()`, onde a lógica principal do programa é implementada. As seguintes variáveis são utilizadas:

* `nomeDoUsuario`: Armazena o nome completo do usuário.
* `tipoDaConta`: Armazena o tipo da conta (Corrente ou Poupança).
* `saldoInicial`: Armazena o saldo inicial da conta.
* `opcaoMenuDeOperacoes`: Armazena a opção selecionada no menu principal.

O programa utiliza um loop `while` para apresentar o menu de operações e executar a ação escolhida pelo usuário até que a opção "Sair" seja selecionada.

### Exemplos de Uso

**Exemplo 1: Consultar saldo**

```
Digite seu nome completo: Maria Silva
Digite se o tipo da sua conta é 'Corrente' ou 'Poupança': Poupança
Digite seu saldo inicial: 1000.00
********************************************
Nome:           Maria Silva
Tipo conta:     Poupança
Saldo inicial:  R$1.000,00
********************************************

Operações

1- Consultar saldos
2- Receber valor
3- Transferir valor
4- Sair

Digite a opção desejada: 1

O saldo atual é de R$1.000,00

Operações

1- Consultar saldos
2- Receber valor
3- Transferir valor
4- Sair

Digite a opção desejada: ...
```

**Exemplo 2: Receber valor**

```
Digite seu nome completo: João Oliveira
Digite se o tipo da sua conta é 'Corrente' ou 'Poupança': Corrente
Digite seu saldo inicial: 500.00
********************************************
Nome:           João Oliveira
Tipo conta:     Corrente
Saldo inicial:  R$500,00
********************************************

Operações

1- Consultar saldos
2- Receber valor
3- Transferir valor
4- Sair

Digite a opção desejada: 2

Informe o valor a receber: 200.00

Saldo atualizado: R$700,00

Operações

1- Consultar saldos
2- Receber valor
3- Transferir valor
4- Sair

Digite a opção desejada: ...
```

**Exemplo 3: Transferir valor**

```
Digite seu nome completo: Ana Souza
Digite se o tipo da sua conta é 'Corrente' ou 'Poupança': Poupança
Digite seu saldo inicial: 1500.00
********************************************
Nome:           Ana Souza
Tipo conta:     Poupança
Saldo inicial:  R$1.500,00
********************************************

Operações

1- Consultar saldos
2- Receber valor
3- Transferir valor
4- Sair

Digite a opção desejada: 3

Informe o valor que deseja transferir: 300.00

Saldo atualizado: R$1.200,00

Operações

1- Consultar saldos
2- Receber valor
3- Transferir valor
4- Sair

Digite a opção desejada: ...
```

### Considerações Finais

Este desafio me permitiu aplicar os conhecimentos adquiridos no curso "Java: Criando sua Primeira Aplicação" de forma prática e desafiadora. A experiência de desenvolver um programa funcional e completo me motivou a continuar aprendendo e me aprofundando na linguagem Java.

### Contribuições

Este projeto está disponível no repositório [https://github.com/pamellabeca/gerenciamento-conta-bancaria](https://github.com/pamellabeca/gerenciamento-conta-bancaria) no GitHub. Sinta-se à vontade para contribuir com sugestões, melhorias e correções de bugs.

### Agradecimentos

Agradeço à professora Jacqueline Oliveira por apresentar o desafio e por seu apoio durante o curso.
