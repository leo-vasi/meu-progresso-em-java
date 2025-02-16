package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            ArrayList<Integer> idades = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                int idade = sc.nextInt();
                idades.add(idade);
            }

            int capitao = idades.get(n / 2);

            System.out.printf("Case %d: %d%n", i + 1, capitao);

        }

        sc.close();

    }
}