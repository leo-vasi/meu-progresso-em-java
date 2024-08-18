package aula9;

import java.util.Locale;
import java.util.Scanner;

public class Aula9exer02 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Jogo de adivinhação");
        int tentativas = 0;
        
        System.out.print("Player 1, digite aqui um número de 1 a 10: ");
        int player1 = sc.nextInt();
        
        if (player1 <= 0 || player1 > 10) {
            System.out.println("Erro, digite um número de 1 a 10");
        } else {
            int player2;
            do {
                System.out.print("Player 2, digite aqui um número de 1 a 10: ");
                player2 = sc.nextInt();
                tentativas += 1;
                
                if (player2 <= 0 || player2 > 10) {
                    System.out.println("Erro, digite um número de 1 a 10");
                } else if (player2 != player1) {
                    System.out.println("Tente novamente");
                }
            } while (player1 != player2);
            
            System.out.printf("O segundo jogador acertou depois de %d tentativas\n", tentativas);
        }
        sc.close();
    }
}
