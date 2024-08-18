import java.util.Locale;
import java.util.Scanner;

public class exerCond4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite aqui a hora de ínicio do jogo: ");
        int hora_inicio = scanner.nextInt();

        System.out.print("Digite aqui a hora de encerramento do jogo: ");
        int hora_fim = scanner.nextInt();

        int duracao;
        if (hora_inicio < hora_fim) {
            duracao = hora_fim - hora_inicio;
        }
        else {
            duracao = 24 - hora_inicio + hora_fim;
        }

        System.out.println("A partida durou: " + duracao + " horas");

        scanner.close();
    }
}
