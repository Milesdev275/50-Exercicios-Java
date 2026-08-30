package CinquentaExercicios;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite uma medida em metros: ");
        double metros = scanner.nextDouble();

        double centimetros = metros * 100;

        System.out.println();
        System.out.println(metros + " metros equivalem a " + centimetros + " centimetros.");

        scanner.close();
    }
}
