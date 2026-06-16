package aula_03_condicionais;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String animal, tipo;
		
		
		System.out.println("O animal é vertebrado ou invertebrado? ");
		animal = leia.next();
		
		if (animal.equalsIgnoreCase("vertebrado")) {
		    System.out.println("Ave ou Mamifero?");
		    tipo = leia.next();

		    if (tipo.equalsIgnoreCase("ave")) {
		        System.out.println("Carnivoro ou Onivoro?");
		        String alimentacao = leia.next();

		        if (alimentacao.equalsIgnoreCase("carnivoro")) {
		            System.out.println("Águia");
		        } else {
		            System.out.println("Pomba");
		        }

		    }else {

		        System.out.println("Onivoro ou Herbivoro?");
		        String alimentacao = leia.next();

		        if (alimentacao.equalsIgnoreCase("onivoro")) {
		            System.out.println("Homem");
		        } else {
		            System.out.println("Vaca");
		        }
		    }
		} else {

		    System.out.println("Inseto ou Anelideo?");
		    tipo = leia.next();

		    if (tipo.equalsIgnoreCase("inseto")) {

		        System.out.println("Hematofago ou Herbivoro?");
		        String alimentacao = leia.next();

		        if (alimentacao.equalsIgnoreCase("hematofago")) {
		            System.out.println("Pulga");
		        } else {
		            System.out.println("Lagarta");
		        }

		    } else {

		        System.out.println("Hematofago ou Onivoro?");
		        String alimentacao = leia.next();

		        if (alimentacao.equalsIgnoreCase("hematofago")) {
		            System.out.println("Sanguessuga");
		        } else {
		            System.out.println("Minhoca");
		        }
		    }
		}  
		
		leia.close();

	}
	}
