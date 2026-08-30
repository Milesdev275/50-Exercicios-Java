import java.util.Locale;
import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite o valor da compra: ");
        double valor = scanner.nextDouble();

        double valorFinal;

        if (valor >= 200) {
            valorFinal = valor - (valor * 0.10);
        } else {
            valorFinal = valor;
        }

        System.out.println("Valor final da compra: R$ " + valorFinal);

        scanner.close();
    }
}
