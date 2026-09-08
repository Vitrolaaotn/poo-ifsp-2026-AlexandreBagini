Java Hello World
Roteiro de Atividades
Nome: Alexandre Bagini
Data: 06/08/2026



Atividade 1: Identificando operadores
a. 3 operadores que eu nunca ouvi falar são os operadores especiais: ? ;instanceof ; ->.

b. “?” é um operador ternário (atalho para if-else) , “instanceof “ verifica se um objeto é instância de uma classe ou interface, -> é um operador de seta (usado em expressões Lambda).

c.

Atividade 2: JVM e o princípio Write once, run anywhere

a. Vídeo assistido
Vídeo: Java's JDK, JVM & Bytecode Explained!
Canal: BytecodeCrux
Link: Assistir ao vídeo no 




b.  esse arquivo contém todo o passo a passo/instruções que a máquina fará para compilar todo o código e transformá-lo em .exe. O componente responsável por transformá-lo é o compilador.



c.Prompt da IA: Explique, de forma simples e com linguagem de estudante, a diferença entre bytecode, JVM, JRE e JDK no Java. Explique também como esses quatro conceitos se relacionam com o princípio "Write Once, Run Anywhere". Dê exemplos e explique o que acontece desde a criação de um arquivo .java até sua execução pelo computador



Resposta da IA:
Bytecode é o código intermediário gerado pelo compilador Java a partir do código-fonte .java. Ele é armazenado em arquivos .class e não é diretamente executado pelo processador.

A JVM, ou Java Virtual Machine, é responsável por executar esse bytecode. Ela interpreta ou compila as instruções para que possam ser executadas pelo computador.

A JRE, ou Java Runtime Environment, fornece o ambiente necessário para executar programas Java. Ela inclui a JVM e as bibliotecas necessárias para a execução.

O JDK, ou Java Development Kit, é utilizado para desenvolver programas Java. Ele possui ferramentas como o compilador javac, além dos componentes necessários para executar programas.

O princípio "Write Once, Run Anywhere" significa que um programa Java pode ser escrito e compilado uma vez para gerar bytecode e depois executado em diferentes sistemas operacionais, desde que exista uma JVM compatível. Isso acontece porque o bytecode é independente do sistema operacional e a JVM faz a adaptação necessária para cada plataforma.

O processo pode ser resumido assim:

Código .java → javac → bytecode .class → JVM → execução no computador.



Resumindo:
Bytecode → Código intermediário gerado pelo compilador.
JVM → Executa o bytecode.
JRE → Ambiente para executar programas Java (JVM + bibliotecas).
JDK → Ambiente para desenvolver programas Java (JRE + ferramentas de desenvolvimento).
Resposta com as minhas palavras:

Eu entendi que o Java funciona de uma maneira diferente de linguagens que são compiladas diretamente para código de máquina. Primeiro, o programa escrito em Java é compilado pelo javac e transformado em bytecode, que fica armazenado no arquivo .class.
Isso explica o princípio "Write Once, Run Anywhere": podemos escrever e compilar um programa Java uma vez e depois executar o arquivo .class em diferentes sistemas, como Windows, Linux e macOS, desde que exista uma JVM compatível instalada. Em uma linguagem compilada diretamente para código nativo, como C, normalmente seria necessário gerar um executável específico para cada plataforma ou arquitetura.



Atividade 3: Criação de repositório no GitHub

https://github.com/Vitrolaaotn/poo-ifsp-2026-AlexandreBagini


3.2.1:
O comando git add coloca as alterações na área de stage, preparando os arquivos para serem incluídos no próximo commit. Já o git commit registra essas alterações no histórico do repositório local.

O git commit registra as alterações somente no repositório local, que está na minha máquina. O git push é responsável por enviar os commits do repositório local para o repositório remoto, que está hospedado no GitHub.



3.2.2:

Prompt da IA: Avalie se a seguinte mensagem de commit segue boas práticas de mensagens de commit  "aula 02: criar o repositorio e adicionar README.md"

Resposta da IA : A mensagem "aula 02: criar o repositorio e adicionar README.md" é compreensível e informa o que foi realizado, porém não segue a convenção de Conventional Commits.

Como o commit está relacionado à criação/configuração inicial do repositório e à inclusão de um arquivo README, a categoria "chore" pode ser utilizada, pois representa uma tarefa de manutenção ou configuração que não adiciona uma funcionalidade ao sistema.

Uma opção seria:

chore: criar repositório e adicionar README.md

Mensagens padronizadas facilitam a leitura do histórico do projeto, ajudam os colaboradores a entender rapidamente o tipo de alteração realizada e tornam mais fácil organizar e localizar mudanças.



