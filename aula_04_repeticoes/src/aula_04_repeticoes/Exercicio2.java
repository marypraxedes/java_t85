package aula_04_repeticoes;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero;
		int pares = 0;
		int impares = 0;
		
		
		for(int contador = 1; contador <= 10; contador ++) {
			System.out.printf("Digite o %dº número: ", contador);	
			numero = leia.nextInt();
			
			if(numero % 2 == 0) {
				pares++;
			} else {
				impares++;
			}
			
		}
		
		System.out.printf("Total de números pares: " + pares);
		System.out.printf("\nTotal de números ímpares: " + impares);
		
		leia.close();
		}
		
		}


