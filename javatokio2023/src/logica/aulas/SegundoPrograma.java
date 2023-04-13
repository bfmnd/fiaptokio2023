package logica.aulas;

import java.util.Scanner;

public class SegundoPrograma {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println ("Digite seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.println("Bem-vindo, " + nome);
		System.out.println("Digite sua idade: ");
		
		int idade = entrada.nextInt();
		System.out.println("Sua idade é: " + entrada.nextInt() + "anos");
	
		
	}
}
