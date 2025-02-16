package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {


            int n = sc.nextInt();
            int custoPorDia = sc.nextInt();

            List<Integer> receitas = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                receitas.add(sc.nextInt());
            }

            List<Integer> lucroPorDia = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                lucroPorDia.add(receitas.get(i) - custoPorDia);
            }

            int maxAtual = 0;
            int maxAbs = 0;

            for (int i = 0; i < n; i++) {
                maxAtual += lucroPorDia.get(i);

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
