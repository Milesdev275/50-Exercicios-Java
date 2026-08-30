import java.util.Scanner;

public class Exercicio41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade do usuario: ");
        int idade = scanner.nextInt();

        String mensagem = (idade >= 18) ? "Maior de idade." : "Menor de idade.";

        System.out.println(mensagem);

        scanner.close();
    }
}
