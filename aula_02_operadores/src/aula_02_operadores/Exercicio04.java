package aula_02_operadores;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float n1, n2, n3, n4, calculo;
		
		System.out.println("--- Diferença entre os números ---");
		
		System.out.printf("\nDigite o número 1: ");
		n1 = leia.nextFloat();
		
		System.out.printf("\nDigite o número 2: ");
		n2 = leia.nextFloat();
		
		System.out.printf("\nDigite o número 3: ");
		n3 = leia.nextFloat();
		
		System.out.printf("\nDigite o número 4: ");
		n4 = leia.nextFloat();
		
		calculo = (n1* n2) - (n3 * n4);
		
		System.out.printf("\nDiferença: %.2f ", calculo);
		
		
		leia.close();

	}

}
