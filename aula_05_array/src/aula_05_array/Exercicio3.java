package aula_05_array;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		
		int matriz[][] = new int[3][3];
			
		int somaPrincipal = 0;
		int somaSecundaria = 0;

		// Entrada dos valores da matriz
		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {

				System.out.printf("Digite um número para [%d][%d]: ", linha, coluna);
				matriz[linha][coluna] = leia.nextInt();

			}
		}

		System.out.println("\nElementos da Diagonal Principal:");

		for (int contador = 0; contador < 3; contador++) {

			System.out.print(matriz[contador][contador] + " ");
			somaPrincipal += matriz[contador][contador];

		}


		System.out.println("\nElementos da Diagonal Secundária:");

		for (int contador = 0; contador < 3; contador++) {

			System.out.print(matriz[contador][2 - contador] + " ");
			somaSecundaria += matriz[contador][2 - contador];

		}


		System.out.println("\n\nSoma dos Elementos da Diagonal Principal:");
		System.out.println(somaPrincipal);


		System.out.println("\nSoma dos Elementos da Diagonal Secundária:");
		System.out.println(somaSecundaria);


		leia.close();

	}

}