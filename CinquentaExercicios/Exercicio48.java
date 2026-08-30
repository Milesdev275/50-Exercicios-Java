import java.util.Locale;
import java.util.Scanner;

public class Exercicio48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite o primeiro numero: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo numero: ");
        double numero2 = scanner.nextDouble();

        System.out.println("Menu:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtracao");
        System.out.println("3 - Multiplicacao");
        System.out.println("4 - Divisao");

        System.out.print("Escolha a operacao: ");
        int operacao = scanner.nextInt();

        switch (operacao) {
            case 1:
                System.out.println("Resultado: " + (numero1 + numero2));
                break;
            case 2:
                System.out.println("Resultado: " + (numero1 - numero2));
                break;
            case 3:
                System.out.println("Resultado: " + (numero1 * numero2));
                break;
            case 4:
                if (numero2 != 0) {
                    System.out.println("Resultado: " + (numero1 / numero2));
                } else {
                    System.out.println("Nao e possivel dividir por zero.");
                }
                break;
            default:
                System.out.println("Operacao invalida.");
        }

        scanner.close();
    }
}
