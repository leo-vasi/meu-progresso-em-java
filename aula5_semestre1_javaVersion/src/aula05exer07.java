import java.util.Locale;
import java.util.Scanner;

public class aula05exer07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        //Conversão de segundos em minutos

        System.out.print("Digite aqui o tempo em segundos: ");
        double segundos = sc.nextDouble();
        double convMin = segundos / 60;
        double convSeg = segundos % 60;

        System.out.printf("O resultado da conversão para minutos é: %.0f e para segundos: %.0f", convMin, convSeg);
        sc.close();
    }
}
