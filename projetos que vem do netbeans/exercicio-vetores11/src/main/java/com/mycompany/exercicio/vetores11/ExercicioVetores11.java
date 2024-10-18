package com.mycompany.exercicio.vetores11;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioVetores11 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas você vai digitar?");
        int n = sc.nextInt();

        double[] alturas = new double[n];
        char[] genero = new char[n];

        double maiorAltura = 0;
        double menorAltura = 0;
        double mediaAlturaF = 0;
        int numHomens = 0;
        int numMulheres = 0;
        double alturaFtotal = 0;

        for (int i = 0; i < n; i++) {
            System.out.printf("Altura da %dº pessoa: ", i + 1);
            alturas[i] = sc.nextDouble();
            System.out.printf("Genero da %dº pessoa: ", i + 1);
            genero[i] = sc.next().charAt(0);
        }
        menorAltura = alturas[0];
        maiorAltura = alturas[0];

        for (int i = 0; i < n; i++) {
            if (alturas[i] > maiorAltura) {
                maiorAltura = alturas[i];
            }
            if (alturas[i] < menorAltura) {
                menorAltura = alturas[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if (genero[i] == 'M') {
                numHomens++;
            } else {
                numMulheres++;
                alturaFtotal += alturas[i];
            }
        }
        mediaAlturaF = alturaFtotal / numMulheres;

        System.out.println("Menor altura = " + menorAltura);
        System.out.println("Maior altura = " + maiorAltura);
        System.out.println("Media de altura das mulheres = " + mediaAlturaF);
        System.out.println("Número de homens = " + numHomens);
        sc.close();
    }
}
