package aula_06_collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Set<Integer> numeros = new HashSet<Integer>();
		
		for(int contador = 1; contador <=10; contador++) {
		System.out.println("Digite um número: ");
		numeros.add(leia.nextInt());
		}
		
		for(Integer numero : numeros) {
			System.out.println(numero);
			
			
		}
		
		leia.close();
		

	}

}
