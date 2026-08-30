import java.util.Locale;
import java.util.Scanner;

public class Exercicio37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite o valor da compra: ");
        double valorOriginal = scanner.nextDouble();

        double percentualDesconto;

        if (valorOriginal <= 100) {
            percentualDesconto = 0;
        } else if (valorOriginal <= 300) {
            percentualDesconto = 5;
        } else if (valorOriginal <= 500) {
            percentualDesconto = 10;
        } else {
            percentualDesconto = 15;
        }

        double valorDesconto = valorOriginal * percentualDesconto / 100;
        double valorFinal = valorOriginal - valorDesconto;

        System.out.println("Valor original: R$ " + valorOriginal);
        System.out.println("Desconto aplicado: " + percentualDesconto + "% (R$ " + valorDesconto + ")");
        System.out.println("Valor final: R$ " + valorFinal);

        scanner.close();
    }
}
