## Atividade 1: O primeiro passo do encapsulamento
...\poo-ifsp-2026-AlexandreBagini\Atividades\src\Exercicios\Encapsulamento

1. **Por que o compilador passou a recusar o acesso direto aos atributos depois da mudança para
   private?**
    O compilador passou a recusar o acesso dos atributos e passou a recusar a alteração dos valores justamente porque se tornou um atributo privado e não pode ser alterado fora de sua classe


2. **Qual problema prático (do mundo real) o encapsulamento evitou neste exemplo, ao impedir
   o acesso direto ao atributo preco?**
    O encapasulamento impede que os atributos sejam alterados fora de suas respectivas classes, se por exemplo um médico tem acesso total ao sistema, um enfermeiro tem um acesso limitado, ou seja, o enfermeiro não poderá utilizar métodos que apenas o médico deveria utilizar

3. **Prompt**  Por que a linguagem Java não permite, por padrão, que atributos fiquem públicos em código
   profissional, e quais problemas de manutenção isso costuma causar em sistemas grandes?
    
    **Resposta**   Atributos public aumentam o acoplamento porque permitem que qualquer parte do sistema altere diretamente o estado de um objeto. Em sistemas grandes, isso dificulta validações, mudanças internas e manutenção, pois uma alteração no atributo pode afetar muitas classes. O encapsulamento (private + métodos de acesso/controlados) esconde os detalhes internos e cria um ponto central para controlar as regras do objeto.

    **Minha Resposta** Os atributos privates são necessário para melhorar a manutenção, a segurança e controle do desenvolvedor em suas classes, apenas alterando atributos com métodos.


## Atividade 2: Criando getters e setters

#### Reflexão e Prática
Responda às seguintes questões com base na atividade realizada:
1. O que aconteceu com o preço do produto quando você chamou setPreco(-50.0)? O atributo
   foi alterado?
   Como o valor é menor que 0 e o exercício pede para ser utilizado um if/else para conferir o valor, ele retora uma mensagem de erro
2. Por que o setter é o lugar correto para validar dados, e não a classe que usa o objeto Produto?
    Porque antes de settar algo, ele irá conferir se é valido, e a classe objeto Produto é usada para determinar os atributos que a classe tem, atributos que precisam ser preenchidos para serem considerados da classe Produto
3. Como atribuir o parâmetro ao atributo de uma classe, se eles tiverem o mesmo nome?
   Não é possível atribuir um parâmetro ao atributo se eles tiverem o mesmo nome.
4.  **Prompt** Quais validações costumam ser adicionadas em setters de sistemas reais (ex: e-commerce, sistemas
    bancários) além de checar valores negativos.

    **Resposta** Em sistemas reais, os setters podem validar várias regras além de valores negativos. Por exemplo, podem verificar se o campo não está vazio ou nulo, se o tamanho do texto é válido, se um e-mail possui formato correto, se uma data é válida, se um preço está dentro de um limite permitido ou se um valor atende às regras do negócio. Em sistemas bancários, também podem existir validações de limite, saldo e dados obrigatórios. O objetivo é impedir que o objeto receba informações inválidas e manter os dados consistentes.

     **Minha Resposta** A função dos setters é conferir se uma data é válida, um email válido, se os campos estão vazios, conferindo as regras estabelecidadas


## Atividade 3: O operador this resolvendo conflito de nomes

#### Reflexão e Prática

1. **O que aconteceu com os atributos nome e idade do objeto quando você removeu o this? Por quê?**

   Os atributos `nome` e `idade` não receberam os valores passados pelo construtor. Isso aconteceu porque, ao utilizar `nome = nome` e `idade = idade`, o Java entende que estamos atribuindo o parâmetro a ele mesmo. O `this` é utilizado para diferenciar o atributo do parâmetro.

2. **Em que situação o this é obrigatório para o código funcionar corretamente, dentro de um método ou construtor?**

   O `this` é necessário quando existe um parâmetro ou variável local com o mesmo nome de um atributo da classe. Ele serve para indicar que estamos nos referindo ao atributo pertencente ao objeto.

3. **Prompt** Explique o que acontece quando removemos o `this` de atribuições como `this.nome = nome` em um construtor Java. Explique também o conceito de escopo de variável e shadowing relacionado a esse comportamento.

   **Resposta** Quando um parâmetro possui o mesmo nome de um atributo, ocorre um shadowing, ou seja, o parâmetro passa a esconder o atributo dentro daquele escopo. Por isso, em `nome = nome`, os dois lados representam o parâmetro e o atributo não é alterado. Usando `this.nome`, indicamos que estamos acessando o atributo pertencente ao objeto.

   **Minha Resposta** O `this` serve para diferenciar o atributo do objeto de um parâmetro com o mesmo nome. Sem ele, o parâmetro acaba escondendo o atributo e uma atribuição como `nome = nome` não altera o atributo.


## Atividade 4: Construtor padrão x construtor parametrizado

#### Reflexão e Prática

1. **Por que o Java não gerou um construtor padrão automaticamente para a classe Livro antes do passo 2?**

   Porque a classe já possui um construtor parametrizado. O Java só cria automaticamente um construtor padrão sem parâmetros quando nenhum construtor é declarado pelo programador.

2. **Em que momento o construtor padrão de uma classe deixa de ser gerado automaticamente pelo compilador?**

   Ele deixa de ser gerado automaticamente assim que o programador declara qualquer construtor na classe, mesmo que esse construtor tenha parâmetros.

3. **Prompt** O que é o construtor padrão implícito gerado pelo compilador Java e em quais condições exatas ele deixa de existir?

   **Resposta** O construtor padrão implícito é um construtor sem parâmetros que o compilador Java fornece automaticamente quando a classe não possui nenhum construtor declarado pelo programador. Assim que pelo menos um construtor é declarado explicitamente, o compilador deixa de criar esse construtor padrão automaticamente.

   **Minha Resposta** O construtor padrão implícito é criado automaticamente pelo Java quando não existe nenhum construtor declarado na classe. Se eu criar qualquer construtor manualmente, o Java não cria mais o construtor padrão, então preciso declará-lo caso queira utilizá-lo.


## Atividade 5: Sobrecarregando construtores

#### Reflexão e Prática

1. **Como o compilador Java decide qual dos três construtores será chamado em cada new Retangulo(...)?**

   O compilador verifica a quantidade e os tipos dos argumentos passados no `new` e procura o construtor que seja compatível com esses argumentos.

2. **O que aconteceria se você tentasse criar um quarto construtor Retangulo(double altura) além do Retangulo(double lado) já existente? Teste e registre o erro.**

   O compilador apresentaria um erro porque os dois construtores possuem a mesma assinatura. O nome dos parâmetros não diferencia os construtores. Portanto, `double lado` e `double altura` são considerados a mesma assinatura, pois ambos recebem apenas um `double`.

3. **Prompt** Por que a assinatura de um método/construtor não considera o nome dos parâmetros, apenas seus tipos e quantidade, e dê um exemplo de sobrecarga que causa ambiguidade.

   **Resposta** O nome dos parâmetros serve apenas para identificar as variáveis dentro do método e não faz parte da assinatura usada pelo Java para diferenciar métodos. A assinatura considera o nome do método e a sequência de tipos dos parâmetros. Por exemplo, não é possível ter `calcular(int valor)` e `calcular(int numero)` na mesma classe, pois ambos possuem a mesma assinatura.

   **Minha Resposta** O Java não usa o nome dos parâmetros para diferenciar métodos porque esses nomes são apenas variáveis internas. Ele utiliza a quantidade e os tipos dos parâmetros. Por isso, dois construtores que recebem apenas um `double` são considerados iguais, mesmo que os parâmetros tenham nomes diferentes.


## Atividade 6: Encadeando construtores com this()

#### Reflexão e Prática

1. **O que acontece se você tentar colocar this(...) como a segunda instrução de um construtor, depois de outra linha de código? Teste e registre o erro apresentado pelo compilador.**

   O compilador apresenta um erro, porque a chamada `this(...)` precisa obrigatoriamente ser a primeira instrução do construtor. Ela serve para chamar outro construtor da mesma classe antes que as demais instruções sejam executadas.

2. **Compare esta versão com a da Atividade 5: qual vantagem prática o uso de this() trouxe para a manutenção do código?**

   O uso de `this()` evita repetir código nos diferentes construtores. Se a forma de inicialização dos atributos mudar, é necessário alterar principalmente o construtor completo, enquanto os outros continuam chamando esse construtor. Isso facilita a manutenção e reduz a possibilidade de erros.

3. **Prompt** Por que `this()` precisa obrigatoriamente ser a primeira instrução do construtor e o que o compilador Java faz "por trás dos panos" quando um objeto é criado?

   **Resposta** `this()` precisa ser a primeira instrução porque ele chama outro construtor da mesma classe para realizar a inicialização do objeto. O Java precisa garantir que a construção seja iniciada corretamente antes da execução das demais instruções do construtor.

   **Minha Resposta** O `this()` precisa ser a primeira instrução porque ele chama outro construtor da mesma classe. Assim, a inicialização definida pelo outro construtor acontece primeiro. Isso também permite reutilizar código entre diferentes construtores.


## Atividade 7: Construtor de cópia usando this()

#### Reflexão e Prática

1. **Por que p1 e p2 continuam sendo dois objetos independentes na memória, mesmo tendo os mesmos valores iniciais?**

   Porque o construtor de cópia cria um novo objeto. Ele utiliza os valores de `p1` para inicializar `p2`, mas cada variável referencia um objeto diferente na memória.

2. **Dentro do construtor de cópia, por que é possível acessar outra.nome e outra.idade diretamente, mesmo sendo atributos private?**

   Porque o acesso aos membros `private` é permitido dentro da própria classe. Como o construtor de cópia está dentro da classe `Pessoa`, ele pode acessar diretamente os atributos privados de outro objeto `Pessoa`.

3. **Prompt** Por que um construtor de cópia é útil na prática e qual a diferença entre copiar um objeto e copiar apenas a referência (`Pessoa p2 = p1;`)?

   **Resposta** Um construtor de cópia permite criar um novo objeto com os mesmos valores de outro objeto, mantendo os dois objetos independentes. Já `Pessoa p2 = p1` não cria um novo objeto: apenas faz `p2` e `p1` referenciarem o mesmo objeto. Nesse caso, uma alteração feita por uma referência também será observada pela outra.

   **Minha Resposta** O construtor de cópia cria um novo objeto usando os valores de outro objeto. Já `p2 = p1` apenas copia a referência, fazendo as duas variáveis apontarem para o mesmo objeto. Por isso, alterar um objeto criado por cópia não altera o objeto original.


## Atividade 8: Sobrecarregando métodos comuns

#### Reflexão e Prática

1. **O que determina qual das versões de somar será executada em cada chamada: o nome do método, o tipo de retorno, ou os parâmetros?**

   O que determina é a quantidade, os tipos e a ordem dos parâmetros. O tipo de retorno não é utilizado para diferenciar métodos sobrecarregados.

2. **Seria possível criar uma versão public double somar(int a, int b) além da já existente public int somar(int a, int b)? Teste e explique o que o compilador informa.**

   Não seria possível. O compilador apresentaria um erro porque os dois métodos possuem a mesma assinatura. A diferença apenas no tipo de retorno não é suficiente para criar uma sobrecarga.

3. **Prompt** Por que o tipo de retorno sozinho não é suficiente para diferenciar métodos sobrecarregados em Java?

   **Resposta** O tipo de retorno não faz parte da assinatura utilizada pelo Java para diferenciar métodos sobrecarregados. Se dois métodos possuem o mesmo nome e os mesmos parâmetros, eles são considerados iguais, mesmo que tenham tipos de retorno diferentes.

   **Minha Resposta** O tipo de retorno sozinho não diferencia os métodos porque o Java precisa escolher qual método será utilizado com base nos argumentos fornecidos na chamada. Por isso, métodos com o mesmo nome e os mesmos parâmetros não podem existir apenas com tipos de retorno diferentes.


## Atividade 9: Sobrecarga com varargs

#### Reflexão e Prática

1. **Depois de adicionar o somar(int... numeros), o que aconteceu quando você chamou somar(3, 4): o compilador reclamou de ambiguidade com o somar(int a, int b) da Atividade 8, ou escolheu a versão de dois parâmetros? Explique com base no resultado observado.**

   O Java escolhe a versão `somar(int a, int b)`, pois ela corresponde exatamente aos dois argumentos fornecidos. O método com `varargs` também poderia receber os dois valores, mas a versão com parâmetros específicos possui prioridade.

2. **Dentro do método, numeros se comporta como qual estrutura de dados da linguagem Java?**

   `numeros` se comporta como um array (`int[]`). O `varargs` permite passar uma quantidade variável de argumentos, mas dentro do método esses valores são tratados como um array.

3. **Prompt** Qual é a ordem de prioridade que o Java usa para escolher entre um método sobrecarregado "exato" e um método com varargs quando ambos poderiam atender à chamada?

   **Resposta** O Java prioriza métodos que correspondem diretamente aos argumentos fornecidos. Um método com parâmetros específicos é escolhido antes de um método que utiliza `varargs`. Assim, se existirem `somar(int, int)` e `somar(int...)`, uma chamada como `somar(3, 4)` escolherá a versão `somar(int, int)`.

   **Minha Resposta** Quando existe uma versão exata e uma versão com `varargs`, o Java prefere a versão exata. Por isso, `somar(3, 4)` utiliza o método que recebe exatamente dois inteiros.


## Atividade 10: Integrando tudo, a classe ContaBancaria

#### Reflexão e Prática

1. **Qual foi o papel do this em cada um dos três lugares onde ele apareceu nesta atividade (atribuição no construtor completo, encadeamento com this(...), e dentro do próprio método depositar caso você tenha usado)?**

   No construtor completo, o `this` foi usado para diferenciar os atributos dos parâmetros que possuem os mesmos nomes. No encadeamento dos construtores, `this(...)` foi usado para chamar outro construtor da mesma classe e reaproveitar sua inicialização. Dentro do método `depositar`, caso seja utilizado, `this` pode indicar que estamos acessando um atributo pertencente ao objeto atual.

2. **Por que o getter do atributo ativa se chama isAtiva() e não getAtiva()? Essa diferença muda algo no comportamento do método, ou é só uma convenção de nome?**

   `isAtiva()` é uma convenção utilizada para getters de atributos booleanos. A diferença não muda o funcionamento do método, pois ele continua retornando um valor `boolean`. O `is` apenas segue uma convenção de nomenclatura.

3. **Prompt** Descreva a classe ContaBancaria que você implementou e peça sugestões de mais uma regra de encapsulamento (validação) que um sistema bancário real aplicaria no método depositar ou em um método sacar.

   **Resposta** A classe `ContaBancaria` possui atributos privados para armazenar o titular, saldo e estado da conta. Ela utiliza construtores sobrecarregados, getters e um método para realizar depósitos somente quando a conta está ativa e o valor é positivo. Uma regra adicional poderia ser limitar o valor máximo de um depósito ou exigir alguma validação de segurança para operações de valores elevados.

   **Minha Resposta** A classe utiliza encapsulamento para proteger seus atributos e controla os depósitos por meio de uma validação. Uma regra que poderia ser adicionada seria estabelecer um limite para o valor máximo de depósito ou exigir uma confirmação para valores muito altos, aumentando a segurança do sistema.]