import java.util.Locale;
import java.util.Scanner;

public class aula05exer09 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        //Calculando o número de horas trabalhadas

        System.out.print("Digite aqui o seu salário: ");
        double salario = sc.nextDouble();

        System.out.print("Digite aqui quantas horas você trabalhou: ");
        double horasTrab = sc.nextDouble();

        double valHorTrab = salario / 2;
        double salarioBruto = horasTrab * valHorTrab;
        
        double salarioReceber = salarioBruto - (salarioBruto * 0.03);
        System.out.printf("Salário a receber: %.2f reais", salarioReceber); 
        
        sc.close();
    }
}
