package com.mycompany.exercicio.vetores8;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioVetores8 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextInt();
        }
        int soma = 0;
        int pares = 0;
        for (int i = 0; i < n; i++) {
            if (vetor[i] % 2 == 0) {
                soma += vetor[i];
                pares++;
            }
        }
        double media;
        if (pares == 0) {
            System.out.println("NENHUM NUMERO PAR");
        } else {
            media = (double) soma / pares;

            System.out.printf("MEDIA DOS PARES = %.1f", media);
        }

        sc.close();
    }
}
