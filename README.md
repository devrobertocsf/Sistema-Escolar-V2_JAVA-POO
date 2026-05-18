# 🧬 Sistema Escolar V2 - Herança Avançada e Polimorfismo (Java POO)

Este repositório contém a versão evoluída do Sistema Escolar, desenvolvida para explorar conceitos avançados de árvore de herança, restrições de instanciação e especialização de comportamento em Java.

## 🎯 Conceitos Avançados Aplicados

Neste projeto, a hierarquia de classes foi estruturada para demonstrar na prática a diferença entre os tipos de herança e o uso de modificadores de acesso estruturais:

### 1. Tipos de Herança Utilizados

* **Herança de Implementação (Herança Pobre)**: Implementada na classe `Visitante`. Ela herda de forma limpa os atributos e métodos da superclasse `Pessoa`, sem acrescentar novas propriedades.
* **Herança para Diferença**: Aplicada nas classes `Aluno`, `Professor`, `Funcionario`, `Tecnico` e `Bolsista`. Elas estendem suas respectivas classes ancestrais, mas implementam comportamentos e atributos específicos do seu domínio (ex: `bolsa` em Bolsista, `registroProfissional` em Técnico).

### 2. Modificadores Estruturais

* **Classe Abstrata (`abstract class Pessoa`)**: Configurada para impedir a instanciação direta. `Pessoa` serve exclusivamente como superclasse progenitora, garantindo que apenas entidades reais (como Aluno ou Professor) existam no sistema.
* **Método Final (`final void fazerAniv`)**: Método blindado contra sobrescritas. As subclasses não podem alterar a regra de negócio de incremento de idade.
* **Sobrescrita de Método (`@Override`)**: A classe `Bolsista` altera o comportamento do método `pagarMensalidade()` herdado de `Aluno`, demonstrando o conceito de polimorfismo de sobreposição.

## 📂 Estrutura das Classes

* `Pessoa.java` *(Abstract)*: Molde principal com dados comuns (Nome, Idade, Sexo).
* `Visitante.java`: Herança de implementação pura de Pessoa.
* `Aluno.java` & `Funcionario.java` & `Professor.java`: Subclasses com herança para diferença.
* `Bolsista.java` & `Tecnico.java`: Subclasses que estendem `Aluno`, criando terceiros níveis na árvore genealógica do código.
* `Principal.java`: Classe de execução onde os objetos são testados e as regras de restrição (como o bloqueio de instância de Pessoa) são validadas.

## 💻 Demonstração de Saída

Ao instanciar um `Visitante` e exibir seus dados com o método `toString()` sobrescrito da classe Object:

```text
Pessoa [nome=Juvena
, idade=25
, sexo=M]

```

---

*Projeto desenvolvido por Roberto Carlos como parte dos estudos práticos de engenharia de software e POO com Java.*

---
