# Gerenciador de Tarefas – Aplicação dos Princípios SOLID

Este projeto é uma aplicação simples em Java 17 que implementa um gerenciador de tarefas utilizando os cinco princípios do SOLID. O objetivo é demonstrar boas práticas de orientação a objetos, separação de responsabilidades e injeção de dependências, sem o uso de persistência externa (tudo é mantido em memória).

## Sumário

- [Visão Geral](#visão-geral)
- [Detalhamento dos Componentes](#detalhamento-dos-componentes)
  - [Domínio](#domínio)
  - [Serviço](#serviço)
  - [Apresentação](#apresentação)
  - [Classe Principal](#classe-principal)
- [Aplicação dos Princípios SOLID](#aplicação-dos-princípios-solid)

## Visão Geral

A aplicação permite:
- **Criar novas tarefas:** O usuário informa um título e uma prioridade.
- **Listar todas as tarefas:** Exibe a lista de tarefas com seus status (concluída ou não).
- **Marcar tarefas como concluídas:** Seleciona uma tarefa para marcar como finalizada.
- **Filtrar tarefas por prioridade:** Permite visualizar tarefas de uma prioridade específica.

A interface é feita via console (terminal) e a aplicação é dividida em três camadas principais: **Domínio**, **Serviço** e **Apresentação**.


## Detalhamento dos Componentes

### Domínio

#### Task.java
- **Responsabilidade:** Representa uma tarefa com atributos _title_, _priority_ e _done_ (indicando se a tarefa está concluída ou não).
- **Princípio Aplicado:** *Single Responsibility Principle (SRP)*  
  A classe se preocupa somente com os dados e comportamentos inerentes a uma tarefa.
- **Comentários no Código:**  
  Cada método possui comentários que explicam sua função. O método `toString()` gera uma representação textual da tarefa, permitindo a separação da lógica de apresentação.

#### TaskManager.java
- **Responsabilidade:** Gerencia a lista de tarefas, permitindo adicionar, recuperar e filtrar tarefas.
- **Princípio Aplicado:** *SRP*  
  Essa classe centraliza a manipulação da coleção de tarefas.
- **Comentários no Código:**  
  O método `filterByPriority` utiliza *streams* para criar um código mais limpo e expressivo.

#### Completable.java
- **Responsabilidade:** Define a capacidade de marcar uma tarefa como concluída.
- **Princípio Aplicado:** *Interface Segregation Principle (ISP)*  
  Fornece uma interface pequena e focada que somente declara o que é necessário para concluir uma tarefa.

### Serviço

#### TarefasService.java
- **Responsabilidade:** Implementa a lógica de negócio para criar, listar, marcar e filtrar tarefas.
- **Princípio Aplicado:** *SRP* e *Dependency Inversion Principle (DIP)*  
  O serviço não lida com a entrada/saída diretamente, apenas recebe os dados (como strings ou índices) e interage com o `TaskManager`.
- **Comentários no Código:**  
  Cada método explica sua função, por exemplo, o método `criarTarefas` solicita dados e cria uma nova instância de `Task`.

#### ITaskPrinter.java & ConsoleTaskPrinter.java
- **Responsabilidade:** Fornecer abstração para impressão das tarefas e implementar essa funcionalidade para o console.
- **Princípios Aplicados:**  
  - *Open/Closed Principle (OCP):* O código está aberto para extensão (por exemplo, criação de novas implementações de ITaskPrinter) sem modificar o código existente.
  - *Dependency Inversion Principle (DIP):* Componentes dependem de abstrações e não de implementações concretas.
- **Comentários no Código:**  
  A interface declara o contrato para impressão, enquanto a classe `ConsoleTaskPrinter` implementa esse contrato usando o `System.out.println`.

### Apresentação

#### ConsoleMenu.java
- **Responsabilidade:** Gerencia a interação com o usuário via console, exibindo o menu, capturando entradas e delegando ações para o serviço.
- **Princípio Aplicado:** *SRP*  
  Essa classe foca somente na camada de apresentação, sem misturar a lógica de negócio.
- **Comentários no Código:**  
  Explica o uso do `try-with-resources` para o Scanner e como cada opção do menu é processada via um `switch`.

### Classe Principal

#### Main.java
- **Responsabilidade:** Ponto de entrada da aplicação, onde as dependências são injetadas e o menu principal é iniciado.
- **Princípio Aplicado:** *Dependency Inversion (DIP)*  
  As instâncias de `TaskManager` e `ITaskPrinter` são criadas e injetadas em `ConsoleMenu`, facilitando testes e manutenções futuras.
- **Comentários no Código:**  
  O método `main` explica o fluxo de criação e injeção das dependências, e como a execução é iniciada.

## Aplicação dos Princípios SOLID

- **Single Responsibility Principle (SRP):**  
  Cada classe possui uma única responsabilidade (por exemplo, `Task` para dados de tarefas, `TaskManager` para gerenciamento de tarefas, `ConsoleMenu` para interação com o usuário).

- **Open/Closed Principle (OCP):**  
  Através do uso de interfaces (como `ITaskPrinter`), a aplicação permite a adição de novas funcionalidades (como impressoras para outros dispositivos) sem alterar o código já existente.

- **Liskov Substitution Principle (LSP):**  
  As classes que implementam as interfaces (por exemplo, `ConsoleTaskPrinter` implementa `ITaskPrinter`) podem ser substituídas sem afetar o comportamento do sistema.

- **Interface Segregation Principle (ISP):**  
  Interfaces específicas, como `Completable`, são criadas para que as classes implementem apenas os métodos que realmente utilizam, evitando a imposição de métodos desnecessários.

- **Dependency Inversion Principle (DIP):**  
  As dependências são injetadas (por exemplo, `TaskManager` e `ITaskPrinter` são passados via construtor para `ConsoleMenu`), permitindo que as classes dependam de abstrações e não de implementações concretas.

