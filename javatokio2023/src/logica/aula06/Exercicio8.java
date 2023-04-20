package logica.aula06;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o primeiro número:");
		double n1 = entrada.nextDouble();
		
		System.out.println("Digite o segundo número:");
		double n2 = entrada.nextDouble();
		
		if (n1 == n2) {
			System.out.println("Os números são iguais!");
		}
		else if (n1 > n2) {
			System.out.println("O maior número é: " + n1);
		}
			else {
				System.out.println("O maior número é: " + n2);
		}
	}

}
