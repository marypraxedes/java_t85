package aula_02_operadores;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float nota1, nota2, nota3, nota4, mediaFinal;
		
		System.out.println("--- Média Escolar ---");
		
		System.out.printf("\nDigite a primeira nota: ");
		nota1 = leia.nextFloat();
		
		System.out.printf("\nDigite a segunda nota: ");
		nota2 = leia.nextFloat();
		
		System.out.printf("\nDigite a terceira nota: ");
		nota3 = leia.nextFloat();
		
		System.out.printf("\nDigite a quarta nota: ");
		nota4 = leia.nextFloat();
		
		mediaFinal = (nota1 + nota2 + nota3 + nota4)/4;
		
		System.out.printf("\nMédia Final: %.2f ", mediaFinal);
		
		leia.close();

	}

}
