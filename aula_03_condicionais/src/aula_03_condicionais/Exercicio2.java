package aula_03_condicionais;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um número: ");
		numero = leia.nextInt();
		
		if(numero % 2 == 0 && numero > 0) {
			System.out.printf("O número %d é par e positivo!", numero);
		}else if (numero% 2 == 0 && numero < 0) {
			System.out.printf("O número %d é par e negativo!", numero);
			
		}else if (numero % 2 != 0 && numero > 0) {
			System.out.printf("O número %d é ímpar e positivo!", numero);
			
		}else {
			System.out.printf("O número %d é ímpar e negativo!", numero);
			
		}
		
		leia.close();

	}

	}
