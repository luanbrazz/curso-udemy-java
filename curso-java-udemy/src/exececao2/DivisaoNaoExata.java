package exececao2;

@SuppressWarnings("serial")
public class DivisaoNaoExata extends Exception {
	
	private int num;
	private int denom;
	
	public DivisaoNaoExata(int num, int denom) {
		super();
		this.num = num;
		this.denom = denom;
	}

	@Override
	public String toString() {
		return "Resultado de " + num + "/" + denom + " não é um inteiro!";
	}
	
	
}
