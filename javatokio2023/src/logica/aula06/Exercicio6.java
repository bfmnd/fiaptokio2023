package logica.aula06;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		   System.out.print("Digite o nome da peça 1: ");
		   String nomePeca1 = entrada.nextLine();
		   
		   System.out.print("Digite o numero da peça 1: ");
		   int numPeca1 = Integer.parseInt(entrada.nextLine());
		   
		   System.out.println("Nome da peca 1: " + nomePeca1);
		   System.out.println("Numero da peca 1: " + numPeca1);
		   
		  // PEÇA2
		   
		   System.out.print("Digite o nome da peça 2: ");
		   String nomePeca2 = entrada.nextLine();
		   
		   System.out.print("Digite o numero da peça 2: ");
		   int numPeca2 = Integer.parseInt(entrada.nextLine());
		   
		   System.out.println("Nome da peca 1: " + nomePeca2);
		   System.out.println("Numero da peca 1: " + numPeca2);
		   
		    }
}


