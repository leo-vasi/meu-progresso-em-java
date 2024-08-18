package aula9;

import java.util.Locale;
import java.util.Scanner;

public class Aula9exer03 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Algoritmo para cadastrar o controle de qualidade, "
                + "imprime os números das peças reprovadas, e o total de peças "
                + "aprovadas e reprovadas no final do dia.");
        
        int contA = 0;
        int contR = 0;
        
        for (int i = 1; i <= 4; i++) {
            System.out.printf("%dª peça\n", i);
            
            System.out.print("Digite aqui o código da peça: ");
            int cod = sc.nextInt();
            sc.nextLine();
            
            System.out.print("Digite aqui a qualidade da peça (A ou R): ");
            String qual = sc.nextLine().trim().toLowerCase();
            
            while (!qual.equals("a") && !qual.equals("r")) {
                System.out.println("Erro! Digite 'A' para aprovado e 'R' para reprovado.");
                qual = sc.nextLine().trim().toLowerCase();
            }
            
            if (qual.equals("a")) {
                contA += 1;
            } else {
                contR += 1;
                System.out.printf("A peça com o código %d está reprovada\n", cod);
            }
            
            if (i < 4) {
                System.out.println("Pressione Enter para continuar...");
            } else {
                System.out.println("Pressione Enter para ver o relatório final...");
            }
            sc.nextLine();
        }
        
        System.out.printf("%d peças aprovadas, %d peças reprovadas\n", contA, contR);
        
        sc.close();
    }
}
