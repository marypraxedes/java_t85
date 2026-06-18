package aula_06_collections;

import java.util.HashSet;
import java.util.Set;

public class CollectionSet {

	

	public static void main(String[] args) {
		
		Set<String> frutas = new HashSet<String>();
		
		frutas.add("Abacate");
		frutas.add("abacate");
		frutas.add("Morango");
		frutas.add("Maçã");
		frutas.add("Abacate");
		frutas.add("Laranja");
		
		
		for(String fruta : frutas) {
			System.out.println(fruta);
		}
		
		
		System.out.println("A fruta Laranja está presente? " + frutas.contains("Laranja"));
		
		frutas.remove("Laranja");
		
		for(String fruta : frutas) {
			System.out.println(fruta);
		}

	}

}
