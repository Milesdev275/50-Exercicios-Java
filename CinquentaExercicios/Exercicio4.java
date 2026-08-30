package CinquentaExercicios;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite o nome do produto: ");
        String nomeProduto = scanner.nextLine();

        System.out.print("Digite o valor unitario: ");
        double valorUnitario = scanner.nextDouble();

        System.out.print("Digite a quantidade comprada: ");
        int quantidade = scanner.nextInt();

        double valorTotal = valorUnitario * quantidade;

        System.out.println();
        System.out.println("Produto: " + nomeProduto);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor total da compra: R$ " + valorTotal);

        scanner.close();
    }
}
