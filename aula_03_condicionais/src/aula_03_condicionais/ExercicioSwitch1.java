package aula_03_condicionais;

import java.util.Scanner;

public class ExercicioSwitch1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int codigo, valorTotal;
		
		int preco = 0, quantidade = 0;

		
		valorTotal = quantidade * preco;
				

		System.out.println("***************************************");
		System.out.println("             LANCHONETE                ");
		System.out.println("***************************************");
		System.out.println("                                       ");
		System.out.println("     1 - Cachorro quente - R$10,00     ");
		System.out.println("     2 - X-Salada        - R$15,00     ");
		System.out.println("     3 - X-Bacon         - R$18,00     ");
		System.out.println("     4 - Bauru           - R$12,00     ");
		System.out.println("     5 - Refrigerante    - R$8,00      ");
		System.out.println("     6 - Suco de laranja - R$13,00     ");
		System.out.println("                                       ");
		System.out.println("***************************************");	
		
		System.out.println("Escolha seu item: ");
		codigo = leia.nextInt();
		
		System.out.println("Qual a quantidade desejada: ");
		quantidade = leia.nextInt();
		
		switch(codigo) {
		case 1:
			valorTotal = quantidade * 10;
			System.out.printf("Cachorro quente - R$%d", valorTotal);
			
		break;
		case 2:
			valorTotal = quantidade * 15;
			System.out.printf("X-Salada - R$%d", valorTotal);
		break;
		case 3:
			valorTotal = quantidade * 18;
			System.out.printf("X-Bacon - R$%d", valorTotal);
		break;
		case 4:
			valorTotal = quantidade * 12;
			System.out.printf("Bauru - R$%d", valorTotal);
		break;
		case 5:
			valorTotal = quantidade * 8;
			System.out.printf("Refrigerante - R$%d", valorTotal);
		break;
		case 6:
			valorTotal = quantidade * 13;
			System.out.printf("Suco de laranja - R$%d", valorTotal);
		break;
		default:
			System.out.println("Opção inválida!");
		
	}
		
		leia.close();
		
		
		
		
	}

}
