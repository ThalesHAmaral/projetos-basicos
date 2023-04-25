import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.println("Resultados");
        System.out.println();

        System.out.print("Nome do Aluno: ");
        aluno.name = sc.nextLine();

        System.out.print("Nota do primeiro Trimestre do Aluno: ");
        aluno.primeiroTri = sc.nextDouble();

        System.out.print("Nota do segundo Trimestre do Aluno: ");
        aluno.segundoTri = sc.nextDouble();

        System.out.print("Nota do terceiro Trimestre do Aluno: ");
        aluno.terceiroTri = sc.nextDouble();

        System.out.printf("Nota Final do Aluno:  %.2f%n" , aluno.notafinal());

        if(aluno.notafinal() < 60.0){
            System.out.println("REPROVADO");
            System.out.println("Faltou: " + aluno.Resultado() + " pontos " );
        } else {
            System.out.printf("APROVADO!! Com a nota de: %.2f%n " , aluno.notafinal());
        }

    }
}