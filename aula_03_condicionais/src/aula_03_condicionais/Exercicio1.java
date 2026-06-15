package aula_03_condicionais;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		
		int numero1, numero2, numero3, soma;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		numero1 = leia.nextInt();
		
		System.out.println("Digite o segundo número: ");
		numero2 = leia.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		numero3 = leia.nextInt();
		
		
		soma = numero1 + numero2;
		
		if(soma > numero3) {
			System.out.println(" A soma do primeiro número com o segundo número é maior que o terceiro número!");
			
		}else if (soma < numero3) {
			System.out.println(" A soma do primeiro número com o segundo número é menor que o terceiro número!");
			
		}else {
			System.out.println(" A soma do primeiro número com o segundo número é igual ao terceiro número!");
		}
		
		
		leia.close();

	}

}
