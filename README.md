# ☕Sistema de Gestão Acadêmica - Java Swing & Hibernate
Este projeto consiste em uma aplicação desktop para o gerenciamento de alunos, desenvolvida como requisito para a disciplina de Programação. O sistema integra interface gráfica (GUI), manipulação de coleções em memória, persistência em arquivos planos (CSV) e integração com banco de dados via ORM (Hibernate).

### 🛠️ 1. Gestão de Alunos (Java Bean)
A classe Aluno atua como um Java Bean, contendo os seguintes atributos e seus respectivos métodos getters/setters:
- Matrícula
- Nome
- Idade
- Data de Nascimento (Formato dd/mm/yyyy)
- Telefone e CPF

### 🛠️ 2. Funcionalidades da Interface
- **Cadastro:** Formulário Swing para salvar alunos em uma lista.
- **Validação:** Uso de exceções para impedir a inserção de matrículas duplicadas.
- **Busca e Relatórios:**  Obtenção de aluno por matrícula e contador de elementos.
e identificação automática do aluno mais novo e mais velho ao percorrer a lista.
- **Manipulação de Posição:** Inserção de novos alunos em posições genéricas (ex: 3ª posição).
Exibição: Botão que executa um segundo formulário para exibir todos os alunos salvos em memória.

### 🛠️ 3. Persistência e Arquitetura
- **Arquivo CSV:** Exportação dos registros para o arquivo ListagemAlunos.txt.
- **Hibernate:** Mapeamento objeto-relacional para salvar e atualizar registros no banco de dados.
- **Padrão DAO** (Data Access Object): Uso da interface AlunoDAO de exclusão de objetos.

## 🛠️ Tecnologias e Ferramentas
- **Linguagem:** Java
- **IDE:** Apache NetBeans
- **Interface Gráfica:** Java Swing
- **Persistência de Dados:** Hibernate (ORM)
- **Banco de Dados:** MySQL Workbench
- **Estrutura de Dados:** Java Collections Framework (java.util)

## 📋 Requisitos do Sistema

Para rodar este projeto, você precisará ter instalado em sua máquina:

* **Java JDK** (versão 24 ou superior recomendada)
* **Git**
* **MySQL Server**
* **MySQL Workbench** 
* **Apache NetBeans IDE 25** 

## 🚀 Como Configurar e Rodar

Siga estritamente os passos abaixo para preparar o ambiente antes de iniciar a aplicação.
### Passo 1: 📋 Clone o Repositório

Abra seu terminal e rode:

      git clone https://github.com/aliciassantos/Cadastro_de_alunos_POO.git
      cd Cadastro_de_alunos_POO

### Passo 2: 🗄️ Configuração do Banco de Dados 
1. Abra o MySQL Workbench.
2. Conecte-se ao seu servidor local (Local instance).
3. Abra uma nova aba de Query (SQL) e execute o seguinte comando para criar o banco de dados necessário:


       CREATE DATABASE aluno;

***Nota:*** O Hibernate está configurado para gerar a tabela Aluno automaticamente (hbm2ddl.auto = update), desde que o banco de dados aluno já tenha sido criado manualmente conforme acima.

### Passo 3: 🔑 Configuração de Credenciais (Importante!) 
Você precisa configurar o projeto para usar o seu usuário e senha do MySQL local.
1. No projeto, navegue até o arquivo de configuração: src/main/resources/hibernate.cfg.xml
2. Abra o arquivo e localize as seguintes linhas:

```<property name="hibernate.connection.username">root</property>```

```<property name="hibernate.connection.password">gbm$#10o3@!2*</property>```

3. Altere os valores:
- Onde está root, coloque seu usuário do MySQL (geralmente é root mesmo).
- Onde está gbm$#10o3@!2*, coloque a sua senha do MySQL que você definiu na instalação.

4. Salve o arquivo.

### Passo 4: ▶️ Executando o Projeto 
Agora que o banco está criado e as senhas configuradas:
1. Abra o projeto na sua IDE.
2. Aguarde o TrabalhoFfinalAliciaGeovanna baixar as dependências.
3. Localize a classe principal (que contém o método main).
4. Execute a aplicação.

## 👥 Equipe (UESPI)
- Alicia Silva Santos
- Geovanna Bruno Meneses



