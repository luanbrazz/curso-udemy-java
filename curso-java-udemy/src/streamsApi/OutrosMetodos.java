package streamsApi;

import java.util.Arrays;
import java.util.List;

public class OutrosMetodos {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Biel", 6.1);
		Aluno a3 = new Aluno("Lana", 8.1);
		Aluno a4 = new Aluno("Joao", 10.0);
		Aluno a5 = new Aluno("Joao", 4.1);
		Aluno a6 = new Aluno("Jhon", 9.1);
		Aluno a7 = new Aluno("Marta", 8.8);
		Aluno a8 = new Aluno("Rubia", 9.5);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);
		
		System.out.println("distint...");
		alunos.stream().distinct().forEach(System.out::println);
		
		System.out.println("\nSkip\nLimit");
		alunos.stream()
			.distinct()
			.skip(2) //pular 2 elementos
			.limit(2) // pegar 2 elementos
			.forEach(System.out::println);
		
		System.out.println("\ntakeWhile"); // pegue um elemento qdo acontecer determinada condição
		alunos.stream()
			.distinct()
			.skip(2)
			.takeWhile(a -> a.nota >= 7)
			.forEach(System.out::println);
	}

}
