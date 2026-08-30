package CinquentaExercicios;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); // limpa o buffer após ler o inteiro

        System.out.print("Digite sua cidade: ");
        String cidade = scanner.nextLine();

        System.out.println();
        System.out.println("Ola, " + nome + "! Voce tem " + idade
                + " anos e mora em " + cidade + ".");

        scanner.close();
    }
}
