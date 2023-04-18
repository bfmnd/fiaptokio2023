package logica.aulas05;

public class Manipulação {

	public static void main(String[] args) {

		double salario = 1300.50;
		
		String salarioStr = Double.toString(salario);

		System.out.println(salarioStr);

		System.out.println("");

		String idade = "25";

		int idadeInt = Integer.parseInt(idade);

		System.out.println(idadeInt.getClass());
		
		System.out.println(" ");
		
		String idade = "25";
		
		int idadeInt = Integer.parseInt(idade);
		
		System.out.println(idadeInt);
		
		System.out.println(" ");
		
		Scanner entrada = new Scanner(System.in);
		
		String salario = entrada.nextLine();
		

	}

}
