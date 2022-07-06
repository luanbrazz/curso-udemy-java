package streamsApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Lápis", 1.99, 0.12, 0);
		Produto p2 = new Produto("Notebook", 1.99, 0.07, 15);
		Produto p3 = new Produto("Caderno", 7.99, 0.35, 30);
		Produto p4 = new Produto("Impressora", 1200.99, 0.40, 0);
		Produto p5 = new Produto("relogio", 100.99, 0.15, 30);
		Produto p6 = new Produto("iPad", 2569.99, 0.25, 0);
		Produto p7 = new Produto("Monitor", 899.99, 0.31, 0);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6, p7);
		
		// Filter, filter, map
		Predicate<Produto> superPromocao = p -> p.desconto >= 0.30;
		Predicate<Produto> freteGratis = p -> p.valorFrete == 0;
		Predicate<Produto> precoRelevante = p -> p.preco >= 500;
		
		Function<Produto, String> chamadaPromocional = p -> "Aproveite! " + p.nome + " por R$" + p.preco;
		
		produtos.stream()
		.filter(superPromocao)
		.filter(freteGratis)
		.filter(precoRelevante)
		.map(chamadaPromocional)
		.forEach(System.out::println);
		
	}

}
