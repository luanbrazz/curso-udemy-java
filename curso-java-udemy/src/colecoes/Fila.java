package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		// Offer e Add -> adicionam elementos na fila
		// Diferença é o comportamento ocorre quando a fila está cheia!
		fila.add("Ana"); // retorna false
		fila.offer("Bia");  // lança uma exceção
		fila.add("Telma");
		fila.offer("Jader");
		fila.add("Rafa");
		fila.offer("Maria");
		
		// Peek e Element -> obter o próximo elemento
		// da fila (sem remover)
		
		// Diferença é o comportamento ocorre
		// quando a fila está vazia!
		System.out.println(fila.peek());  // retorna null
		System.out.println(fila.peek());
		System.out.println(fila.element());  // lança uma exceção
		

		
		// Poll e Remove -> obter o próximo elemento
		// da fila e remove
		
		// Diferença é o comportamento ocorre
		// quando a fila está vazia!
		System.out.println("Mostrando o primeiro da fila e removendo (poll();)...");
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		
		System.out.println(fila);
		
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll()); // retornou null
		
//		fila.remove(); -> remove a fila
//		fila.size();
//		fila.clear();
//		fila.isEmpty();
//		fila.contains(...)
	}

}
