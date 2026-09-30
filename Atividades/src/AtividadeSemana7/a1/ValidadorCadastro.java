package AtividadeSemana7.a1;

public class ValidadorCadastro {
    public static void main(String[] args) {
        String nomeDigitado = "  maria  ";

        String nome = nomeDigitado.trim();

        if (nome.isEmpty()) {
            System.out.println("Nome inválido!");
        } else {
            System.out.println(nome.toUpperCase());
            System.out.println("Caracteres: " + nome.length());
        }
    }
}
