package AtividadeSemana7.a3;

public class LeitorLinhaCSV {
    public static void main(String[] args) {
        String linha = "Maria,28,ATIVO";
        String outraLinha = "maria,28,ativo";

        String[] partes = linha.split(",");

        System.out.println("Nome: " + partes[0]);
        System.out.println("Idade: " + partes[1]);
        System.out.println("Status: " + partes[2]);

        System.out.println("equals: " + linha.equals(outraLinha));
        System.out.println("equalsIgnoreCase: " + linha.equalsIgnoreCase(outraLinha));

        String frase = String.format(
            "Nome: %s | Idade: %s anos | Status: %s",
            partes[0], partes[1], partes[2]);
        System.out.println(frase);

        String a = "Maria";
        String b = new String("Maria");
        System.out.println("a == b: " + (a == b));
        System.out.println("a.equals(b): " + a.equals(b));
    }
}
