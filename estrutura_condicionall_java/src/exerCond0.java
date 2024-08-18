import java.util.Locale;
import java.util.Scanner;

public class exerCond0 {
    public static void main(String[] args) {
     Locale.setDefault(Locale.US);
     Scanner scanner = new Scanner(System.in);

     System.out.print("Que horas são? ");
     int horas = scanner.nextInt();
     if (horas < 12) {
        System.out.println("Bom dia manito!");
     }
     else {
        System.out.println("Boa tarde!");
     }
     scanner.close();
    }
}
