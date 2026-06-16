package aula_04_repeticoes;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero1, numero2;
		int contador;
		
		
		System.out.println("Digite o primeiro número do intervalo: ");
		numero1 = leia.nextInt();
		
		System.out.println("Digite o último número do intervalo: ");
		numero2 = leia.nextInt();
		
		if(numero1 > numero2) {
			System.out.println("Intervalo inválido!");
			
		} else {
		
		System.out.printf("No intervalo entre %d e %d:\n", numero1, numero2);
		for(contador = numero1; contador <= numero2; contador++) {
			if (contador % 3 == 0 && contador % 5 == 0) {
				System.out.printf("%d é múltiplo de 3 e 5\n", contador);
				
			}
	
		}
		
		}
		leia.close();

	}

}
