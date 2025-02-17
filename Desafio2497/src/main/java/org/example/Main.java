package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testNum = 0;

        while (true) {
            int n = sc.nextInt();
            if (n == -1) {
                break;
            }
            testNum++;
            int qtdCiclos = n / 2;

            System.out.println("Experiment " + testNum + ": " + qtdCiclos + " full cycle(s)");
        }

        sc.close();
    }
}