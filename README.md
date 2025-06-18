# 🛒 Lista de Compras em Java

Este é um projeto simples em Java que implementa um sistema de **lista de compras**, onde é possível adicionar, remover, editar e listar itens.

## 📌 Funcionalidades

- [x] Adicionar item à lista
- [x] Remover item da lista
- [x] Listar todos os itens
- [x] Editar item da lista
- [x] Cálculo automático do valor total de cada item (`quantidade * preço`)

## 📦 Estrutura do Projeto

```bash
.
├── application/
│   └── Program.java       # Classe principal com o menu e a lógica de interação
├── entities/
│   └── Shopping.java      # Classe que representa um item da lista de compras
├── util/
│   └── Operations.java    # Classe com métodos auxiliares para manipular a lista
```

## 🧠 Como funciona

Ao executar o programa, será exibido um menu com opções numeradas:
```
[1] - Adicionar item
[2] - Remover itens
[3] - Listar itens
[4] - Editar itens
[5] - Sair
```

### Exemplo de uso:
- Adicione itens digitando nome, quantidade e preço.
- Remova itens informando o nome.
- Edite os dados de um item existente.
- Veja os itens listados com o total de cada um (`quantidade * preço`).

## 🛠️ Tecnologias Utilizadas

- Java SE
- IDE recomendada: IntelliJ IDEA ou Eclipse
- Scanner para entrada de dados
- `ArrayList` para armazenar os itens da lista
