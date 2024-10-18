package com.mycompany.exercicio.vetores10;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioVetores10 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos alunos você vai digitar?");
        int n = sc.nextInt();

        String[] vectNome = new String[n];
        double[] nota1 = new double[n];
        double[] nota2 = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Digite o nome e primeira e segunda nota do %dº aluno: ", i + 1);
            sc.nextLine();
            vectNome[i] = sc.nextLine();
            nota1[i] = sc.nextDouble();
            nota2[i] = sc.nextDouble();
        }
        double media = 0;
        System.out.println("Alunos aprovados:");
        for(int i = 0; i < n; i ++) {
            media = (nota1[i] + nota2[i] / 2);
            if (media >= 6.0) {
                System.out.printf("%s\n", vectNome[i]);
            }
        }
        sc.close();
    }
}
