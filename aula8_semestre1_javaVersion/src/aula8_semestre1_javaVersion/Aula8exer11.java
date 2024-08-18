package aula8_semestre1_javaVersion;

import java.util.Locale;
import java.util.Scanner;

public class Aula8exer11 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("algoritmo que imprime na tela os números de 1 a 100 exceto os números"
				+ " múltiplos de 3");
		for (int i = 1; i < 101; i++) {
			if (i % 3 != 0) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}

}
