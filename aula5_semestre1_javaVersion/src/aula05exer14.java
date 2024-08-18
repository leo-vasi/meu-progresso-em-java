import java.util.Locale;
import java.util.Scanner;

public class aula05exer14 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        //Calculando o novo peso de uma pessoa
        System.out.print("Digite aqui o seu peso: ");
        double pesoAtual = sc.nextDouble();

        double engordar = pesoAtual + (pesoAtual * 0.15);
        double emagrecer = pesoAtual - (pesoAtual * 0.20);
        System.out.printf("O seu peso atual é: %.2f%nSeu peso caso engorde: %.2f%nSeu peso caso emagreça: %.2f", pesoAtual, engordar, emagrecer);

        sc.close();
    }
}
