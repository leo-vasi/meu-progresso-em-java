package com.mycompany.vetorexemplo;

import java.util.Locale;
import java.util.Scanner;

/**
Este código tem o propósito de testar o funcinamento de vetores, o programa irá calcular a altura média
 */
public class VetorExemplo {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        double [] vect = new double [n];
        
        for (int i = 0; i < n; i++) {
            vect[i] = sc.nextDouble();
        }
        double sum = 0.0;
        for (int i = 0; i<n; i++ ) {
            sum += vect[i];
        }
        double avg = sum / n;
        
        System.out.printf("Average height :  %.2f%n", avg);
        sc.close();
    }
}
