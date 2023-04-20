package logica.aula06;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um número inteiro:");
		int n1 = entrada.nextInt();
		
		System.out.println("Digite outro número inteiro:");
		int n2 = entrada.nextInt();
		
		if (n1 % n2 == 0  || n2 % n1 == 0) {
			System.out.println("Os números são múltiplos!");
		}
			else {
				System.out.println("Os números não são múltiplos!");
		}
		
	}

}
