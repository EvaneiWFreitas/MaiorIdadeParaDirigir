# 🚗 Maioridade para Dirigir

Programa desenvolvido em **Java** para verificar se uma pessoa atende aos critérios definidos pelo programa para poder dirigir, 
considerando sua **idade** e sua **condição de emancipação**.

O projeto foi desenvolvido com foco no aprendizado dos fundamentos da linguagem Java, especialmente **entrada de dados, estruturas 
condicionais, operadores lógicos e estruturas de repetição**.

---

## 📋 Sobre o Projeto

O programa solicita ao usuário:

1. Sua idade;
2. Se é emancipado;
3. Verifica as condições para dirigir;
4. Exibe o resultado da consulta;
5. Pergunta se o usuário deseja realizar uma nova consulta.

O programa permanece em execução enquanto o usuário responder **"S"** para continuar.

---

## 🎯 Objetivo

O objetivo principal deste projeto é praticar conceitos fundamentais de programação em Java, como:

* Entrada de dados pelo teclado;
* Variáveis;
* Tipos primitivos;
* Estruturas condicionais;
* Operadores lógicos;
* Estrutura de repetição `do-while`;
* Comparação de valores;
* Utilização da classe `Scanner`;
* Documentação utilizando **JavaDoc**.

---

## ⚙️ Regra Utilizada

Para fins didáticos, o programa utiliza as seguintes regras:

| Condição                                | Resultado          |
| --------------------------------------- | ------------------ |
| Idade igual ou superior a 18 anos       | ✅ Pode dirigir     |
| Pessoa emancipada e com 16 anos ou mais | ✅ Pode dirigir     |
| Menor de 16 anos                        | ❌ Não pode dirigir |
| Pessoa com 16 ou 17 anos não emancipada | ❌ Não pode dirigir |

A condição principal utilizada no código é:

```java
if (idade >= 18 || (emancipado && idade >= 16)) {
    System.out.println("\nParabéns! Você pode dirigir.");
} else {
    System.out.println("\nInfelizmente, você não pode dirigir.");
}
```

### 🔎 Como funciona a condição?

A expressão utiliza os operadores lógicos:

* `||` → **OU**
* `&&` → **E**
* `>=` → **maior ou igual**

A pessoa será considerada apta pelo programa quando:

```text
idade >= 18
```

**OU**

```text
emancipado == true E idade >= 16
```

---

## 🛠️ Tecnologias Utilizadas

* **Java**
* **Scanner**
* **IntelliJ IDEA / Eclipse / VS Code / NetBeans** ou outra IDE compatível
* **JavaDoc**
* **Git e GitHub** (opcional)

---

## 📁 Estrutura do Projeto

Uma estrutura simples para o projeto:

```text
MaiorIdadeParaDirigir/
│
├── src/
│   └── MaiorIdadeParaDirigir.java
│
└── README.md
```

---

## 💻 Código Principal

O programa utiliza a classe:

```java
public class MaiorIdadeParaDirigir
```

A entrada de dados é realizada utilizando:

```java
Scanner sc = new Scanner(System.in);
```

A idade é armazenada em uma variável inteira:

```java
int idade = sc.nextInt();
```

E a informação sobre emancipação é armazenada em uma variável booleana:

```java
boolean emancipado = sc.nextBoolean();
```

---

## 🔄 Estrutura de Repetição

O programa utiliza a estrutura:

```java
do {
    // processamento
} while (continuar.equalsIgnoreCase("S"));
```

A utilização do `do-while` garante que o programa seja executado **pelo menos uma vez**.

Depois de realizar a consulta, o usuário pode escolher:

```text
Deseja realizar uma nova consulta? (S/N):
```

Se informar `S`, uma nova consulta será realizada.

Se informar `N`, o programa será encerrado.

O método:

```java
equalsIgnoreCase()
```

permite aceitar tanto:

```text
S
```

quanto:

```text
s
```

---

## ▶️ Como Executar

### 1. Instale o Java

Certifique-se de que o **JDK (Java Development Kit)** esteja instalado no computador.

Verifique pelo terminal:

```bash
java -version
```

Também pode verificar o compilador:

```bash
javac -version
```

---

### 2. Compile o programa

Abra o terminal na pasta onde está o arquivo:

```text
MaiorIdadeParaDirigir.java
```

Execute:

```bash
javac MaiorIdadeParaDirigir.java
```

---

### 3. Execute o programa

Depois da compilação:

```bash
java MaiorIdadeParaDirigir
```

---

## 🖥️ Exemplo de Execução

```text
=================================
     VERIFICAÇÃO PARA DIRIGIR
=================================

Qual é a sua idade? 20
Você é emancipado? (true/false): false

Parabéns! Você pode dirigir.

Deseja realizar uma nova consulta? (S/N): s
```

Nova consulta:

```text
=================================
     VERIFICAÇÃO PARA DIRIGIR
=================================

Qual é a sua idade? 16
Você é emancipado? (true/false): true

Parabéns! Você pode dirigir.

Deseja realizar uma nova consulta? (S/N): n
```

Ao escolher `N`:

```text
=================================

Programa encerrado!
Obrigado por utilizar o Programa Maior Idade para Dirigir.
Programa Desenvolvido por: Engenheiro de Software, Evanei Freitas.
=================================
```

---

## 📚 Conceitos de Java Praticados

Este projeto trabalha vários conceitos importantes para quem está iniciando em Java.

### Variáveis

```java
int idade;
boolean emancipado;
String continuar;
```

### Entrada de dados

```java
Scanner sc = new Scanner(System.in);
```

### Estrutura condicional

```java
if (...) {
    
} else {
    
}
```

### Operador lógico OR

```java
||
```

Representa **OU**.

### Operador lógico AND

```java
&&
```

Representa **E**.

### Estrutura de repetição

```java
do {
    
} while (...);
```

### Comparação

```java
>=
```

Significa **maior ou igual a**.

### Ignorar diferença entre maiúsculas e minúsculas

```java
equalsIgnoreCase()
```

---

## 📖 Documentação JavaDoc

O código também possui documentação utilizando **JavaDoc**, permitindo gerar uma documentação HTML do programa.

Para gerar a documentação:

```bash
javadoc -d docs MaiorIdadeParaDirigir.java
```

Depois, abra o arquivo:

```text
docs/index.html
```

no navegador.

---

## ⚠️ Observação Importante

Este projeto possui **finalidade exclusivamente educacional**.

As regras utilizadas no programa são uma simplificação criada para praticar lógica de programação e **não devem ser consideradas uma orientação jurídica ou legal sobre habilitação para dirigir**.

Para situações reais, devem ser consultadas as normas de trânsito e os requisitos legais vigentes.

---

## 👨‍💻 Autor

**Evanei Freitas**
**Formado em: Bacharel em Engenharia de Software**
**Pós-Graduando em : CYBERCRIME E CYBERSECURITY: PREVENÇÃO E INVESTIGAÇÃO DE CRIMES DIGITAIS**

🎓 Bacharel em Engenharia de Software

💻 Desenvolvedor de Software

📚 Projeto desenvolvido para fins de estudo e prática da linguagem Java.

---

## 📌 Versão

**Versão:** 1.0
**Ano:** 2026
**Linguagem:** Java

---

## 📄 Licença

Este projeto foi desenvolvido para fins **educacionais e de aprendizado**.

Você pode utilizar o código para estudar, modificar e aprimorar seus conhecimentos em programação Java.
