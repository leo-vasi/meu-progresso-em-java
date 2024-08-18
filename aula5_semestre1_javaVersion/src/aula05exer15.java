import java.util.Locale;
import java.util.Scanner;

public class aula05exer15 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        //Quanto restará do salário de João após pagamento de suas dívidas
        System.out.print("Digite aqui seu salário: ");
        double salario = sc.nextDouble();

        System.out.print("Digite aqui o valor da 1º conta: ");
        double conta1 = sc.nextDouble();

        System.out.print("Digite aqui o valor da 2º conta: ");
        double conta2 = sc.nextDouble();

        double contaJuros = (conta1 * 0.02) + (conta2 * 0.02);

        double restoTotal = salario - contaJuros;
        System.out.printf("Restará: %.2f reais após o pagamento das contas com os juros inclusos", restoTotal);
        sc.close();
    }
}
