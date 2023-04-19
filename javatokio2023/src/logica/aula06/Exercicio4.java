package logica.aula06;

import java.util.Scanner;

public class Exercicio4 {
	
	public static void main(String[] args) {

	Scanner entrada = new Scanner(System.in);

	System.out.println("Digite um valor:");
	int valor1 = entrada.nextInt();

	System.out.println("Digite outro valor:");
	int valor2 = entrada.nextInt();

	float media = (valor1 + valor2)/2;
	System.out.println("Sua media é: " + media);
}

}