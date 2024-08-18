import java.util.Locale;
import java.util.Scanner;

public class aula05exer08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        //Calculando a hipotenusa
        System.out.print("Digite um valor para o lado A: ");
        double ladoA = sc.nextDouble();

        System.out.print("Digite um valor para o lado B: ");
        double ladoB = sc.nextDouble();

        double hipotenusa = Math.sqrt(Math.pow(ladoA, 2) + Math.pow(ladoB, 2));
        System.out.printf("A hipotenusa é: %.2f%n", hipotenusa);

        sc.close();
    }
}
