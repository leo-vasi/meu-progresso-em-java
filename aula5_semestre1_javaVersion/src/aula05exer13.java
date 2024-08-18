import java.util.Locale;
import java.util.Scanner;

public class aula05exer13 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        //Meta de vendas para abater o valor do espetacúlo
        System.out.print("Digite aqui o custo do espetáculo: ");
        double custoEspec = sc.nextDouble();
        
        System.out.print("Digite aqui o valor do ingresso: ");
        double precoIngresso = sc.nextDouble();

        double meta = custoEspec / precoIngresso;
        System.out.printf("Serão necessários: %.2f vendas para abater a meta.", meta);

        sc.close();
    }
}
