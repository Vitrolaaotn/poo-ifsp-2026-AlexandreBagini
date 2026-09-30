package AtividadeSemana7.a4;

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
