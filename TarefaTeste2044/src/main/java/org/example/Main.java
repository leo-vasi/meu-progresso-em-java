package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            if (n == -1) {
                break;
            }

            int divida = 0;
            int diaCobranca = 0;

            for (int i = 0; i < n; i++) {
                int ingresso = sc.nextInt();
                divida += ingresso;

                if (divida % 100 == 0) {
                    diaCobranca++;
                    divida = 0;
                }
            }

            System.out.println(diaCobranca);
        }

        sc.close();
    }
}
