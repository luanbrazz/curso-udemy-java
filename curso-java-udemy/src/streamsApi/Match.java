package streamsApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Biel", 6.1);
		Aluno a3 = new Aluno("Lana", 8.1);
		Aluno a4 = new Aluno("Joao", 10.0);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		Predicate<Aluno> aprovado = a -> a.nota >=7;
		Predicate<Aluno> reprovado = aprovado.negate();
		
		System.out.println(alunos.stream().allMatch(aprovado)); // todos foram aprovados? -False
		System.out.println(alunos.stream().anyMatch(aprovado)); //Pelo menos um foi aprovado? -true
		System.out.println(alunos.stream().noneMatch(aprovado)); // nenhum aprovado? -false
		System.out.println(alunos.stream().noneMatch(reprovado)); // nenhum reprovado? - false
		
	}

}
