package App;
// nome do arquivo sempre precisa ser o nome da classe PUBLICA
public class TiposPrimitivos {

    public static void main(String[] args){
        // 8 tipos de dados primitivos: Nativo da linguagem
        // inteiros
        int valor = 10; // 4 bytes
        long valor2 = 100; // 8 bytes
        short valor3 = 30; // 2 bytes
        byte valor4 = (byte) 10; // 1 byte
        //lógico
        boolean flag = true;
        boolean status = (10 < 15);
        //real
        float real = 5.7f; // 4 bytes --- o f após o valor quer dizer conversão pois o double é o padrão e precisa ser convertido para 4 bytes
        double real2 =5.7; // double é o padrão invés do float  -- 8 bytes
        // caracter
        char letra = 'A';
        // a diferença é o espaço que eles consegue armazenar
        System.out.println("Mensagem");
    }
}
