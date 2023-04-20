package logica.aula06;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite a distância (em km) percorrida pelo automóvel:");
		double km = entrada.nextDouble();
		
		System.out.println("Digite a quantidade (em litros) de combustível gasto:");
		double lit = entrada.nextDouble();
		
		double conmed = km / lit;
		
		if (conmed < 8) {
		    System.out.println(conmed + " km/L" + "... Esse carro bebe, hein!");
		}
		else {
			System.out.println(conmed + " km/L" + "... Autonomia legal");
		}
		
	}

}
