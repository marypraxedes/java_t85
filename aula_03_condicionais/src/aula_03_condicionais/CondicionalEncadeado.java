package aula_03_condicionais;

import java.util.Scanner;

public class CondicionalEncadeado {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float media = 0.0f;
		
		System.out.println("Digite a primeira nota: ");
		float nota1 = leia.nextFloat();
		
		System.out.println("Digite a segunda nota: ");
		float nota2 = leia.nextFloat();
	
		media = (nota1 + nota2)/2;
		
		if(media >= 6) {
			System.out.println("Aluno Aprovado!");
		}else if (media == 5) {
			System.out.println("Aluno de Exame!");
		}else {
			System.out.println("Aluno Reprovado!");
		}
		
		
		leia.close();

	}

}
