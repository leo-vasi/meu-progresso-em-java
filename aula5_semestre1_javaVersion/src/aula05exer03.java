import java.util.Locale;
import java.util.Scanner;

public class aula05exer03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        //Calculando o consumo médio de um automóvel.

        System.out.print("Digite aqui a distância a ser percorrida em km: ");
        double distancia = sc.nextDouble();

        System.out.print("Digite aqui quanto de combustível foi gasto: ");
        double consumo = sc.nextDouble();

        double calcConsu = distancia/consumo;

        System.out.printf("Você gastou: %.2f  litros.", calcConsu);

        sc.close();
    }
}
