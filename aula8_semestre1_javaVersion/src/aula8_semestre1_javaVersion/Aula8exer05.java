package aula8_semestre1_javaVersion;

import java.util.Locale;
import java.util.Scanner;

public class Aula8exer05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Recebendo 20 números e imprimindo a metade de cada um deles");
		
		for (int j = 1; j < 21; j++) {
			System.out.print("Digite aqui um valor: ");
			double num = sc.nextDouble();
			double metade = num / 2;
			System.out.printf("A metade do valor %.2f%n é: %.2f%n", num, metade);
		}

		sc.close();
	}

}
