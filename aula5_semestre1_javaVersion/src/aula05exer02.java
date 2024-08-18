import java.util.Locale;
import java.util.Scanner;

public class aula05exer02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        // Descobrindo o tempo necessário para download do seu arquivo.
        System.out.print("Digite aqui tamanho do arquivo: ");
        double arquivo = sc.nextDouble();

        System.out.print("Digite aqui a velocidade de transferência: ");
        double speed = sc.nextDouble();

        double tempo = arquivo/(speed* 8);

        System.out.printf("O tempo necessário para o download é: %.2f", tempo);


        sc.close();
    }
}
