package aula_03_condicionais;

import java.util.Scanner;

public class ExercicioSwitch4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int codigo;
		
		float novoSaldo, novoSaldoSaque, deposito, saque;
		
		float saldo = 1000;
		
		System.out.println("***************************************");
		System.out.println("           CONTA BANCÁRIA              ");
		System.out.println("***************************************");
		System.out.println("                                       ");
		System.out.println("     1 - SALDO                         ");
		System.out.println("     2 - SAQUE                         ");
		System.out.println("     3 - DEPÓSITO                      ");
		System.out.println("                                       ");
		System.out.println("***************************************");
		
		System.out.println("Operação: ");
		codigo = leia.nextInt();
		
		switch(codigo) {
		case 1:
			System.out.printf("Operação - Saldo\n");
			System.out.printf("Saldo: R$%.2f", saldo);
		break;
		case 2:
			System.out.printf("Operação - Saque\n");
			System.out.printf("Valor: R$ ");
			saque = leia.nextInt();
			if (saque > saldo) {
		        System.out.println("Saldo insuficiente!");
		    } else {
		        novoSaldoSaque = saldo - saque;
		        System.out.printf("Saldo: R$%.2f", novoSaldoSaque);
		    }
		break;
		case 3:
			System.out.printf("Operação - Depósito\n");
			System.out.printf("Valor: R$ ");
			deposito = leia.nextInt();
			novoSaldo = saldo + deposito;
			System.out.printf("Saldo: R$%.2f", novoSaldo);
		break;
		default:
			System.out.println("Opção inválida!");
		leia.close();
	}
	}
}