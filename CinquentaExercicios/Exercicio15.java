import java.util.Locale;
import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite a temperatura atual: ");
        double temperatura = scanner.nextDouble();

        if (temperatura > 30) {
            System.out.println("Esta muito quente hoje.");
        }

        scanner.close();
    }
}
