# Rent Car
<!--
## 📍 Sobre Nós

No **Nome do Stand**, dedicamo-nos a oferecer veículos de qualidade, com transparência e um atendimento próximo. Trabalhamos com viaturas selecionadas, garantindo segurança e confiança em cada negócio.
-->
## Campos da Base de Dados

## Atomoveis
* Matrícula
* Marca
* Modelo
* Cor
* Cilindrada
* Ano
* Valor por dia

## Clientes

* Carta de Condução
* Nome
* Morada
* Cartão do Cidadão (CC)
---
#  Manual do Utilizador — Sistema RentCar

## 📌 Introdução

O **RentCar** é uma aplicação em Java executada em consola que permite gerir:

* Automóveis
* Clientes

O sistema possibilita inserir, listar, pesquisar e eliminar registos de forma simples.

---

## ▶️ Como Executar

1. Compilar o programa:

```bash
javac RentCar.java
```

2. Executar:

```bash
java RentCar
```

---

## 🧭 Menu Principal

Ao iniciar o programa, será apresentado o seguinte menu:

```
--- MENU PRINCIPAL ---
1 - Gerir Automóveis
2 - Gerir Clientes
0 - Sair
```

### Opções disponíveis:

* **1** → Aceder à gestão de automóveis
* **2** → Aceder à gestão de clientes
* **0** → Encerrar o programa

---

## 🚘 Gestão de Automóveis

### Menu:

```
--- AUTOMÓVEIS ---
1 - Inserir
2 - Listar
3 - Pesquisar
4 - Eliminar
0 - Voltar
```

### 🔹 Inserir Automóvel

Permite adicionar um novo veículo.

**Dados solicitados:**

* Matrícula (única)
* Marca
* Modelo
* Cor
* Cilindrada
* Ano
* Valor por dia

⚠️ Se a matrícula já existir, o sistema apresenta erro.

---

### 🔹 Listar Automóveis

Mostra todos os automóveis registados no formato:

```
Matrícula | Marca Modelo | Valor€/dia
```

---

### 🔹 Pesquisar Automóvel

Pesquisa um automóvel pela matrícula.

* Se existir → mostra marca e modelo
* Se não existir → apresenta "Não encontrado."

---

### 🔹 Eliminar Automóvel

Remove um automóvel pela matrícula.

* Se encontrado → removido com sucesso
* Caso contrário → "Não encontrado."

---

## 👤 Gestão de Clientes

### Menu:

```
--- CLIENTES ---
1 - Inserir
2 - Listar
3 - Pesquisar
4 - Eliminar
0 - Voltar
```

### 🔹 Inserir Cliente

Permite registar um novo cliente.

**Dados solicitados:**

* Carta de condução (única)
* Nome
* Morada
* Cartão de Cidadão (CC)

⚠️ Não é permitido duplicar cartas de condução.

---

### 🔹 Listar Clientes

Mostra todos os clientes:

```
Nome | Carta: XXXXX
```

---

### 🔹 Pesquisar Cliente

Pesquisa por número de carta de condução.

* Se encontrado → mostra o nome
* Caso contrário → "Não encontrado."

---

### 🔹 Eliminar Cliente

Remove um cliente pela carta de condução.

---

## ⚠️ Limitações do Sistema

* Máximo de **100 automóveis**
* Máximo de **100 clientes**
* Dados não são guardados permanentemente (perdem-se ao fechar o programa)
* Interface apenas em consola

---

## 💡 Recomendações

* Introduzir dados corretamente (especialmente matrícula e carta)
* Evitar duplicações
* Fazer testes com poucos registos antes de uso intensivo

---

## 🛠️ Possíveis Melhorias Futuras

* Guardar dados em ficheiro ou base de dados
* Interface gráfica
* Sistema de aluguer de viaturas
* Validação de dados mais robusta

---



<!--
## 📞 Contactos

* 📍 Localização: [Inserir morada]
* 📞 Telefone: [Inserir número]
* 📧 Email: [Inserir email]
* 🌐 Website: [Inserir website]

## ⏰ Horário de Funcionamento

* Segunda a Sexta: [horário]
* Sábado: [horário]
* Domingo: [horário ou encerrado]

## 🤝 Porquê Escolher-nos?

✔ Transparência e confiança
✔ Viaturas selecionadas
✔ Atendimento personalizado
✔ Processo rápido e seguro

---

### 🚀 Siga-nos

Acompanhe as nossas novidades e promoções:

* Facebook: [link]
* Instagram: [link]

---

**Nome do Stand Automóvel** — Conduzimos confiança.
-->
