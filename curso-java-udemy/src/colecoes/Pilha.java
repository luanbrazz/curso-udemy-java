package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

// Ultimo a entrar é o primeiro a sair 
public class Pilha {
	public static void main(String[] args) {
		Deque<String> livros = new ArrayDeque<>();
		
		livros.add("O Pequeno Príncipe");
		livros.push("Don Quixote");
		livros.push("O Hobbit");
		
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		for (String livro : livros) {
			System.out.println(livro);
		}
		
		System.out.println(livros.pop());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
//		System.out.println(livros.pop());
//		System.out.println(livros.remove());   >>> java.util.NoSuchElementException
		
//		livros.size() -> Tamanho
//		livros.clear();
//		livros.contains();
//		livros.isEmpty(); -> tem ou não?
	}
}
