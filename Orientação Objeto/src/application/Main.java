package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Produto;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Produto produto;


        System.out.print("Entre com numero da Conta: ");
        int numero = sc.nextInt();
        System.out.print("Entre com o Usuario: ");
        sc.nextLine();
        String nome = sc.nextLine();
        System.out.print("Tem algum deposito incial (y/n) ? ");
        char reposta = sc.next().charAt(0);
        if(reposta == 'y'){
            System.out.print("Entre com valor do Deposito: ");
            double valorDoDeposito = sc.nextDouble();
            produto = new Produto(numero2,nome2,valorDoDeposito2);
        }else {
            produto = new Produto(numero,nome);
        }

        System.out.println();
        System.out.println("Dados da Conta:");
        System.out.println(produto);

        System.out.print("Entre com valor de Deposito: ");
        double depositar = sc.nextDouble();
        produto.Depositar(depositar);

        System.out.println("Atualizaçao da Conta: ");
        System.out.println(produto);

        System.out.println("Entre com o valor de Saque: ");
        double sacar = sc.nextDouble();
        produto.Sacar(sacar);

        System.out.println("Atualizaçao da Conta:");
        System.out.println(produto);
    }

}
