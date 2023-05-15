package entities;

public class Produto {
    private int numeroDaConta;
    private String nomeDoTitular;
    private double valorInicialdeDeposito;


    public Produto(int numeroDaConta, String nomeDoTitular){
        this.numeroDaConta = numeroDaConta;
        this.nomeDoTitular = nomeDoTitular;
    }
    public Produto(int numeroDaConta,String nomeDoTitular, double valorInicialdeDeposito){
        this.numeroDaConta = numeroDaConta;
        this.nomeDoTitular = nomeDoTitular;
        this.valorInicialdeDeposito = valorInicialdeDeposito;
    }

    public int getNumeroDaConta(){
        return numeroDaConta;
    }

    public String getNomeDoTitular(){
        return nomeDoTitular;
    }
    public void setNomeDoTitular(String nomeDoTitular){
        this.nomeDoTitular = nomeDoTitular;
    }

    public double getValorInicialdeDeposito(){
        return valorInicialdeDeposito;
    }

    public void Depositar(double amount){
        this.valorInicialdeDeposito += amount;
    }

    public void Sacar(double amount){
        this.valorInicialdeDeposito -= amount + 5.0;
    }

    public String toString(){
        return  "Conta: " + numeroDaConta +
                ", Usuario: " + nomeDoTitular + ", Saldo: $"+
                String.format("%.2f%n", valorInicialdeDeposito);

    }
}
