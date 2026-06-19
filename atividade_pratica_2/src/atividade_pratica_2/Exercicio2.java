package atividade_pratica_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		ArrayList<String> alunos = new ArrayList<String>();
		
		ArrayList<Integer> idades = new ArrayList<Integer>();
		
		ArrayList<Integer> notas = new ArrayList<Integer>();
		
		int opcao;
		
		do {
		System.out.println("\n****************************");
		System.out.println("     CADASTRO DE ALUNOS     ");
		System.out.println("****************************\n");
		
		System.out.println("1 - Adicionar um aluno:");
		System.out.println("2 - Listar os alunos:");
		System.out.println("3 - Média geral das notas: ");
		System.out.println("4 - Sair!");
		System.out.println("****************************\n");
		
		System.out.println("Digite a opção desejada: ");
		opcao = leia.nextInt();
		leia.nextLine();
			
		switch(opcao) {
		case 1:
			System.out.println("Digite o nome do aluno: ");
			alunos.add(leia.next());
		
			System.out.println("Digite a idade do aluno: ");
			idades.add(leia.nextInt());
		
			System.out.println("Digite a nota final do aluno: ");
			notas.add(leia.nextInt());
		break;
			
		case 2:
			for(int contador = 0; contador < alunos.size(); contador++) {
				System.out.println("Nome: " + alunos.get(contador));	
				System.out.println("Idade: " + idades.get(contador));
				System.out.println("Nota: " + notas.get(contador));
				System.out.println("****************************\n");
			}
		break;
		
		case 3: 
			System.out.printf("Média geral das notas: %.2f", media(notas));
			
		break;
		
		case 4:
			System.out.println("Programa finalizado!");
			
		break;
		
		}
		
		}while (opcao != 4);

		leia.close();
	}
	

	public static double media(ArrayList<Integer> notas) {
		double soma = 0;
		
		for(int nota : notas) {
			soma = soma + nota;	
		}
		return soma/notas.size();
		
	}
	
	
}
