import java.util.Locale;
import java.util.Scanner;

public class aula05exer11 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        //Quanto irá sobrar de ração para gatos após 5 dias
        System.out.print("Digite aqui o peso do saco em quilos: ");
        double saco_kg = sc.nextDouble();
        double pesoGram = saco_kg * 1000;
        System.out.print("Digite aqui quantas gramas de ração você deu ao primeiro gato: ");
        double gato1 = sc.nextDouble();
        System.out.print("Digite aqui quantas gramas de ração de você deu ao segundo gato: ");
        double gato2 = sc.nextDouble();
        double totalRacao = (gato1 + gato2) * 5;

        double resto = pesoGram - totalRacao;
        System.out.printf("Após 5 dias, o resto de ração será: %.2f", resto);

        sc.close();
    }
}
