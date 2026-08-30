import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade da pessoa: ");
        int idade = scanner.nextInt();

        System.out.print("Voce tem CNH? (true/false): ");
        boolean temCNH = scanner.nextBoolean();

        if (idade >= 18 && temCNH) {
            System.out.println("Pode dirigir.");
        } else {
            System.out.println("Nao pode dirigir.");
        }

        scanner.close();
    }
}
