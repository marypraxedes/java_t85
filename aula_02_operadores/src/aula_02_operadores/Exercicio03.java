package aula_02_operadores;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
		
		System.out.println("--- SALÁRIO ---");
		
		System.out.printf("\nDigite o salário bruto: ");
		salarioBruto = leia.nextFloat();
		
		System.out.printf("\nDigite o adicional noturno: ");
		adicionalNoturno = leia.nextFloat();
		
		System.out.printf("\nDigite as horas extras: ");
		horasExtras = leia.nextFloat();
		
		System.out.printf("\nDigite os descontos: ");
		descontos = leia.nextFloat();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
				
		System.out.printf("\nSalário Líquido: R$ %.2f ", salarioLiquido);
		
		
		leia.close();

	}

}
