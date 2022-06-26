package oo.composicao.desafio;

public class Sistema {
	public static void main(String[] args) {
		
		Compra compra1 = new Compra();
		compra1.adicionarItem("Caneta", 9.67, 100);
		compra1.adicionarItem(new Produto("Notebook", 2569.25), 2);
		
		Compra compra2 = new Compra();
		compra2.adicionarItem("Caderno", 10.5, 10);
		compra2.adicionarItem(new Produto("Impressora", 998.25), 1);
		
		Cliente cliente = new Cliente("Joao da Silva Santos");
		cliente.adicionarCompra(compra1);
		cliente.compras.add(compra1);
		
		System.out.println(cliente.obterValorTotal());
		
	}
}
