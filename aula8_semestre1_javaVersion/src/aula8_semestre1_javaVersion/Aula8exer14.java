package aula8_semestre1_javaVersion;

import java.util.Locale;
import java.util.Scanner;

public class Aula8exer14 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("lgoritmo que deixa escolher qual a tabuada de multiplicar que se deseja\r\n"
				+ "imprimir");
		System.out.print("Digite aqui qual número: ");			
		int n = sc.nextInt();
		for (int i = 0; i <= n; i++) {
			int r = n * i;
			System.out.printf("%d * %d = %d%n", n, i, r);
		}
		sc.close();
	}

}
