import java.util.Locale;
import java.util.Scanner;

public class exerRepWhile1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        
        System.out.print("Digite aqui código do tipo de combustível de sua preferência( 1.Álcool 2.Gasolina 3.Diesel 4.Fim): ");
        int tipo = sc.nextInt();
        
        while (tipo != 4) {
            if (tipo == 1) {
                gasolina += 1;
            }
            else if (tipo == 2 ) {
                gasolina += 1;
            }
            else {
                diesel += 1;
            }
            tipo = sc.nextInt();
        }

        System.out.printf("Muito obrigado%n Álcool: %d%n Gasolina: %d%n Diesel: %d", alcool, gasolina, diesel);


        sc.close();
    }
}
