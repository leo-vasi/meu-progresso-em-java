package com.mycompany.exercicio.vetores3;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioVetores3 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número de pessoas: ");
        int n = sc.nextInt();
        
        String[] nomes = new String[n];
        int[] idade = new int[n];
        double[] altura = new double[n];
        
        for (int i = 0; i <n; i++) {
            System.out.print("Digite aqui os dados da " + (i+1) + "º pessoa: ");
            System.out.print("Digite aqui o nome: ");
            nomes[i] = sc.next();
            System.out.print("Digite aqui a idade: ");
            idade[i] = sc.nextInt();
            System.out.print("Digite aqui a altura: ");
            altura[i] = sc.nextDouble();                
        }
        double sum = 0.0;
        for (int i = 0; i<n; i++) {
            sum = altura[i];
        }
        double mediaAltura = sum/n;
        System.out.println();
        System.out.printf("Altura média é: %.2f%n", mediaAltura);
        
        int count = 0;
        for (int i = 0; i<n; i++) {
            if (idade[i] < 16) {
                count += 1;
            }
        }
        double percent = count * 100.0 / n;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percent);
        for (int i = 0; i < n; i++) {
            if (idade[i] < 16) {
                System.out.println(nomes[i]);
            }
        }
        sc.close();
    }
}
