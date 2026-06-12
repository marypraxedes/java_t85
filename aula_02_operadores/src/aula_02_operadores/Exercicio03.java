package aula_02_operadores;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float salarioBruto, adicionalNoturno, horasExtras, quantidadeExtra, descontos, salarioLiquido;
		
		System.out.println("--- SALÁRIO ---");
		
		System.out.printf("\nDigite o salário bruto: ");
		salarioBruto = leia.nextFloat();
		
		System.out.printf("\nDigite o valor do adicional noturno: ");
		adicionalNoturno = leia.nextFloat();
		
		System.out.printf("\nDigite o valor das horas extras: ");
		horasExtras = leia.nextFloat();
		
		System.out.printf("\nDigite a quantidade de horas extras: ");
		quantidadeExtra = leia.nextFloat();
		
		System.out.printf("\nDigite os descontos: ");
		descontos = leia.nextFloat();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * quantidadeExtra) - descontos;
				
		System.out.printf("\nSalário Líquido: R$ %.2f ", salarioLiquido);
		
		
		leia.close();

	}

}
