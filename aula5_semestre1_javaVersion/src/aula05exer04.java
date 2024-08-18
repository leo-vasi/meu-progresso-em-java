import java.util.Locale;
import java.util.Scanner;

public class aula05exer04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        //Saldo após um reajuste de 15%
        System.out.print("Digite aqui o saldo atual: ");
        double saldoAtual = sc.nextDouble();
        double novoSaldo = saldoAtual * 0.15;
        System.out.printf("Seu saldo atual após reajuste de 15% é: %.2f", novoSaldo);

        sc.close();
    }
}
