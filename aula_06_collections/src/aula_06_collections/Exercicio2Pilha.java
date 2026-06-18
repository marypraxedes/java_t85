package aula_06_collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Exercicio2Pilha {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Deque<String> livros = new ArrayDeque<String>();
		
		
		int opcao;
		
		do {
		System.out.println("************************");
		System.out.println("      FILA DE BANCO     ");
		System.out.println("************************");
		System.out.println("1 - Adicionar livro na pilha");
		System.out.println("2 - Listar todos os livros");
		System.out.println("3 - Retirar livro da pilha");
		System.out.println("0 - Sair");
		System.out.println("************************");
		System.out.println("\nEntre com a opção desejada: ");
		
		opcao = leia.nextInt();
		leia.nextLine();
		
		switch(opcao) {
		case 1:
			System.out.println("Digite o nome do livro: ");
			livros.push(leia.nextLine());	
			System.out.println("Pilha: ");
		for(var livro : livros) {
			System.out.println(livro);
		}
		System.out.println("Livro Adicionado!");
			
		break;
		
			
		case 2: 
			System.out.println("Lista de livros na pilha: ");
			for(var livro : livros) {
				System.out.println(livro);
			}
		break;
		
		case 3:
			if(livros.isEmpty()) {
				System.out.println("A pilha está vazia!");
				
			}else {
			
			System.out.println("Pilha:");
			livros.pop();
			for(var livro : livros) {
				System.out.println(livro);
			}
			System.out.println("Um livro foi retirado da pilha!");
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
