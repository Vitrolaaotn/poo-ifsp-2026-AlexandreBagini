# Java Hello World
## Roteiro de Atividades

- Nome: Alexandre Bagini
- Data:

### Atividade 1: Explorar IntelliJ
a. O papel do debug é acompanhar o processo que o código faz, demonstrando para o programador o percurso, facilitando assim a forma de identificar algum problema de lógica(qual foi o papel do debug realizado no tutorial — o que você observou ao executá-lo)
b. `values.length` é a forma de acessar, em Java, o número de elementos (o tamanho) de um array chamado `values`. Todo array em Java carrega essa propriedade `length`, que é necessária no passo 12 porque permite percorrer o array (por exemplo em um laço `for`) sem precisar saber ou escrever manualmente a quantidade de elementos, evitando erros como acessar uma posição que não existe.
c. Vários recursos que não estava acostumado, principalmente o values.length que é muito util para percorrer arrays idependente do tamanho (cite os recursos novos que você percebeu durante a atividade)

### Atividade 2: Escrever o programa Hello World
      public class Hello {
         public static void main(String [] args){
            System.out.println("Hello World")

      b. Foi utilizado a versão JDK 25

### Atividade 3: Explorando os tipos primitivos e mensagens de erro
a. O tipo primitivo `boolean` serve para representar valores lógicos, que só podem ser `true` ou `false`. É essencial para controlar o fluxo do programa, sendo usado em estruturas condicionais (`if`, `else`) e laços de repetição (`while`, `for`), além de ser o resultado de comparações feitas com operadores relacionais (`<`, `>`, `==` etc.) e lógicos (`&&`, `||`, `!`).
b. Os erros foram principalmente usando long e byte pois eram operadores novos (quais erros você causou e se as mensagens foram claras)
c. Além dos operadores citados no roteiro, a linguagem Java possui outros operadores comuns, como: `%` (módulo/resto da divisão), `++` e `--` (incremento e decremento), `&&` e `||` (lógicos "e"/"ou"), `!` (negação lógica), `!=` (diferente), operadores de atribuição composta (`+=`, `-=`, `*=`, `/=`) e o operador `instanceof` (verifica o tipo de um objeto).

### Atividade 4: Explorando o Netbeans
a. Achei que o Netbeans é bem mais visual e simples comparado com o IntelliJ, porque ele demonstra mais uso de ícones e um visual mais limpo(principais diferenças observadas entre IntelliJ e Netbeans)
b. Uma IDE (Ambiente de Desenvolvimento Integrado) é um software que reúne, em um só lugar, as ferramentas necessárias para programar: editor de código com destaque de sintaxe, compilador/interpretador, depurador (debugger), gerenciador de projetos e, muitas vezes, controle de versão. Sua importância está em aumentar a produtividade do desenvolvedor, pois automatiza tarefas repetitivas, aponta erros antes mesmo de compilar, facilita a navegação pelo código e integra todas as etapas do desenvolvimento em uma única interface.
   - Prompt utilizado: explique o que é IDE e qual a importância para o desenvolvimento
                       de software.
   - IA utilizada: Claude
   - Resposta gerada pela IA: Uma IDE (Ambiente de Desenvolvimento Integrado) é um software que reúne, em um só lugar, as ferramentas necessárias para programar: editor de código com destaque de sintaxe, compilador/interpretador, depurador (debugger), gerenciador de projetos e, muitas vezes, controle de versão. Sua importância está em aumentar a produtividade do desenvolvedor, pois automatiza tarefas repetitivas, aponta erros antes mesmo de compilar, facilita a navegação pelo código e integra todas as etapas do desenvolvimento em uma única interface.

### [Extra] Atividade 5: Novo recurso a partir do Java 21
- Prompt utilizado para habilitar `--enable-preview`: como eu faço para habilitar o --enable preview no IntelliJ
- IA utilizada: Claude
- Resposta gerada pela IA: 
      IntelliJ IDEA
      - Abra File → Project Structure (ou o atalho ⌘+; no Mac / Ctrl+Alt+Shift+S no Windows/Linux).
      - Vá em Project → no campo Language level, selecione a opção "21 (Preview) — String templates, unnamed classes and instance main methods etc."Aparecerá um aviso de "Experimental Feature Alert". 
      - Feche a janela de Project Structure e clique em Aceitar. 
      - Depois disso, o erro de compilação relacionado a preview features some e o programa roda normalmente.

a. O recurso será util para não me identificar o erro antes mesmo do erro for realizado, então o recurso ajudará em não tentar corrigir a todo momento e apenas no momento em que eu for testar (o recurso é útil? por quê?)
b. Sim, a IA foi bem objetiva e encontrei todos os passos que ela me passou (você conseguiu resolver na primeira interação com a IA?)
