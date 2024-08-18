import java.util.Locale;
import java.util.Scanner;

public class aula06exer10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        //Declaração de imposto de renda
        System.out.print("Digite aqui o seu nome: ");
        String nome= sc.nextLine();

        System.out.print("\n\nDigite aqui o seu cpf: ");
        double cpf = sc.nextDouble();

        if (cpf <= 500) {
            System.out.println("Erro, digite seu CPF!");
        } else {
            System.out.print("\n\nDigite aqui a sua renda anual: ");
            double rendaAnual = sc.nextDouble();

            if (rendaAnual <= 0) {
                System.out.println("Erro, digite sua renda anual!");
            } else {
                System.out.print("\n\nDigite aqui o número de dependentes: ");
                double numDepen = sc.nextDouble();

                if (numDepen >= 50) {
                    System.out.println("Erro, digite um número de dependentes válido!");
                } else {
                    double valor = rendaAnual - (numDepen * 110);

                    if (valor <= 800) {
                        System.out.println(nome + "\n\nIsento");
                    } else if (valor > 800 && valor <= 4000) {
                        double resultado = valor * 0.025;
                        double resultadoTotal = resultado + valor;
                        System.out.printf("\n\nO valor será: %.2f\n", resultadoTotal);
                    } else if (valor > 4000 && valor < 9000) {
                        double resultado = valor * 0.05;
                        double resultadoTotal = resultado + valor;
                        System.out.printf("\n\nO valor será: %.2f\n", resultadoTotal);
                    } else if (valor >= 9000) {  // Alterado para >= para cobrir todos os casos
                        double resultado = valor * 0.1;
                        double resultadoTotal = resultado + valor;
                        System.out.printf("\n\nO valor será: %.2f\n", resultadoTotal);
                    } else {
                        System.out.println("Valores inválidos, digite os valores requisitados");
                    }
                }
            }
        }
        
        sc.close();
    }
}
