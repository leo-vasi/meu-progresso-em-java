import java.util.Locale;
import java.util.Scanner;

public class aula05exer16 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        //Calculando quanto de luz um cômodo precisará
        System.out.print("Digite aqui a largura do cômodo: ");
        double largura = sc.nextDouble();

        System.out.print("Digite aqui o comprimento do cômodo: ");
        double comprimento = sc.nextDouble();

        double areaM2 = largura * comprimento;
        double potencia = areaM2 * 18;
        System.out.printf("A área é: %.2f metros quadrados e a potência necessária de iluminação será: %.2fW", areaM2, potencia);

        sc.close();
    }
}
