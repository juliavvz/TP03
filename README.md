# TP03 - Classe Hora em Java

## Descrição do Projeto

Este projeto implementa uma classe `Hora` em Java para representar um horário completo (hora, minuto e segundo), utilizando conceitos de Programação Orientada a Objetos.

A aplicação possui validação de dados, diferentes formatos de exibição do horário e métodos interativos para entrada de dados pelo usuário.

---

# Funcionalidades

## Construtores

### `Hora()`
- O usuário digita os valores pelo teclado
- Possui validação de entrada

### `Hora(int h, int m, int s)`
- Recebe os valores diretamente por parâmetros

---

## Métodos Set

### Com parâmetros
- `setHor(int h)`
- `setMin(int m)`
- `setSeg(int s)`

Permitem alterar os valores diretamente.

### Sem parâmetros
- `setHor()`
- `setMin()`
- `setSeg()`

Solicitam os valores ao usuário via teclado com tratamento de erros.

---

## Métodos Get

- `getHor()`
- `getMin()`
- `getSeg()`

Retornam os valores armazenados do horário.

---

## Formatação

### Formato 24 horas

```java
getHora1()
```

Exemplo:

```plaintext
14:30:45
```

### Formato 12 horas (AM/PM)

```java
getHora2()
```

Exemplo:

```plaintext
02:30:45 PM
```

---

## Conversão

### Total de segundos

```java
getSegundos()
```

Retorna o total de segundos do horário.

Exemplo:

```plaintext
14:30:45 → 52245 segundos
```

---

# Tratamento de Erros

O projeto realiza validação para evitar:

- Horas fora do intervalo `0-23`
- Minutos fora do intervalo `0-59`
- Segundos fora do intervalo `0-59`
- Entrada de caracteres não numéricos

---

# Como Executar

## Pré-requisitos

- Java JDK 8 ou superior
- VS Code, NetBeans ou terminal

---

## Passos

### 1. Clone o repositório

```bash
git clone https://github.com/juliavvz/TP03.git
cd TP03
```

### 2. Compile os arquivos

```bash
javac src/Hora.java src/TesteHora.java
```

### 3. Execute o programa

```bash
java src.TesteHora
```

---

# Exemplo de Saída

```plaintext
=== TESTE DA CLASSE HORA ===

--- Teste 1: Construtor Hora(int, int, int) ---

Hora formato 24h: 13:14:15
Hora formato AM/PM: 01:14:15 PM
Total de segundos: 47655

GETTERS
Hora: 13
Minuto: 14
Segundo: 15

ALTERA HORA
Nova hora: 11:22:33

SEM PARAMETROS

Digite a hora (0-23): 08
Digite o minuto (0-59): 05
Digite o segundo (0-59): 10

Hora formato 24h: 08:05:10
Hora formato AM/PM: 08:05:10 AM
Total de segundos: 29110
```

---

# Estrutura do Projeto

```plaintext
TP03/
├── src/
│   ├── Hora.java
│   └── TesteHora.java
└── README.md
```

---

# Tecnologias Utilizadas

- Java
- Programação Orientada a Objetos (POO)
- VS Code / NetBeans

---

# Autores

Júlia Vitória - GitHub: @juliavvz
Lucas Antonio - GitHub: @rapaduragames

---

# Licença

Este projeto é livre para uso educacional.

## Vídeo teste do código rodando

- https://youtu.be/cVEGqFXWt8s
