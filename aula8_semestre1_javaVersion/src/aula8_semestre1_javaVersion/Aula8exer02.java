package aula8_semestre1_javaVersion;

import java.util.Locale;

public class Aula8exer02 {
	public static void main (String[] args) {
		Locale.setDefault(Locale.US);
		System.out.println("Exibindo números de 5 a 200");
		int cont = 5;
		
		while (cont <= 200) {
			System.out.println(cont);
			cont += 1;
		}
	}
}
