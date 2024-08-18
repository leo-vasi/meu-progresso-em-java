import java.util.Locale;
import java.util.Scanner;

public class exer4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite aqui o número do funcionário: ");
        int num_func = scanner.nextInt();

        System.out.print("Digite aqui o número de horas trabalhadas: ");
        int horas_trab = scanner.nextInt();

        System.out.print("Digite aqui quanto o funcionário ganha por hora: ");
        double ganho_hora = scanner.nextDouble();

        double salario_total = horas_trab * ganho_hora;

        System.out.printf("Número: %d %nSalário: U$ %.2f %n", num_func, salario_total );
        scanner.close();
    }

}
