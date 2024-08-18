import java.util.Locale;
import java.util.Scanner;

public class for_In {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite aqui a quantidade de vezes que deseja digitar: ");
        int n = sc.nextInt();
        int soma = 0;

        for (int i = 1 ; i <= n ; i++) {
            System.out.printf("Digite aqui o %dº número: ", i);
            int x = sc.nextInt();
            soma += x;
        }

        System.out.println("A soma é: " + soma);

        sc.close();
    }
}
