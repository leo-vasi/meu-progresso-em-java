package aula8_semestre1_javaVersion;

import java.util.Locale;
import java.util.Scanner;

public class Aula8exer01 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Exibindo números de 1 a 1000");
		
		int cont = 1;
		while (cont <= 1000) {
		System.out.println(cont);
		cont += 1;
		}
		sc.close();
		
	}
}