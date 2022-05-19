package controle;

public class SwitchSemBreak {

	public static void main(String[] args) {

		String faixa = "preta";

		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("sei o bassai-dai...");
		case "marrom":
			System.out.println("sei tekki shodan");
		case "roxa":
			System.out.println("sei heian godan");
		case "laranja":
			System.out.println("sei sandan");
			break;
		default:
			System.out.println("Não sei nada");
		}
		System.out.println("Fim");
	}

}
