import java.util.Locale;
import java.util.Scanner;
public class aula05exer01 {
    public static void main(String[] args) throws Exception {
    // Calculando a função de Y com o valor de X
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite aqui um valor para X: ");
    double x = sc.nextDouble();
    double y = (x * 3) + 2;

    System.out.println("O valor de y para x é: " + y);
    sc.close();
    }
}
