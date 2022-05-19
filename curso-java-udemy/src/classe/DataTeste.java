package classe;

public class DataTeste {
	
	public static void main(String[] args) {
		
		Data d1 = new Data();
		d1.dia = 18;
		d1.mes = 5;
		d1.ano = 2022;
		
		System.out.println(d1.dataFormatada());
				
		var d2 = new Data();
		d2.dia = 21;
		d2.mes = 12;
		d2.ano = 1994;
		
		System.out.println(d2.dataFormatada());
		
		d1.imprimirDataFormatada();
	}
}
