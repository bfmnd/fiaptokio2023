package logica.aula06;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um número inteiro:");
		int n1 = entrada.nextInt();
		
		if (n1 % 2 == 0) {
			System.out.println("Este número é par!");
		}
			else {
				System.out.println("Este número é ímpar!");
		}
		
	}
	
}
