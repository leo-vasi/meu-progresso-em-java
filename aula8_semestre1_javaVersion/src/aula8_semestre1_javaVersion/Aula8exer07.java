package aula8_semestre1_javaVersion;

import java.util.Locale;
import java.util.Scanner;

public class Aula8exer07 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Algoritmo que mostra o somatório dos números de 1 a N");
        
        System.out.print("Digite aqui um valor para N: ");
        int n = sc.nextInt();
        
        int soma = 0;
        
        for (int i = 1; i <= n; i++) {
            soma += i;
        }
        
        System.out.println("O somatório de 1 até " + n + " é: " + soma);
        sc.close();
    }
}
