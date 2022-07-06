package streamsApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 9.8, false);
		Aluno a2= new Aluno("Pedro", 6.8, true);
		Aluno a3 = new Aluno("Julia", 7.8, true);
		Aluno a4 = new Aluno("Rebeca", 8.8, true);
		Aluno a5 = new Aluno("Lucia", 9.8, true);
		Aluno a6 = new Aluno("Roberto", 4.8, false);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);
		
		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		Predicate<Aluno> bomComportamento = a -> a.bomComportamento;
		Function<Aluno, String> saudacaoAprovado = a -> "Parabens " + a.nome + ", você foi aprovado(a)!";
		
		alunos.stream().filter(aprovado).filter(bomComportamento).map(saudacaoAprovado).forEach(System.out::println);
	}

}
