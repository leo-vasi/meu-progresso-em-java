import java.util.Locale;
import java.util.Scanner;

public class aula05exer05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        //Mostrando o valor de aumento de salário
        
        System.out.print("digite aqui o seu salário: ");
        double salario = sc.nextDouble();

        System.out.print("Digite aqui o percentual de aumento: ");
        double percentual = sc.nextDouble();

        double aumento = salario * percentual / 100;

        double novoSalario = salario + aumento;

        System.out.printf("O novo salário é: %.2f ", novoSalario);


        sc.close();
    }
}
