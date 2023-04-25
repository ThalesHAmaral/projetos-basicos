import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        Scanner sc = new Scanner(System.in);
        Funcionario dados;
        Funcionario funcionario = new Funcionario();



            System.out.print("Nome do Funcionario: ");
            funcionario.name = sc.nextLine();

            System.out.print("Salario do Funcionario: ");
            funcionario.salarioBruto = sc.nextDouble();

            System.out.print("Imposto do Funcionario: ");
            funcionario.taxa = sc.nextDouble();

            System.out.println();
            System.out.println("Funcionario : " + funcionario);

            System.out.println();
            System.out.print("Quanto sera a porcentagem aumentada no salario: ");
            double aumento  = sc.nextDouble();
            funcionario.aumentarSalario(aumento);

            System.out.println();
            System.out.print("Informaçoes atualizadas: " + funcionario);

    }
}