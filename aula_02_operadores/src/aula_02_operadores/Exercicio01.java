package aula_02_operadores;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float salario, abono, novoSalario;
		
		System.out.println(" --- CÁLCULO DE NOVO SALÁRIO ---");
		
		System.out.printf("\nDigite o salário: R$ ");
		salario = leia.nextFloat();
		
		System.out.printf("\nDigite o abono: R$ ");
		abono = leia.nextFloat();
		
		novoSalario = salario + abono;
		
		System.out.printf("\nNovo salário: R$ %.2f", novoSalario);
		
		
		
		
		leia.close();

	}

}
