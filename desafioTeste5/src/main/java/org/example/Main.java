package org.example;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            int totalSaquesTentados = 0;
            int totalSaquesCertos = 0;
            int totalBloqueiosTentados = 0;
            int totalBloqueiosCertos = 0;
            int totalAtaquesTentados = 0;
            int totalAtaquesCertos = 0;

            sc.nextLine();

            for (int i = 0; i < n; i++) {
                String nome = sc.nextLine();
                int s = sc.nextInt();
                int b = sc.nextInt();
                int a = sc.nextInt();
                int s1 = sc.nextInt();
                int b1 = sc.nextInt();
                int a1 = sc.nextInt();
                sc.nextLine();

                totalSaquesTentados += s;
                totalSaquesCertos += s1;
                totalBloqueiosTentados += b;
                totalBloqueiosCertos += b1;
                totalAtaquesTentados += a;
                totalAtaquesCertos += a1;
            }

            double saquePercentual = (double) totalSaquesCertos / totalSaquesTentados * 100;
            double bloqueioPercentual = (double) totalBloqueiosCertos / totalBloqueiosTentados * 100;
            double ataquePercentual = (double) totalAtaquesCertos / totalAtaquesTentados * 100;

            System.out.printf("Pontos de Saque: %.2f %%.\n", saquePercentual);
            System.out.printf("Pontos de Bloqueio: %.2f %%.\n", bloqueioPercentual);
            System.out.printf("Pontos de Ataque: %.2f %%.\n", ataquePercentual);
            sc.close();
        }
    }

