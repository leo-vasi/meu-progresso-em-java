package aula8_semestre1_javaVersion;

import java.util.Locale;
import java.util.Scanner;

public class Aula8exer08 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Recebendo notas de alunos e calculando média");
		
		System.out.print("Digite aqui o número de alunos: ");
		int n = sc.nextInt();
		
		double soma = 0;
		
		for (int i = 1; i <= n; i++) {
			System.out.print("Digite aqui a sua nota: ");
			double nota = sc.nextDouble();
			soma += nota;
		}
		double media = soma / n;
		System.out.printf("A média é: %.2f", media);
		sc.close();
	}

}
