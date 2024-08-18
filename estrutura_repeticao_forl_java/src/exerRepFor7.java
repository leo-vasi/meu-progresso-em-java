import java.util.Locale;
import java.util.Scanner;

public class exerRepFor7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite aqui a quantidade de vezes que deseja usar este algoritmo: ");
        int n = sc.nextInt();

        for (int i = 1 ; i <= n ; i ++) {
            int primeiro = i;
			int segundo = i * i;
			int terceiro = i * i * i;
            System.out.printf("Primeiro: %d Segundo: %d Terceiro: %d%n", primeiro, segundo, terceiro);
        }

        sc.close();
    }
}
