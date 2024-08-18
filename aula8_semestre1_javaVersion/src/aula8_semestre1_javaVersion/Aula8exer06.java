package aula8_semestre1_javaVersion;

import java.util.Locale;
import java.util.Scanner;

public class Aula8exer06 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Exibindo todos os números pares entre 1 a N");
		
		System.out.print("Digite aqui o número de repetições: ");
		int n = sc.nextInt();
		
		for (int i = 2; i <= n; i += 2) {
			System.out.println(i);
		}
		
		sc.close();

	}

}
