package colecoes;

import java.util.ArrayList;

public class Lista {
	public static void main(String[] args) {
		
		ArrayList<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("Ana");
		
		lista.add(u1);
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Luis"));
		lista.add(new Usuario("Maria"));
		lista.add(new Usuario("Manu"));
		
		System.out.println(lista.get(3)); // acessar pelo índice, utilizando o toString
		
		System.out.println("foi removido >>>>> " + lista.remove(1));
		System.out.println(lista.remove(new Usuario("Manu")));
		
		System.out.println("Tem? " + lista.contains(new Usuario("Maria")));
		
		for (Usuario nomeUsuario : lista) {
			System.out.println(nomeUsuario);
			System.out.println(nomeUsuario.nome);
		}
		
	}
}
