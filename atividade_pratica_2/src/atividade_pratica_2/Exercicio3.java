package atividade_pratica_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		ArrayList<String> produtos = new ArrayList<String>();
		
		ArrayList<Integer> quantidades = new ArrayList<Integer>();
		
		
		int opcao, novaQuantidade, posicaoProduto;
		
		String opcaoProduto;
		
		do {
		System.out.println("\n****************************");
		System.out.println("    ESTOQUE DA CASAS BAÍA    ");
		System.out.println("****************************\n");
		
		System.out.println("1 - Adicionar um produto:");
		System.out.println("2 - Listar os produtos:");
		System.out.println("3 - Atualizar a quantidade de produtos: ");
		System.out.println("4 - Sair!");
		System.out.println("****************************\n");
		
		System.out.println("Digite a opção desejada: ");
		opcao = leia.nextInt();
		leia.nextLine();
		
		switch(opcao) {
		case 1:
			System.out.println("Digite o nome do produto: ");
			produtos.add(leia.nextLine());
		
			System.out.println("Digite a quantidade do produto: ");
			quantidades.add(leia.nextInt());
		
		break;
			
		case 2:
			for(int contador = 0; contador < produtos.size(); contador++) {
				System.out.println("Nome: " + produtos.get(contador));	
				System.out.println("Quantidade: " + quantidades.get(contador));
				System.out.println("****************************\n");
			}
		break;
		
		case 3: 
			System.out.println("Qual produto você quer atualizar: ");
			opcaoProduto = leia.nextLine();
			
			posicaoProduto = -1;
			
			for(int contador = 0; contador < produtos.size(); contador++) {
				if (opcaoProduto.equals(produtos.get(contador))) {
					posicaoProduto = contador;
					break;
				}
					
			} 
			
			if(posicaoProduto != -1) {
				System.out.printf("Digite a nova quantidade: ");
				novaQuantidade = leia.nextInt();
				
				quantidades.set(posicaoProduto, novaQuantidade);
			
				System.out.println("Quantidade atualizada!");
			}else {
				System.out.println("Produto não existe!");
			}
		break;
		
		case 4:
			System.out.println("Programa finalizado!");
			
		break;
		
		}
		
		}while(opcao != 4);
		
		leia.close();
			
	}

	}

