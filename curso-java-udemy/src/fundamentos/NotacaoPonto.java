package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {

//		double a = 2.3;

		String s = "Bom dia X";

		s = s.replace("X", "senhora");
		s = s.toUpperCase();
		s = s.concat("!!!");

		System.out.println(s);

		System.out.println("Luan".toUpperCase());

		String y = "Bom dia X"
				.replace("X", ", Luan")
				.toUpperCase()
				.concat("!!!");
		
		System.out.println(y);
		
//		tipos primitivos não tem o operador "."
		int a = 3;
		System.out.println(a);
		
		
	}

}