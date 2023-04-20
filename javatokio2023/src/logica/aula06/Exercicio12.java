package logica.aula06;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		   System.out.println("Digite seu nome completo:");
		   String nome = entrada.nextLine();
		   
		   System.out.println("Digite seu ano de nascimento:");
		   int datanasc = entrada.nextInt();
		   
		   if (datanasc <= 2005) {
			   System.out.println("Seu voto é obrigatório");
		   }
		   else if (datanasc < 2007 && datanasc > 2005) {
			   System.out.println("Seu voto é opcional");
		   }
		   else {
			   System.out.println("Seu voto é proibido");
		   }
	 }

}
