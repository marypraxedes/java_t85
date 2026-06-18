package aula_06_collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class CollectionPilha {

	public static void main(String[] args) {
		
		Deque<String> pilha = new ArrayDeque<String>();
		
		pilha.push("Azul");
		pilha.push("Verde");
		pilha.push("Amarelo");
		pilha.push("Branco");
		pilha.push("Laranja");
		
		pilha.pop();
		
		System.out.println("A cor Azul ainda está na pilha? " + pilha.contains("Azul"));

		
		for(var cor : pilha) {
			System.out.println(cor);
			
		}
	}

}
