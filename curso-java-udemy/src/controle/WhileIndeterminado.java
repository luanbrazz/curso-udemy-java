package controle;

import java.util.Scanner;

public class WhileIndeterminado {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String valor = "";
		
		System.out.println("Digite alguma coisa: ");
		while (!valor.equalsIgnoreCase("sair")) {
			valor = entrada.nextLine();
			
			if (!valor.equalsIgnoreCase("sair")) {
				System.out.printf("Você digitou: %s. Digite outra coisa"
						+ " ou digite 'sair' para sair do programa \n", valor);
			}
			else {
				System.out.println("Programa encerrado.");
			}
			
		}
		
		entrada.close();
	}
}
