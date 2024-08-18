package application;
import java.util.Locale;
import java.util.Scanner;
import entities.Triangle;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Entre com as medidas do triângulo X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.print("Entre com as medidas do triângulo Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();
        double areaY = y.area();
        System.out.printf("Area do triângulo X é: %.4f%nArea do Triângulo é: %.4f%n", areaX, areaY);

        if (areaX > areaY) {
            System.out.print("A maior área é a área X");
        }
        else {
            System.out.print("A maior área é a área Y");
        }
    sc.close();
    }
}
