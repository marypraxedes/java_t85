package aula_06_collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		ArrayList<String> cores = new ArrayList<String>();
		
		for(int contador = 1; contador <= 5; contador++) {
			System.out.println("Digite uma cor: ");
			cores.add(leia.nextLine());
			
			
		}
		
		System.out.println("\nListar todas as cores: ");

		
		for (String cor : cores) {
			System.out.println(cor);
		}
		
		cores.sort(null);
		
		System.out.println("\nOrdenar as cores:");
		
		for (String cor : cores) {
			System.out.println(cor);
		}
		
		leia.close();

	}

	}


