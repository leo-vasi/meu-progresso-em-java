package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String a = sc.next();
            String b = sc.next();

            if (a.endsWith(b)) {
                System.out.println("encaixa");
            }
            else {
                System.out.println("nao encaixa");
            }
        }

        sc.close();
    }
}