package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] n = new int[5];

        int positivo = 0;
        int par = 0;
        int negativo = 0;
        int impar = 0;

        for(int i = 0; i < 5; i++ ) {
            n[i] = sc.nextInt();

            if (n[i] % 2 == 0) {
                par++;
            }
            else {
                impar++;
            }
            if (n[i] > 0) {
                positivo++;
            }
            else if (n[i] < 0){
                negativo++;
            }
        }

        System.out.println(par + " valor(es) par(es)");
        System.out.println(impar + " valor(es) impar(es)");
        System.out.println(positivo + " valor(es) positivo(s)");
        System.out.println(negativo + " valor(es) negativo(s)");

        sc.close();
    }
}