package com.mycompany.exercicio.vetores7;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioVetores7 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas números você deseja digitar? ");
        int n = sc.nextInt();

        double[] vect = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número:  ");
            vect[i] = sc.nextDouble();
        }
        double soma = 0;
        for (int i = 0; i < n; i++) {
            soma += vect[i];
        }
        double media = soma / n;
        System.out.printf("MEDIA DO VETOR = %.3f", media);
        System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
        for (int i = 0; i < n; i ++) {
            if (vect[i] < media) {
                System.out.printf("%.1f", vect[i]);
            }
        }
        sc.close();
    }
}
