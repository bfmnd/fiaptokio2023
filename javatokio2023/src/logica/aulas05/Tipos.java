package logica.aulas05;

import java.util.Scanner;

p	'ublic class Tipos {

	public static void main(String[] args) {

		float preco = 10.99f;
		float preco2 = (float) 12.90;

		System.out.println("Float 1: " + preco);
		System.out.println("Float 2: " + preco2);

		int numeroX = 6;
		double numeroXDouble = numeroX;
		System.out.println("  ");
		System.out.println(numeroX);
		System.out.println(numeroXDOuble);

		Scanner entrada = new Scanner(System.in);
		System.out.println(" ");
		System.out.println("Digite um número: ");
		int numeroIn = (int) entrada.nextDouble();
		System.out.println("O valor digitado é: " + numeroIn);
	}

}