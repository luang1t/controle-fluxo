import java.util.Scanner;

public class NomeInvocador {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nick;
        System.out.println("Digite o seu nick invocador:");
        nick = scanner.nextLine();

        String nomeInvocador = ((nick.equals("") ? "Anônimo" : nick));

        System.out.println("Nome do invocador: " + nomeInvocador);

        scanner.close();
    }
}
