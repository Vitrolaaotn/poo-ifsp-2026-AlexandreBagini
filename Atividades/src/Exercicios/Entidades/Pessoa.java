package Exercicios.Entidades;

public class Pessoa {
    private String nome;
    private int idade;
    private String ultimoNome;

    //Construtor Padrão, o construtor sempre terá o mesmo nome que a classe
    //Construtor n tem valor de retorno como os demais métodos
    //Semelhante a um metodo

    public Pessoa() {
        idade = 10;

    }
    //Construtor parametrizado (não-padrão)
    public Pessoa (int i){
        idade = i;
    }

    public Pessoa (String n){
        nome = n;
    }
    private void dividirString (String texto){
        String [] nomes = texto.split(" ");
        nome = nomes[0];
        ultimoNome= nomes[1];
    }
    public void setNome(String novoNome){
        if(novoNome == null || novoNome.isBlank()){
//            System.err.println("Campo Nome não foi preenchido corretamente");
            throw new IllegalArgumentException("Campo Nome não foi preenchido corretamente");
//            return;
        }
        dividirString(novoNome);
    }
    public void setIdade(int i){
        if(i >=0 && i<=120) {
            idade = i;
        }
        else {
            throw new IllegalArgumentException("Campo Idade não foi preenchido corretamente");
        }
    }
    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public String getUltimoNome(){
        return ultimoNome;

    }

}
