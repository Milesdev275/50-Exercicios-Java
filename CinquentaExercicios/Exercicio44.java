import java.util.Locale;
import java.util.Scanner;

public class Exercicio44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite o valor da compra: ");
        double valorCompra = scanner.nextDouble();

        double frete = (valorCompra >= 150) ? 0 : 20;

        System.out.println("Valor do frete: R$ " + frete);

        scanner.close();
    }
}
