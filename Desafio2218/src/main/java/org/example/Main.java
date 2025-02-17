package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();

            int r = (n * (n +1) / 2 + 1) ;

            System.out.println(r);
        }

        sc.close();
    }
}