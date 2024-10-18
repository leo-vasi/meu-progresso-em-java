package com.mycompany.exercicio.vetores5;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioVetores5 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas números você deseja digitar? ");
        int n = sc.nextInt();

        double maiorValor;
        int position;

        int[] vect = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextInt();
        }
        maiorValor = vect[0];
        position = 0;
        System.out.println("Maior valor: ");
        for(int i = 0; i < n; i++) {
            if (vect[i] > maiorValor) {
                position = i;
            }
        }
        System.out.printf("Maior valor: %.1f%n", maiorValor);
        System.out.printf("Posição: %d%n", position);
        sc.close();
    }
}
