import java.util.Locale;
import java.util.Scanner;

public class exerRepFor5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite aqui a quantidade de vezes que deseja usar este algoritmo: ");
        int n = sc.nextInt();
        int fatorial = 1;
        for (int i = 1 ; i <= n ; i ++) {
            fatorial = fatorial * i;
        }
        System.out.println("O resultado é: " + fatorial);

        sc.close();
    }
}
