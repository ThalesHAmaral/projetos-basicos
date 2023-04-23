import java.util.Locale;
import java.util.Scanner;

public class Produto {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        Scanner sc = new Scanner(System.in);
        Backdoproduto Produto;
        Backdoproduto Backdoproduto = new Backdoproduto();

        System.out.println("Entre com dados do produto: ");

        System.out.print("Nome do Produto: ");
        Backdoproduto.name = sc.nextLine();

        System.out.print("Valor do Produto: ");
        Backdoproduto.price = sc.nextDouble();

        System.out.print("Quantidade do Produto: ");
        Backdoproduto.quantidade = sc.nextInt();

        System.out.println();
        System.out.println("Informaçoes do Produto: " + Backdoproduto);

        System.out.println();
        System.out.print("Entre com os produtos adicionados ao estoque: " );
        int quantidade = sc.nextInt();
        Backdoproduto.addProdutos(quantidade);

        System.out.println();
        System.out.println("Dados atualizados:  " + Backdoproduto);

        System.out.println();
        System.out.print("Entre com os produtos removidos do estoque: ");
        quantidade = sc.nextInt();
        Backdoproduto.removeProdutos(quantidade);

        System.out.println();
        System.out.println("Dados Atualizados: " + Backdoproduto);


    }
}
