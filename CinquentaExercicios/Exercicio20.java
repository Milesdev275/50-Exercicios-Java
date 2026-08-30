import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Voce esta logado? (true/false): ");
        boolean logado = scanner.nextBoolean();

        if (logado) {
            System.out.println("Bem-vindo ao sistema.");
        }

        scanner.close();
    }
}
