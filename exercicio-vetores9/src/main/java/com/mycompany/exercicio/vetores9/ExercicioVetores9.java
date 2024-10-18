package com.mycompany.exercicio.vetores9;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioVetores9 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas você vai digitar?");
        int n = sc.nextInt();

        String[] vectNome = new String[n];
        int[] vectIdade = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Dados da %dº pessoa: ", i + 1);
            System.out.print("Nome: ");
            vectNome[i] = sc.next();
            System.out.print("Idade: ");
            vectIdade[i] = sc.nextInt();
        }
        int pessoaVelha = vectIdade[0];
        int posicao = 0;
        for (int i = 0; i < n; i++) {
            if (vectIdade[i] > pessoaVelha) {
                pessoaVelha = vectIdade[i];
                posicao = i;
            }
        }
        System.out.printf("PESSOA MAIS VELHA: %s", vectNome[posicao]);
        sc.close();
    }
}
