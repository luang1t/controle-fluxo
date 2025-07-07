
// Joãozinho recebeu R$ 50,00 de mesada e foi em uma loja de doces gastar todo seu dinheiro, logo, enquanto o valor dos doces não igualar R$ 50,00 ele foi adicionando itens no carrinho.
import java.util.Scanner;

public class ExemploWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double joazinhoMoney = 50.00;

        while (joazinhoMoney > 5) {
            System.out
                    .println("Escolha o que deseja comprar:\n1 - Bala = 10\n2 - Refrigerante = 15\n3 - Salgadinho = 5");
            int selecioneOqueDeseja = 0;
            selecioneOqueDeseja = scanner.nextInt();

            switch (selecioneOqueDeseja) {
                case 1:
                    System.out.println("Selecionou um Bala!");
                    joazinhoMoney = joazinhoMoney - 10;
                    System.out.println("Você ainda tem R$: " + joazinhoMoney);
                    break;

                case 2:
                    System.out.println("Selecionou um Refrigerante!");
                    joazinhoMoney = joazinhoMoney - 15;
                    System.out.println("Você ainda tem R$: " + joazinhoMoney);
                    break;
                case 3:
                    System.out.println("Selecionou um Salgadinho!");
                    joazinhoMoney = joazinhoMoney - 5;
                    System.out.println("Você ainda tem R$: " + joazinhoMoney);
                    break;
            }
            System.out.println("Jhon gastou toda sua mesada!");
            scanner.close();
        }
    }
}
