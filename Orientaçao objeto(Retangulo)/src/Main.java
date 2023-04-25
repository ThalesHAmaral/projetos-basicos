import javax.sound.midi.Soundbank;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(new Locale("en", "US"));
        Produto Produto;
        Produto produto  = new Produto();


        System.out.print("Largura do retangulo: ");
         produto.largura = sc.nextInt();

        System.out.print("Altura do retangulo: ");
         produto.altura = sc.nextInt();

        System.out.println("Area do retalngulo: " + produto.Area());

        System.out.println("Perimetro do retangulo: " + produto.Perimetro());

        System.out.println("Diagonal do retangulo: " + produto.Diagonal());






    }
}

