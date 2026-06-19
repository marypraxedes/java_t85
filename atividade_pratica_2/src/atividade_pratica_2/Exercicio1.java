package atividade_pratica_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		System.out.println("****************************");
		System.out.println("COLEÇÃO DE NÚMEROS E ANÁLISE");
		System.out.println("****************************\n");
		
		System.out.println("Digite o primeiro número: ");
		numeros.add(leia.nextInt());
		
		System.out.println("Digite o segundo número: ");
		numeros.add(leia.nextInt());
		
		System.out.println("Digite o terceiro número: ");
		numeros.add(leia.nextInt());
		
		System.out.println("Digite o quarto número: ");
		numeros.add(leia.nextInt());
		
		System.out.println("Digite o quinto número: ");
		numeros.add(leia.nextInt());
		
		
		for(int numero : numeros) {
			System.out.println(numero);	
		}
		
		System.out.printf("Soma: %d\n", somar(numeros));
		
		System.out.printf("Média: %d\n", media(numeros));
		
		System.out.printf("Maior valor: %d\n", maior(numeros));
		
		leia.close();
		}
		
	public static int somar(ArrayList<Integer> numeros) {
		
		return numeros.get(0) + numeros.get(1) + numeros.get(2) + numeros.get(3) + numeros.get(4);
	
	}
	
	public static int media(ArrayList<Integer> numeros) {
		
		return (numeros.get(0) + numeros.get(1) + numeros.get(2) + numeros.get(3) + numeros.get(4))/5; 
	
	}
	
	
	public static int maior(ArrayList<Integer> numeros) {
		int maior = numeros.get(0);
		
		for(int numero : numeros) {
			
			if(numero > maior) {
				maior = numero;
			}
			 
		}
	return maior;	
	}

	}
