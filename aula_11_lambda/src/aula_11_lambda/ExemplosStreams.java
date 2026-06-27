package aula_11_lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExemplosStreams {

	public static void main(String[] args) {
		 
		List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		 
		List<Integer> numerosDesordenados = Arrays.asList(6,7,8,1,4,5,9,10,2,3);
		 
		List<String> estados = Arrays.asList("São Paulo", "Rio de Janeiro", "Minas Gerais","Espirito Santo", 

		"São Paulo", "Rio de Janeiro", "Minas Gerais", "São Paulo", "Rio de Janeiro");
		 
		List<Integer> numerosPares = numeros.stream()
				.filter(numero -> numero % 2 == 0)
				.collect(Collectors.toList());
		
		numerosPares.forEach(numero -> System.out.println(numero));
		
		estados.stream()
			.filter(estado -> estado.toUpperCase().startsWith("R"))
			.distinct()
			.forEach(System.out::println);
		
		List<Integer> numerosAoCubo = numeros.stream()
				.map(numero -> (int) Math.pow(numero, 3))
				.collect(Collectors.toList());
		
		System.out.println("Números ao Cubo: " + numerosAoCubo);
		
		numerosDesordenados.stream()
			.sorted()
			.forEach(System.out::println);
		
		long estadosIniciandoEmS = estados.stream()
				.filter(estado -> estado.toUpperCase().startsWith("S"))
				.distinct()
				.count();
		
		System.out.println("Total de estados iniciando com a letra S: " + estadosIniciandoEmS);
		
	}

}
