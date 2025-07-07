import java.util.Scanner;

//Joãozin está ligando para você querendo avisar que comeu muito doce! Você decide se vai atender ou não.
public class ExemploDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int atender;
        do {
            System.out.println("Little Jhon está ligando... quer atender?\n1 - Sim\n2 - Não.");
            atender = scanner.nextInt();
            if (atender != 1) {
                System.out.println("Você ignorou Little Jhon!");
            }
        } while (atender != 1);
        System.out.println("Little Jhon ligou para dizer que comeu muitos doces!");
        scanner.close();
    }
}
