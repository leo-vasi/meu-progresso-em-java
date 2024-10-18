package com.mycompany.exercicio.vetores6;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioVetores6 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas números você deseja digitar? ");
        int n = sc.nextInt();

        int[] vectA = new int[n];
        int[] vectB = new int[n];
        int[] vectC = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite valores para o vetor A:  ");
            vectA[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print("Digite valores para o vetor B:  ");
            vectB[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            vectC[i] = vectA[i] + vectB[i];
        }
        System.out.println("VETOR RESULTANTE:");

        for (int i = 0; i < n; i++) {
            System.out.printf("%d\n", vectC[i]);
        }

        sc.close();
    }
}
