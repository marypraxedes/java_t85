package aula_exceptions;

import java.util.Scanner;

public class ChecaIdade {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int idade;
		
		try {
		System.out.println("\nDigite uma idade: ");
		idade = leia.nextInt();
		
		validarIdade(idade);
		}catch(DriverException error) {
			System.err.println("Erro: " + error);
			System.err.println("A Pessoa não está apta para dirigir!");
		}
	}

	public static void validarIdade(int idade) throws DriverException{
		
		if(idade >= 18)
			System.out.println("A Pessoa pode dirigir!!");
	
		else
			throw new DriverException();
	}

}
