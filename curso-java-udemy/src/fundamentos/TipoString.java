package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Olá pessoal".charAt(1));

		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.toUpperCase().endsWith("boa"));
		System.out.println(s.length());
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		var nome = "Luan";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.987;
		
		System.out.println("Nome: " + nome + "\nSobrenome: " 
				+ sobrenome + "\nIdade: " + idade + "\nSalário: " + salario + "\n\n");
		
		System.out.printf("O senhor %s %s tem %d anos e ganha %.2f reais", nome, sobrenome, idade, salario);
		
		String frase = String.format("\nO senhor %s %s tem %d anos e ganha %.2f reais", nome, sobrenome, idade, salario);
		
		System.out.println(frase);
		
		
		
		
		
		
		

	}

}
