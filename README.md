Sistema de Bootcamp - DIO

Este é um projeto Java que simula a estrutura de um bootcamp educacional, com alunos, professores, cursos e mentorias. Ele foi desenvolvido como parte do desafio final da matéria "Estrutura de Dados e APIs de Streams em Java" do curso Java Developer da plataforma DIO (Digital Innovation One).

O principal objetivo foi aplicar os conceitos aprendidos durante o curso, como orientação a objetos, herança, encapsulamento e manipulação de coleções.


---

🛠 Tecnologias e Conceitos Utilizados

Java: Linguagem principal utilizada no desenvolvimento do projeto.

Criação de Classes e Objetos: Representação de entidades como Aluno, Professor, Curso, Mentoria e Bootcamp.

Instanciação de Objetos: Criação de objetos com base nas classes modeladas.

Atributos e Variáveis: Armazenamento de dados relevantes em cada classe.

Construtores: Inicialização dos objetos com dados personalizados.

Getters e Setters: Métodos de acesso e modificação de atributos privados.

Encapsulamento: Proteção dos dados internos por meio de atributos privados.

Herança: Classes Aluno e Professor estendem a classe abstrata Pessoa.

Abstração: Uso da classe Pessoa para generalizar características comuns.

Coleções (Set): Utilização de HashSet para armazenar alunos, professores e cursos sem duplicações.

APIs de Datas (LocalDate): Controle das datas de início e fim dos bootcamps e mentorias.



---

📋 Descrição

O sistema permite:

Cadastro de Professores: Cada professor pode ser associado a um curso e a uma mentoria.

Criação de Cursos e Mentorias: Os cursos possuem título, descrição e carga horária. As mentorias têm um título, data e professor responsável.

Criação de Bootcamps: Um bootcamp reúne cursos, mentorias, professores e alunos.

Inscrição de Alunos: Alunos podem se inscrever em bootcamps e realizar os cursos disponíveis.

Conclusão de Cursos: Alunos podem concluir cursos e acumular pontos de experiência (XP).

Exibição de Informações: Mostra no console os cursos inscritos, cursos finalizados e XP acumulado dos alunos.



---

📂 Estrutura do Projeto

bootcamp-sistema/
│
├── src/
│   ├── estrutura/
│   │   ├── educacional/
│   │   │   ├── Bootcamp.java
│   │   │   ├── Curso.java
│   │   │   ├── Mentoria.java
│   │   ├── pessoas/
│   │   │   ├── Pessoa.java
│   │   │   ├── Aluno.java
│   │   │   ├── Professor.java
│   └── main/
│       └── Main.java


---

▶️ Como Executar o Projeto

Pré-requisitos

Java JDK instalado

Um editor como IntelliJ IDEA, Eclipse, ou uso do terminal


Rodando via Terminal

1. Clone o repositório:



git clone https://github.com/seu-usuario/bootcamp-sistema.git

2. Acesse o diretório:



cd bootcamp-sistema

3. Compile os arquivos:



javac src/**/*.java

4. Execute o programa:



java src.main.Main

Você verá a simulação do funcionamento do sistema no console.


---

🎯 Objetivos do Projeto

Consolidar conhecimentos em Programação Orientada a Objetos com Java.

Aplicar boas práticas como encapsulamento e organização modular de pacotes.

Praticar o uso de coleções (Set) e API de datas (LocalDate).

Simular um cenário realista de um sistema de gerenciamento educacional.



---

✍️ Contribuições

Contribuições são bem-vindas!

1. Faça um fork do projeto.


2. Crie uma branch com sua feature: git checkout -b minha-feature


3. Commit suas alterações: git commit -m 'Adiciona nova funcionalidade'


4. Dê push na sua branch: git push origin minha-feature


5. Abra um Pull Request.




---

📞 Contato

Desenvolvido por Dener Xisto da Fonseca
Email: darkx@hotmail.com.br
LinkedIn: linkedin.com/in/dener-fonseca
