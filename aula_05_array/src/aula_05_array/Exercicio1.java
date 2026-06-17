package aula_05_array;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int vetorInteiros[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		int numero;
		boolean numero2 = false;
		
		
		
		System.out.println("Digite o número que você deseja encontrar: ");
		numero = leia.nextInt();
		
		for (int contador = 0; contador < vetorInteiros.length; contador ++) {
			if (numero == vetorInteiros[contador]) {
				System.out.printf("O número %d está localizado na posição: %d\n", numero, contador);
				numero2 = true;
			}
		}
		 if (!numero2) {
				System.out.printf("O número %d não foi encontrado!", numero);		
		}
		
		leia.close();

	}

}
