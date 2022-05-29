package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
		Map<Integer, String> usuarios = new HashMap<>();
		
		usuarios.put(1, "Roberto");
		usuarios.put(2, "Ricardo");
		usuarios.put(3, "Rafaela");
		usuarios.put(4, "Rebeca");
		
		System.out.println("Tamanho da é lista: " + usuarios.size());
		System.out.println("Tem? " + usuarios.isEmpty());
		
		System.out.println(usuarios.keySet()); 	// conjunto da chave
		System.out.println(usuarios.values()); 	// conjunto de valores
		System.out.println(usuarios.entrySet());  // chave e valor
		
		System.out.println(usuarios.containsKey(2));  //contem chave?
		System.out.println(usuarios.containsValue("Lucas"));  //contem valor?		
		
		System.out.println(usuarios.get(1)); // obter valor a partir da chave
//		System.out.println(usuarios.remove(0));
		
		for (int chave : usuarios.keySet()) {
			System.out.println(chave);
		}
		
		for (String valor : usuarios.values()) {
			System.out.println(valor);
		}
		
		System.out.println();
		
		for (Entry<Integer, String> chaveValor : usuarios.entrySet()) {		// Entry -> java.util.Map
			System.out.println(chaveValor);
			System.out.println(chaveValor.getKey());
			System.out.println(chaveValor.getValue());
			System.out.println();
		}
	}

}
