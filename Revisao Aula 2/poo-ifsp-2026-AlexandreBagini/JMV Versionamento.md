# JMV Versionamento 
## Roteiro de Atividades

- Nome: Alexandre Bagini
- Data: 06/08/26


### Atividade 1: Identificando operadores
1 - & 
  - ?
  - ^

2 - &: (Bitwise AND): Utilizado para chamar duas variáveis em uma linha de código.
  - ?: O operador ternário é uma forma abreviada da instrução if-else.
  - ^: OU exclusivo (XOR) usado para lógica booleana e para operações em bit a bit.

3 - void main() {    
    int a = 5;
    int b = 3;
    System.out.println(a & b);
}
    //compara dois números olhando para cada um de seus bits. Ele retorna 1 apenas se os dois bits na mesma posição forem 1; caso contrário, o resultado nessa posição é 0



 - void main() {
    int a = 10;
    int b = 5;
    int max = (a > b) ? a : b; 
    System.out.println(max);
}
    //retorna o maior valor entre a e b


 - void main() {
    boolean a = true;
    boolean b = false;
    boolean resultado = a ^ b;
    System.out.println(resultado);
}

    //Retorna true se uma entrada for verdadeira e a outra falsa
    //Retorna false se ambas forem iguais (true e true, ou false e false)
    //Faz a função do operador OU exclusivo (XOR)




3.2 - Atividade 2: JVM e o princípio Write once, run anywhere

 1 - Saída pelo javap -c Saudacao.class:

	PS C:\Users\BV3074846\IdeaProjects\01aMundo\src> javap -c Saudacao.class
Compiled from "Saudacao.java"
public class Saudacao {
  public Saudacao();
    Code:
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return

  public static void main(java.lang.String[]);
    Code:
         0: bipush        20
         2: istore_1
         3: ldc           #7                  // String Aluno
         5: astore_2
         6: getstatic     #9                  // Field java/lang/System.out:Ljava/io/PrintStream;
         9: aload_2
        10: iload_1
        11: invokedynamic #15,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
        16: invokevirtual #19                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
        19: return
}


    Saída pelo compilador: 

	Ola, Aluno! Voce tem 20 anos.


 2- O arquivo contém instruções que o compilador lê para executar o código e traduzir o resultado para o usuário 
	prompt da IA: "Qual a diferença entre bytecode, JVM, JRE e JDK, e como esses conceitos se relacionam a frase "write once, run anywhere""

	resposta da IA: "O bytecode é um código intermediário gerado pelo JDK a partir do código-fonte em Java. Esse bytecode é executado pela JVM, que o traduz para o sistema operacional em uso. A JRE fornece a JVM e as bibliotecas 	necessárias para executar programas Java, enquanto o JDK é utilizado para desenvolvê-los. Esses componentes permitem o princípio "Write Once, Run Anywhere", pois o mesmo bytecode pode ser executado em qualquer plataforma que 	possua uma JVM compatível."

	O bytecode é gerado pelo JDK, que é executado pela Java virtual machine, enquanto a JRE fornece a maquina virtual as bibliotecas básicas para executar os programas, enquanto o JDK é utilizado pelos desenvolvedores para criar 	novos softwares, tudo isso é relacionado com a frase "Write Once, Run Anywhere", pois o bytecode pode ser utilizado em qualquer maquina que possua uma maquina virtual com o compilador.

