package fundamentos.operadores;

public class Relacionais {
	public static void main(String[] args) {

		int a = 97;
		int b = 'a';
		System.out.println(a == b);
		
		System.out.println(3 > 4);
		System.out.println(3 >= 4);
		System.out.println(3 < 4);
		System.out.println(30 <= 4);
		System.out.println(30 != 4);
		
		double nota = 9.9;
		boolean bomComportamento = false;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		System.out.println("Tem desconto? " + temDesconto);
	}
}