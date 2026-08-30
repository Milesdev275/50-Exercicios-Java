import java.util.Locale;
import java.util.Scanner;

public class Exercicio33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite o salario do usuario: ");
        double salario = scanner.nextDouble();

        if (salario <= 1500) {
            System.out.println("Salario baixo.");
        } else if (salario <= 3000) {
            System.out.println("Salario medio.");
        } else if (salario <= 7000) {
            System.out.println("Salario bom.");
        } else {
            System.out.println("Salario alto.");
        }

        scanner.close();
    }
}
