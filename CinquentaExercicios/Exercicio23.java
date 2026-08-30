import java.util.Locale;
import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite o saldo do cliente: ");
        double saldo = scanner.nextDouble();

        System.out.print("Digite o valor do produto: ");
        double valorProduto = scanner.nextDouble();

        if (saldo >= valorProduto) {
            System.out.println("Compra aprovada.");
        } else {
            System.out.println("Saldo insuficiente.");
        }

        scanner.close();
    }
}
