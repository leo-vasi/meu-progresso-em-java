package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            if (n == 0) break;

            StringBuilder resultado = new StringBuilder();
            int i = 1;

            while (i * i <= n) {
                if (i > 1) resultado.append(" ");
                resultado.append(i * i);
                i++;
            }

            System.out.println(resultado);
        }

        sc.close();
    }
}