package aula8_semestre1_javaVersion;

import java.util.Locale;
import java.util.Scanner;

public class Aula8exer09 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Recebendo duas notas de 10 alunos e calculando a média");
		
		int s = 0;
		
		for (int i = 1; i <= 10; i++) {
			System.out.print("Digite aqui a M1: ");
			double m1 = sc.nextDouble();
			
			System.out.print("Digite aqui a M2: ");
			double m2 = sc.nextDouble();
			
			double media = (m1 + m2) / 2;
			System.out.println(media);
			
			s += media;
		}
		double mt = s / 10;
		System.out.printf("A média total é: %.2f", mt);
		
		
		sc.close();
	}

}
