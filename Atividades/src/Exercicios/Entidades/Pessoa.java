package Exercicios.Entidades;

public class Pessoa {
    private String nome;
    private int idade;
    private String ultimoNome;

    private void dividirString (String texto){
        String [] nomes = texto.split(" ");
        nome = nomes[0];
        ultimoNome= nomes[1];
    }
    public void alterarNome(String novoNome){
        if(novoNome == null || novoNome.isBlank()){
//            System.err.println("Campo Nome não foi preenchido corretamente");
            throw new IllegalArgumentException("Campo Nome não foi preenchido corretamente");
//            return;
        }
        dividirString(novoNome);
    }
    public void alterarIdade(int i){
        if(i >=0 && i<=120) {
            idade = i;
        }
        else {
            throw new IllegalArgumentException("Campo Idade não foi preenchido corretamente");
        }
    }
    public String qualSeuNome(){
        return nome;
    }
    public int qualSuaIdade(){
        return idade;
    }
    public String qualUltimoNome(){
        return ultimoNome;

    }

}
