import java.util.Locale;
import java.util.Scanner;

public class Exercicio47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Cardapio:");
        System.out.println("1 - Hamburguer - R$ 25,00");
        System.out.println("2 - Pizza - R$ 40,00");
        System.out.println("3 - Salada - R$ 18,00");
        System.out.println("4 - Refrigerante - R$ 8,00");

        System.out.print("Escolha a opcao: ");
        int opcao = scanner.nextInt();

        System.out.print("Digite a quantidade: ");
        int quantidade = scanner.nextInt();

        String nomeItem;
        double preco;

        switch (opcao) {
            case 1:
                nomeItem = "Hamburguer";
                preco = 25.00;
                break;
            case 2:
                nomeItem = "Pizza";
                preco = 40.00;
                break;
            case 3:
                nomeItem = "Salada";
                preco = 18.00;
                break;
            case 4:
                nomeItem = "Refrigerante";
                preco = 8.00;
                break;
            default:
                System.out.println("Opcao invalida.");
                scanner.close();
                return;
        }

        double valorTotal = preco * quantidade;

        System.out.println("Item: " + nomeItem);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor total do pedido: R$ " + valorTotal);

        scanner.close();
    }
}
