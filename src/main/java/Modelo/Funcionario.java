package Modelo;

public class Funcionario extends Object{
    private String nome;
    private String cpf;
    private double salarioBase;

    public Funcionario(String nome, String cpf, double salarioBase){
        this.nome=nome;
        this.cpf=cpf;
        this.salarioBase=salarioBase;
    }

    public Funcionario(){
        this("Funcionario", "00000", 2000);
    }
    public double getSalario() {
        return salarioBase;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    // polimorfismo de herança
    @Override
    public  String toString(){
        String mensagem = "Nome: " + getNome() + "; cpf: " + getCpf() + "; Salario: " + getSalario();

        return mensagem;
    }
}
