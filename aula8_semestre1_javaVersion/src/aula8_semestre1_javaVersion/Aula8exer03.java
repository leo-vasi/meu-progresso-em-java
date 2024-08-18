package aula8_semestre1_javaVersion;

import java.util.Locale;

public class Aula8exer03 {
	public static void main (String[] args) {
		Locale.setDefault(Locale.US);
		System.out.println("Exibindo números de 500 a 1");
		int cont = 500;
		
		while (cont >= 1) {
			System.out.println(cont);
			cont -= 1;
		}
	}
}
