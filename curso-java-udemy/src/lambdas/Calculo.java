package lambdas;

@FunctionalInterface
public interface Calculo {
	
	// public abstract double executar(double a, double b);
	
	double executar(double a, double b);
	
	default String teste() {
		return "Teste";
	}
	
	static String outroTeste() {
		return "Outro teste"; 
	}
}
