import java.util.Locale;
import java.util.Scanner;

public class exerRepFor2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite aqui a quantiadade de valores: ");
        int n = sc.nextInt();
        int in = 0;
        int out = 0;

        for (int i = 1 ; i <=+ n ; i++) {
            System.out.print("Digite aqui um valor: ");
            int x = sc.nextInt();
            if (x >= 10 && x <= 20) {
                in += 1;
            }
            else {
                out += 1;
            }
        }
        System.out.println(in + " in ");
        System.out.println(out + " out ");

        sc.close();
    }
}
