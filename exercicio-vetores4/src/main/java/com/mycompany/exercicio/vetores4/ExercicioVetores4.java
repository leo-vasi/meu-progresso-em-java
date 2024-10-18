package com.mycompany.exercicio.vetores4;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioVetores4 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas números você deseja digitar? ");
        int n = sc.nextInt();

        int[] vect = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextInt();
        }
        int pares = 0;
        System.out.println("Números pares: ");
        for (int i = 0; i < n; i++) {
            if (vect[i] % 2 == 0) {
                System.out.println(vect[i]);
                pares++;
            }
        }
        System.out.printf("QUANTIDADE DE PARES = %d", pares);
        sc.close();
    }
}
