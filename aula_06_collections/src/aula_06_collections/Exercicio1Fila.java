package aula_06_collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio1Fila {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Queue<String> banco = new LinkedList<>();
		
		int opcao;
		
		do {
		System.out.println("************************");
		System.out.println("      FILA DE BANCO     ");
		System.out.println("************************");
		System.out.println("1 - Adicionar cliente na fila");
		System.out.println("2 - Listar todos os clientes");
		System.out.println("3 - Retirar cliente da fila");
		System.out.println("0 - Sair");
		System.out.println("************************");
		System.out.println("\nEntre com a opção desejada: ");
		
		opcao = leia.nextInt();
		leia.nextLine();
		
		switch(opcao) {
		case 1:
			System.out.println("Digite o nome: ");
			banco.add(leia.nextLine());	
			System.out.println("Fila: ");
		for(var cliente : banco) {
			System.out.println(cliente);
		}
		System.out.println("Cliente Adicionado!");
			
		break;
		
			
		case 2: 
			System.out.println("Lista de clientes na fila: ");
			for(var cliente : banco) {
				System.out.println(cliente);
			}
		break;
		
		case 3:
			if(banco.isEmpty()) {
				System.out.println("A fila está vazia!");
				
			}else {
			
			System.out.println("Fila:");
			banco.remove();
			for(var cliente : banco) {
				System.out.println(cliente);
			}
			System.out.println("O cliente foi chamado!");
			}
		break;
			
		case 0:
			System.out.println("Programa finalizado!");
			
		break;
			
		}
		
		}while (opcao != 0);
		
		
		leia.close();
		
		
	}

}
