package logica.aula06;

import java.util.Scanner;

class Exercicio5 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite a primeira nota:");
		double n1 = entrada.nextDouble();

		System.out.println("Digite a segunda nota:");
		double n2 = entrada.nextDouble();

		double media = (n1 * 0.4) + (n2 * 0.6) / 2;
		System.out.println("A média das notas é: " + media);
		
	}

}
