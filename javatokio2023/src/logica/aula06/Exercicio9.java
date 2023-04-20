package logica.aula06;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite a primeira nota:");
		double n1 = entrada.nextDouble();

		System.out.println("Digite a segunda nota:");
		double n2 = entrada.nextDouble();

		System.out.println("Digite a terceira nota:");
		double n3 = entrada.nextDouble();

		System.out.println("Digite a quarta nota:");
		double n4 = entrada.nextDouble();

		double media = (n1 + n2 + n3 + n4) / 4;
		System.out.println("A média do aluno foi:" + media);

		if (media >= 5 && media < 7) {
			System.out.println("A situação do aluno é: Em recuperação");
		} else if (media >= 7) {
			System.out.println("A situação do aluno é: Aprovado");
		} else {
			System.out.println("A situação do aluno é: Reprovado");
		}
	}

}
