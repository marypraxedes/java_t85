package aula_03_condicionais;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);
		
		String nome;
		
		int idade;
		
		boolean primeiraDoacao;
		
		System.out.println("Digite o nome do doador: ");
		nome = leia.next();
		
		System.out.println("Digite a idade do doador: ");
		idade = leia.nextInt();
		
		System.out.println("Primeira doação de sangue? true/false ");
		primeiraDoacao = leia.nextBoolean();
		
		if(idade >= 18 && idade <= 59) {
			System.out.printf("%s está apto a doar sangue!", nome);
				
		}else if(idade >= 60 && idade <= 69 && primeiraDoacao == false) {
			System.out.printf("%s está apto a doar sangue!", nome);
			
		}else if(idade >= 60 && idade <= 69 && primeiraDoacao == true) {
			System.out.printf("%s não está apto a doar sangue!", nome);
		
		}else {
			System.out.printf("%s não está apto a doar sangue!", nome);
		}
		
		
		
		leia.close();

	}

}
