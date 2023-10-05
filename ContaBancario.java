import java.util.Scanner;

public class ContaBancario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome = "Thales Henrique ";
        String tipoConta = "Corrente";
        double saldoInicial = 2500.99;
        int operacoes = 0 ;


        System.out.println("***************************");

        System.out.println("Digite iniciais do cliente: ");
        System.out.println();

        System.out.print("Nome:" + nome);
        System.out.println();

        System.out.print("Tipo conta:" + tipoConta);
        System.out.println();

        System.out.printf("Saldo Incial: %.2f " , saldoInicial);
        System.out.println();

        System.out.println("***************************");
        System.out.println();

       String menu = """
               ** Digite sua opçao ** 
               1 - Consultar saldo
               2 - Depositar valor
               3 - Transferir valor
               4 - Sair
               
               """;

       while (operacoes!= 4){
           System.out.println();
           System.out.println(menu);
           System.out.println("Digite sua aqui: ");
           operacoes = sc.nextInt();


           if(operacoes == 1){
               System.out.printf("Seu saldo é: %.2f", saldoInicial);
               System.out.println();
           }
           else if(operacoes == 2){
               System.out.print("Depositar valor de R$:" );
               double receberValor = sc.nextDouble();
                saldoInicial = saldoInicial  + receberValor;
               System.out.printf("Saldo atualizado: R$ %.2f", saldoInicial);
               System.out.println();
           }

           else if (operacoes == 3){
               System.out.print("Transferir valor de R$ : ");
               double transferirValor = sc.nextDouble();
               if(transferirValor > saldoInicial){
                   System.out.println("Nao ha saldo suficiente para a transferiencia");
               }else{
                saldoInicial = saldoInicial - transferirValor;
               System.out.print("Saldo atualizado: R$: " + saldoInicial);
               System.out.println();
               }
           }
           else if (operacoes!= 4) {
               System.out.println("Opçao invalida");
           }


       }
    }
}


