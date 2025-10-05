# Padrão Factory Method

Este projeto foi realizado para uma atividade da disciplina DCC078 - Aspectos Avançados em Engenharia de Software, que aborda o padrão de projeto Abstract Factory. Nele, temos uma implementação para uma Casa de Eventos, onde diferentes tipos de Eventos podem ser agendados.

**Aluno**: Gabriel do Carmo Silva\
**Matrícula**: 202065030C

---
## 📁 Estrutura do Projeto

```text
padraoabstractfactory/
├── src/
│   ├── main
│   │   ├── java
|   |   |  ├── casadeeventos/     # (pacote com as classes, incluindo a factory, a interface e os tipos de evento)
│   ├── test
│   │   ├── java
|   |   |  ├── casadeeventos/     # (pacote com os testes das classes implementadas)
├── pom.xml
├── .gitignore                      
└── README.md
```

---
## 📦 Tecnologias / Ferramentas

Foi instalada a última versão do IntelliJ (disponível no [site da JetBrains](https://www.jetbrains.com/pt-br/idea/download/?section=windows)) e criado um novo projeto Java usando o Maven para esta atividade. 

---
## 🧱 Padrão Factory Method no Projeto

Principais classes e interfaces:
 - **FabricaAbstrata**: interface na qual é um contrato que obriga qualquer fábrica concreta a saber produzir um Show e um Casamento, garantindo consistência na criação de objetos relacionados.
 - **Evento**: Evento depende da fábrica abstrata para montar seus objetos (casamento e show) sem precisar saber como eles são criados. Isso garante flexibilidade, já que basta trocar a fábrica para mudar o tipo de casamento e show usados.
 - As demais classes usam essa estrutura, para criar Casamento e Show em lugar aberto ou fechado, e podem ser expandidas para outros tipos.
 - No projeto também foram implementados testes para esse padrão.

---
## 📄 Diagrama de classes
<img width="985" height="641" alt="image" src="https://github.com/user-attachments/assets/1a050edb-4c2a-421b-b5b0-c508f7eb6b44" />

