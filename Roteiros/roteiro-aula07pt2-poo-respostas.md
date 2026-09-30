# Exercícios de revisão - Parte II


> Os códigos-fonte (`.java`) e os compilados (`.class`) estão nas pastas `a1` a `a5`.
> Para executar: `cd a1 && java ValidadorCadastro`

---

## Atividade 1: Validando um cadastro com String

```java
public class ValidadorCadastro {
    public static void main(String[] args) {
        String nomeDigitado = "  maria  ";   // teste também com "     "

        String nome = nomeDigitado.trim();                      // TODO 1

        if (nome.isEmpty()) {                                   // TODO 2
            System.out.println("Nome inválido!");
        } else {
            System.out.println(nome.toUpperCase());             // TODO 3
            System.out.println("Caracteres: " + nome.length()); // TODO 4
        }
    }
}
```

**Saída (`"  maria  "`):** `MARIA` / `Caracteres: 5`
**Saída (`"     "`):** `Nome inválido!`

### Reflexão e Prática

1. **`trim()` altera a variável original ou retorna uma nova String?**
   Retorna uma **nova String**; a original não muda. Para confirmar, chame `nomeDigitado.trim()` sem atribuir o resultado e imprima `nomeDigitado`: ela continua com os espaços. Só muda se fizer `nomeDigitado = nomeDigitado.trim()`.

2. **Por que checar `isEmpty()` depois do `trim()` é diferente de antes?**
   Uma entrada como `"   "` (só espaços) tem 3 caracteres, então `isEmpty()` **antes** do `trim()` dá `false` e o nome inválido passaria. **Depois** do `trim()` ela vira `""` e `isEmpty()` dá `true`.

3. **Apoio de IA**
    - **Prompt exato utilizado:** _(preencha com o prompt que você usou; sugestão: "Por que String é uma classe imutável em Java e o que isso implica para métodos como trim(), toUpperCase() e replace()?")_
    - **Resposta gerada pela IA:** _(cole aqui a resposta)_
    - **Resposta com suas palavras:** _(escreva aqui. Pontos: o conteúdo da String não muda após criada; esses métodos devolvem um novo objeto; é preciso atribuir o retorno; imutabilidade dá segurança, thread-safety, pool de Strings e uso como chave de `HashMap`.)_

---

## Atividade 2: Extraindo informações de um e-mail

```java
public class ExtratorEmail {
    public static void main(String[] args) {
        String email = "joao.silva@ifsp.edu.br";   // teste com "joao.silva@gmail.com"

        int pos = email.indexOf('@');                     // TODO 1

        if (pos == -1) {
            System.out.println("E-mail inválido!");
            return;
        }

        String usuario = email.substring(0, pos);         // TODO 2
        String dominio = email.substring(pos + 1);        // TODO 3

        System.out.println("Usuário: " + usuario);
        System.out.println("Domínio: " + dominio);

        if (dominio.contains("ifsp")) {                   // TODO 4
            System.out.println("E-mail institucional");
        } else {
            System.out.println("E-mail externo");
        }
    }
}
```

**Saída:** `Usuário: joao.silva` / `Domínio: ifsp.edu.br` / `E-mail institucional`

### Reflexão e Prática

1. **O que `indexOf('@')` retorna se não existir `@`?**
   Retorna **-1**. Sem a verificação, `substring(0, -1)` lançaria `StringIndexOutOfBoundsException`.

2. **Diferença entre `substring(indice)` e `substring(0, indice)`:**
   `substring(indice)` pega do índice até o **final** (usado no domínio, com `pos + 1`). `substring(0, indice)` pega do início até o índice, **sem incluí-lo** (usado no usuário).

3. **Apoio de IA**
    - **Prompt exato utilizado:** _(preencha; sugestão: "Quais exceções o método substring pode lançar em Java e em quais condições? Dê um exemplo de índice inválido.")_
    - **Resposta gerada pela IA:** _(cole aqui)_
    - **Resposta com suas palavras:** _(escreva aqui. Pontos: `StringIndexOutOfBoundsException` quando o início é negativo, o fim é maior que `length()` ou o início é maior que o fim. Exemplo: `"abc".substring(5)`.)_

---

## Atividade 3: Comparando e quebrando uma linha de dados (CSV)

```java
public class LeitorLinhaCSV {
    public static void main(String[] args) {
        String linha = "Maria,28,ATIVO";
        String outraLinha = "maria,28,ativo";

        String[] partes = linha.split(",");                       // TODO 1

        System.out.println("Nome: " + partes[0]);                 // TODO 2
        System.out.println("Idade: " + partes[1]);
        System.out.println("Status: " + partes[2]);

        System.out.println("equals: " + linha.equals(outraLinha));                     // TODO 3
        System.out.println("equalsIgnoreCase: " + linha.equalsIgnoreCase(outraLinha));

        String frase = String.format(                             // TODO 4
            "Nome: %s | Idade: %s anos | Status: %s",
            partes[0], partes[1], partes[2]);
        System.out.println(frase);

        // Bônus (reflexão 2): == x equals
        String a = "Maria";
        String b = new String("Maria");
        System.out.println("a == b: " + (a == b));
        System.out.println("a.equals(b): " + a.equals(b));
    }
}
```

**Saída:**
```
Nome: Maria
Idade: 28
Status: ATIVO
equals: false
equalsIgnoreCase: true
Nome: Maria | Idade: 28 anos | Status: ATIVO
a == b: false
a.equals(b): true
```

### Reflexão e Prática

1. **Resultados de `equals` e `equalsIgnoreCase`:**
   `equals` deu **false**, pois diferencia maiúsculas de minúsculas ("Maria" ≠ "maria"). `equalsIgnoreCase` deu **true**, pois ignora a caixa.

2. **E com `==`?**
   O `==` compara **referências** (se é o mesmo objeto na memória), e o `equals` compara o **conteúdo**. Com `new String("Maria")`, `a == b` dá `false` (objetos diferentes) mesmo com o mesmo texto, enquanto `a.equals(b)` dá `true`.

---

## Atividade 4: Classe Produto e ArrayList de produtos

```java
public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() { return nome; }

    public double getPreco() { return preco; }
}
```

```java
import java.util.ArrayList;

public class ListaDeCompras {
    private ArrayList<Produto> produtos = new ArrayList<>();

    public void adicionar(Produto produto) {
        produtos.add(produto);
    }

    public double calcularTotal() {
        double total = 0;
        for (Produto p : produtos) {
            total += p.getPreco();
        }
        return total;
    }

    public void imprimirTodos() {
        for (Produto p : produtos) {
            System.out.println(p.getNome() + " - R$ " + p.getPreco());
        }
    }
}
```

```java
public class TesteListaDeCompras {
    public static void main(String[] args) {
        ListaDeCompras lista = new ListaDeCompras();
        lista.adicionar(new Produto("Arroz", 25.90));
        lista.adicionar(new Produto("Feijão", 8.50));
        lista.adicionar(new Produto("Leite", 5.75));

        lista.imprimirTodos();
        System.out.println("Total: R$ " + lista.calcularTotal());
    }
}
```

**Saída:**
```
Arroz - R$ 25.9
Feijão - R$ 8.5
Leite - R$ 5.75
Total: R$ 40.15
```

### Reflexão e Prática

1. **Por que `ArrayList<Produto>` e não `ArrayList<String>` ou `ArrayList<Object>`?**
   Com `ArrayList<Produto>`, o compilador sabe que cada elemento do `for` é um `Produto`, então `p.getPreco()` é permitido. `String` e `Object` não têm `getPreco()`, então o código não compilaria (ou exigiria um cast).

2. **Se `Produto` fosse apagada, `ListaDeCompras` ainda faria sentido?**
   Não. A lista só existe para guardar e processar produtos; o código nem compilaria. Isso sugere uma relação de **agregação/associação**: a lista *tem* produtos.

---

## Atividade 5: Classe Aluno e estatísticas com ArrayList

```java
public class Aluno {
    private String nome;
    private double nota;

    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public String getNome() { return nome; }

    public double getNota() { return nota; }
}
```

```java
import java.util.ArrayList;

public class Turma {
    private ArrayList<Aluno> alunos = new ArrayList<>();

    public void matricular(Aluno aluno) {
        alunos.add(aluno);
    }

    public double calcularMedia() {
        if (alunos.isEmpty()) {
            return 0;   // evita divisão por zero (NaN)
        }
        double soma = 0;
        for (Aluno a : alunos) {
            soma += a.getNota();
        }
        return soma / alunos.size();
    }

    public Aluno encontrarMelhorAluno() {
        if (alunos.isEmpty()) {
            return null;
        }
        Aluno melhor = alunos.get(0);
        for (Aluno a : alunos) {
            if (a.getNota() > melhor.getNota()) {
                melhor = a;
            }
        }
        return melhor;
    }
}
```

```java
public class TesteTurma {
    public static void main(String[] args) {
        Turma turma = new Turma();
        turma.matricular(new Aluno("Ana", 8.5));
        turma.matricular(new Aluno("Bruno", 6.0));
        turma.matricular(new Aluno("Carla", 9.2));
        turma.matricular(new Aluno("Diego", 7.3));

        System.out.println("Média: " + turma.calcularMedia());

        Aluno melhor = turma.encontrarMelhorAluno();
        System.out.println("Melhor aluno: " + melhor.getNome());

        Turma vazia = new Turma();
        System.out.println("Média da turma vazia: " + vazia.calcularMedia());
    }
}
```

**Saída:**
```
Média: 7.75
Melhor aluno: Carla
Média da turma vazia: 0.0
```

### Reflexão e Prática

1. **`calcularMedia()` com turma vazia:**
   Sem tratamento, `0.0 / 0` em `double` resulta em `NaN` (não lança exceção, mas o resultado é inútil). Com o `if (alunos.isEmpty())`, o método retorna `0.0`. _(Registre também o que você observou ao testar sem o tratamento.)_

2. **Por que guardar a referência ao "melhor aluno até agora"?**
   Porque o método precisa retornar o **Aluno**, não só a nota. Guardando apenas a maior nota, perderíamos a informação de **quem** tirou essa nota.

3. **Apoio de IA**
    - **Prompt exato utilizado:** _(preencha; sugestão: "Como o método encontrarMelhorAluno() de uma classe Turma com ArrayList<Aluno> poderia ser reescrito usando Streams do Java (stream(), max())? Compare com a versão usando for.")_
    - **Resposta gerada pela IA:** _(cole aqui)_
    - **Resposta com suas palavras:** _(escreva aqui. Exemplo de versão com Stream:)_
      ```java
      public Aluno encontrarMelhorAluno() {
          return alunos.stream()
                       .max(Comparator.comparingDouble(Aluno::getNota))
                       .orElse(null);
      }
      ```
      _(Comparação: o Stream é mais curto e declarativo; o `for` é mais explícito e fácil de depurar; o `max()` retorna um `Optional`, tratando a lista vazia de forma mais elegante. Lembre do `import java.util.Comparator;`.)_