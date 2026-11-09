# JavaAbstractInterface

Projeto desenvolvido em Java com o objetivo de demonstrar a aplicação dos conceitos de **Classes Abstratas** e **Interfaces**, recursos fundamentais da Programação Orientada a Objetos (POO). O sistema simula um controle de acesso de usuários, evidenciando o uso de herança, abstração, polimorfismo e contratos definidos por interfaces.

## Objetivo

Este projeto foi criado para fins educacionais, permitindo compreender na prática como:

- Definir contratos de comportamento utilizando interfaces.
- Criar estruturas base utilizando classes abstratas.
- Aplicar herança para especialização de comportamentos.
- Utilizar polimorfismo para tratar diferentes tipos de usuários de forma uniforme.
- Organizar aplicações Java seguindo os princípios da Programação Orientada a Objetos.

## Estrutura do Projeto

```text
JavaAbstractInterface
│
├── src
│   ├── IAcesso
│   ├── Administrador
│   ├── Usuario
│   ├── UsuarioComum
│   └── App
│
├── bin
│
└── README.md
```

## Componentes do Sistema

### IAcesso

Interface responsável por definir o contrato de acesso ao sistema.

As classes que implementam essa interface devem fornecer sua própria implementação para os métodos relacionados ao processo de autenticação e controle de acesso.

Exemplo conceitual:

```java
public interface IAcesso {
    boolean autenticar();
}
```

### Usuario

Classe abstrata que representa um usuário genérico do sistema.

Contém atributos e comportamentos comuns compartilhados por todos os tipos de usuários, funcionando como uma base para especializações futuras.

Responsabilidades:

- Armazenar informações básicas do usuário.
- Definir comportamentos comuns.
- Servir como superclasse para outros perfis de acesso.

### Administrador

Classe que representa usuários com privilégios administrativos.

Herda as características da classe `Usuario` e implementa os comportamentos definidos pela interface `IAcesso`, podendo possuir permissões adicionais dentro do sistema.

Características:

- Maior nível de acesso.
- Implementação específica das regras de autenticação.
- Possibilidade de executar operações administrativas.

### UsuarioComum

Classe destinada aos usuários padrão da aplicação.

Assim como o administrador, herda da classe `Usuario`, porém possui um conjunto de permissões mais restrito.

Características:

- Acesso limitado às funcionalidades básicas.
- Implementação própria do contrato definido pela interface.
- Demonstração de polimorfismo através da herança.

### App

Classe principal da aplicação.

Responsável pela execução do programa e pela criação dos objetos que demonstram o funcionamento das classes abstratas e interfaces implementadas.

## Relacionamento entre as Classes

```text
                 IAcesso
                    ▲
        ┌───────────┴───────────┐
                 Usuario
                (abstrata)
        └───────────┬───────────┘
                    ▲
        ┌───────────┴───────────┐
        │                       │
   Administrador         UsuarioComum
       
```

## Conceitos de POO Demonstrados

### Abstração

A classe `Usuario` representa uma abstração do conceito de usuário, reunindo atributos e métodos comuns.

### Herança

As classes `Administrador` e `UsuarioComum` reutilizam os recursos disponibilizados pela classe base `Usuario`.

### Interface

A interface `IAcesso` estabelece um contrato que deve ser seguido pelas classes que realizam autenticação ou controle de acesso.

### Polimorfismo

Objetos de diferentes tipos podem ser tratados por meio de referências da classe abstrata ou da interface, permitindo maior flexibilidade ao sistema.

## Fluxo de Execução

1. A aplicação é iniciada pela classe `App`.
2. Objetos dos tipos `Administrador` e `UsuarioComum` são criados.
3. Os usuários executam comportamentos definidos pela interface `IAcesso`.
4. O sistema demonstra a utilização de herança e polimorfismo.
5. Os resultados são exibidos no console.

## Exemplo Didático

```java
Usuario admin = new Administrador();
Usuario comum = new UsuarioComum();

admin.realizarAcesso();
comum.realizarAcesso();
```

Nesse exemplo, ambos os objetos são tratados como `Usuario`, mas executam comportamentos diferentes de acordo com sua implementação concreta.

## Tecnologias Utilizadas

- Java
- Programação Orientada a Objetos (POO)
- Visual Studio Code
- JDK 17 ou superior

## Como Executar

### Clonar o Repositório

```bash
git clone https://github.com/chrispimjose/JavaAbstractInterface.git
```

### Acessar a Pasta

```bash
cd JavaAbstractInterface
```

### Compilar o Projeto

```bash
javac src/*.java -d bin
```

### Executar a Aplicação

```bash
java -cp bin App
```


## Finalidade Acadêmica

Este projeto *pode ser utilizado* como material de apoio para disciplinas de:

- Programação Orientada a Objetos
- Linguagem de Programação Java
- Estruturas de Dados
- Engenharia de Software
- Desenvolvimento de Sistemas

## Autor

**José Padilha Chrispim Neto**  
Coordenador de Curso e Professor de Tecnologia da Informação

## Licença

Este projeto possui finalidade educacional e pode ser utilizado livremente para estudo, práticas de programação e demonstrações acadêmicas.
