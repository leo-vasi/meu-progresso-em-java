import java.util.Locale;
import java.util.Scanner;

public class aula06exer08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        // Calculando o peso certo
        System.out.print("Digite seu genero: ");
        String genero = sc.nextLine().toLowerCase();

        System.out.print("Digite aqui a sua altura: ");
        double altura = sc.nextDouble();

        if (genero == "f") {
            double pesoCerto = (62.1 * altura) - 44.7;
            System.out.print("Seu peso adequado é: " + pesoCerto);
        }
        else if (genero == "h") {
            double pesoCerto = (72.7 * altura) - 58;
            System.out.print("Seu peso adequado é: " + pesoCerto);
        }
        else {
            System.out.print("Valor inválido, digite F ou H para a seleção correta.");
        }
        sc.close();
    }
}
