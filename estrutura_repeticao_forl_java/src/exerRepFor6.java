import java.util.Locale;
import java.util.Scanner;

public class exerRepFor6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite aqui a quantidade de vezes que deseja usar este algoritmo: ");
        int n = sc.nextInt();

        for (int i = 1 ; i <= n ; i ++) {
            if (i % i == 0) {
                System.out.println(i);
            }
        }


        sc.close();
    }
}
