package aula8_semestre1_javaVersion;

import java.util.Locale;
import java.util.Scanner;

public class Aula8exer10 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("algoritmo que recebe N números e conta quantos destes números são pares");
		
		System.out.print("Digite a quantiade de vezes que irá verificar: ");
		int n = sc.nextInt();
		
		int s = 0;
		
		for (int i = 1; i <= n; i ++) {
			System.out.printf("Digite aqui o %dº número: ", i);
			double num = sc.nextDouble();
			
			if (num % 2 == 0) {
				s += 1;
			}
		}
		System.out.printf("Entre os números %d, %d são pares", n, s);
		
		sc.close();

	}

}
