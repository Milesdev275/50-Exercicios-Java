import java.util.Locale;
import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite um numero: ");
        double numero = scanner.nextDouble();

        if (numero < 0) {
            System.out.println("Numero negativo.");
        }

        scanner.close();
    }
}
