package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int n = sc.nextInt();
            int custoPorDia = sc.nextInt();

            int[] receitas = new int[n];
            for (int i = 0; i < n; i++) {
                receitas[i] = sc.nextInt();
            }

            int[] lucroPorDia = new int[n];
            for (int i = 0; i < n; i++) {
                lucroPorDia[i] = receitas[i] - custoPorDia;
            }

            int maxAtual = 0;
            int maxAbs = 0;

            for (int i = 0; i < n; i++) {
                maxAtual += lucroPorDia[i];

                if (maxAtual < 0) {
                    maxAtual = 0;
                }

                if (maxAtual > maxAbs) {
                    maxAbs = maxAtual;
                }
            }

            System.out.println(maxAbs);
        }

        sc.close();
    }
}