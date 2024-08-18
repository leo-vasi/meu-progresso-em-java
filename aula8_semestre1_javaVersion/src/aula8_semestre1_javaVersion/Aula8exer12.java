package aula8_semestre1_javaVersion;

import java.util.Locale;
import java.util.Scanner;

public class Aula8exer12 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("algoritmo que recebe duas notas de 60 alunos e calcula a média aritmética\r\n"
				+ "para cada aluno");
		int aprovado = 0;
		int reprovado = 0;
		int exame = 0;
		
		for (int i = 1; i <= 60; i++) {
			System.out.print("Digite aqui a sua 1ª nota: ");
			double n1 = sc.nextDouble();
			
			System.out.print("Digite aqui a sua 2ª nota: ");
			double n2 = sc.nextDouble();
			
			double media = (n1 + n2) / 2;
			if (media >= 5) {
				aprovado += 1;
			}
			else if (media >= 3) {
				reprovado += 1;
			}
			else {
				exame += 1;
			}
			
			System.out.print("Aprovados: " + aprovado);
			System.out.print("Reprovados: " + reprovado);
			System.out.print("Exame: " + exame);
		}
		sc.close();

	}

}
