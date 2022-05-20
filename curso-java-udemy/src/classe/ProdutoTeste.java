package classe;

import java.util.Locale;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
//		Scanner entrada = new Scanner(System.in);
		Produto p1 = new Produto();
		p1.nome = "Notebook";
		p1.preco = 4356.89;
		Produto.desconto = 0.25;
		
		var p2 = new Produto("Caneta Preta", 12.56);
//		p2.nome = "Caneta Preta";
//		p2.preco = 12.56;
//		p2.desconto = 0.29;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto();
		double mediaDoCarrinho = (precoFinal1 + precoFinal2) / 2;
		
		System.out.println(precoFinal1);
		System.out.println(precoFinal2);
		
		System.out.printf("Média do carrinho = R$%.2f.", mediaDoCarrinho);
	}

}
