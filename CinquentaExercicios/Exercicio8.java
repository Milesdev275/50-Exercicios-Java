package CinquentaExercicios;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite um numero: ");
        double numero = scanner.nextDouble();

        double dobro = numero * 2;
        double metade = numero / 2;

        System.out.println();
        System.out.println("Numero digitado: " + numero);
        System.out.println("Dobro: " + dobro);
        System.out.println("Metade: " + metade);

        scanner.close();
    }
}
