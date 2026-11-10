package Singleton;

public class ConexaoBanco {
    private static ConexaoBanco conexao;

    private ConexaoBanco() {
        System.out.println("Conexao criada... ");
    }

    public static ConexaoBanco getInstance() {
        if (conexao == null) {
            conexao = new ConexaoBanco();
        }else{
            System.out.println("Usando a mesma instância...");
        }
        return conexao;
    }
}