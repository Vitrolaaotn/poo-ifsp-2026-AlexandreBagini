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
   
