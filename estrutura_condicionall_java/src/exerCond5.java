import java.util.Locale;
import java.util.Scanner;

public class exerCond5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite aqui o código do lanche: ");
        int cod = scanner.nextInt();

        System.out.print("Digite aqui quantidade do pedido: ");
        int qntd = scanner.nextInt();
        
        double total;
     if (cod == 1) {
        total = qntd * 4.00;
     }
     else if (cod == 2) {
        total = qntd * 4.50;
     }
     else if (cod == 3) {
        total = qntd * 5.00;
     }
     else if (cod == 4) {
        total = qntd * 2.00;
     }
     else {
        total = qntd * 1.5;
     }
        System.out.printf("O total do seu pedido é: %.2f", total);

        scanner.close();
    }
}
