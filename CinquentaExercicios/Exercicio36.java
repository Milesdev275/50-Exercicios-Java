import java.util.Locale;
import java.util.Scanner;

public class Exercicio36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite o peso (kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Digite a altura (m): ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("Seu IMC e: " + imc);

        if (imc < 18.5) {
            System.out.println("Abaixo do peso.");
        } else if (imc <= 24.9) {
            System.out.println("Peso normal.");
        } else if (imc <= 29.9) {
            System.out.println("Sobrepeso.");
        } else {
            System.out.println("Obesidade.");
        }

        scanner.close();
    }
}
