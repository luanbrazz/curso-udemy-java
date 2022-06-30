package lambdas;

public class CalculoTeste2 {
	public static void main(String[] args) {
		
		Calculo calc = (x, y) -> { return x + y; }; // FUNÇÃO LAMBDA - S/ NOME
		System.out.println(calc.executar(2, 3));
		
		calc = (x, y) -> { return x * y; };
		System.out.println(calc.executar(2, 3));
		
		System.out.println(calc.teste());
		System.out.println(Calculo.outroTeste());
	}
}
