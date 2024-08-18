package aula8_semestre1_javaVersion;

import java.util.Locale;
import java.util.Scanner;

public class Aula8exer04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Exibindo o quadrado dos valores");
		
		System.out.print("Digite aqui o número de repetições: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i ++) {
			System.out.print("Digite o " + i + "º número: ");
			double num = sc.nextDouble();
			
			double q = Math.pow(num, 2);
			System.out.println("O quadrado de " + num + " é " + q);
		}
		
		sc.close();

	}

}
