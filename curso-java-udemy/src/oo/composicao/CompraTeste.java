package oo.composicao;

public class CompraTeste {

	public static void main(String[] args) {
		Compra compra1 = new Compra();
		compra1.cliente = "Luan";
		compra1.adicionarItem(new Item("caneta", 20, 1.50));
		compra1.adicionarItem(new Item("lapis", 15, 1.75));
		compra1.adicionarItem(new Item("caderno", 13, 3.50));
		
		System.out.println(compra1.itens.size());
		System.out.println(compra1.obterValorTotal());
		
		// relação bidirecional
		double total = compra1.itens.get(0).compra.itens.get(1).compra.obterValorTotal();	
		System.out.println(total);
	}

}
