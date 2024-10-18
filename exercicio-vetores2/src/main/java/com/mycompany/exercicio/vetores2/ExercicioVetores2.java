package com.mycompany.exercicio.vetores2;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioVetores2 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas números você deseja digitar? ");
        int n = sc.nextInt();
        double sum;
        double avg;
        int[] vect = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextInt();
        }
        sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum = sum + vect[i];
        }
        avg = sum / n;
        System.out.print("VALORES = ");

        for (int i = 0; i < n; i++) {
            System.out.printf("%.1f ", vect[i]);
        }
        System.out.printf("SOMA: %.2f%n", sum);
        System.out.printf("MÉDIA: %.2f%n", avg);
        sc.close();
    }
}
