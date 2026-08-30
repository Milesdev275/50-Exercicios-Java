import java.util.Scanner;

public class Exercicio31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade da pessoa: ");
        int idade = scanner.nextInt();

        if (idade < 12) {
            System.out.println("Crianca.");
        } else if (idade <= 17) {
            System.out.println("Adolescente.");
        } else if (idade <= 59) {
            System.out.println("Adulto.");
        } else {
            System.out.println("Idoso.");
        }

        scanner.close();
    }
}
