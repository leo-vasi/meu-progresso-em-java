package aula8_semestre1_javaVersion;

import java.util.Locale;
import java.util.Scanner;

public class Aula8exer13 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Lendo a idade de 100 pessoas e exibindo suas respectivas classes eleitorais");
		int n = 0;
		int o = 0;
		int f = 0;
		
		for (int i = 1; i <= 100; i++) {
			System.out.println("Digite aqui a sua idade: ");
			int idade = sc.nextInt();
			if (idade < 16) {
				n += 1;
			}
			else if (idade >= 18 && idade <= 65) {
				o += 1;
			}
			else {
				f += 1;
			}
		System.out.println("Não eleitores: " + n);
		System.out.println("Eleitor obrigatório: " + o);
		System.out.println("Eleitor facultativo: " + f);

		}
		sc.close();
	}

}
