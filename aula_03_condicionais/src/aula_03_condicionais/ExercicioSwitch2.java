package aula_03_condicionais;

import java.util.Scanner;

public class ExercicioSwitch2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float salario = 0, novoSalario;
		
		int cargo;
				
		String nome;

		
		novoSalario = salario + (salario * 10 / 100);
		
				

		System.out.println("***************************************");
		System.out.println("           REAJUSTE SALARIAL           ");
		System.out.println("***************************************");
		System.out.println("                                       ");
		System.out.println("     1 - Gerente         - 10 %        ");
		System.out.println("     2 - Vendedor        - 7%          ");
		System.out.println("     3 - Supervisor      - 9%          ");
		System.out.println("     4 - Motorista       - 6%          ");
		System.out.println("     5 - Estoquista      - 5%          ");
		System.out.println("     6 - Técnico de TI   - 8%          ");
		System.out.println("                                       ");
		System.out.println("***************************************");	
		
		System.out.println("Nome do colaborador: ");
		nome = leia.next();
		
		System.out.println("Cargo: ");
		cargo = leia.nextInt();
		
		System.out.println("Salário atual:  ");
		salario = leia.nextFloat();
		
		switch(cargo) {
		case 1:
			novoSalario = salario + (salario * 10 / 100);
			System.out.printf("Nome do colaborador: %s\n", nome);
			System.out.printf("Cargo: %d\n", cargo);
			System.out.printf("Novo salário: R$%.2f", novoSalario);
		break;
		case 2:
			novoSalario = salario + (salario * 7 / 100);
			System.out.printf("Nome do colaborador: %s\n", nome);
			System.out.printf("Cargo: %d\n", cargo);
			System.out.printf("Novo salário: R$%.2f", novoSalario);
		break;
		case 3:
			novoSalario = salario + (salario * 9 / 100);
			System.out.printf("Nome do colaborador: %s\n", nome);
			System.out.printf("Cargo: %d\n", cargo);
			System.out.printf("Novo salário: R$%.2f", novoSalario);
		break;
		case 4:
			novoSalario = salario + (salario * 6 / 100);
			System.out.printf("Nome do colaborador: %s\n", nome);
			System.out.printf("Cargo: %d\n", cargo);
			System.out.printf("Novo salário: R$%.2f", novoSalario);
		break;
		case 5:
			novoSalario = salario + (salario * 5 / 100);
			System.out.printf("Nome do colaborador: %s\n", nome);
			System.out.printf("Cargo: %d\n", cargo);
			System.out.printf("Novo salário: R$%.2f", novoSalario);
		break;
		case 6:
			novoSalario = salario + (salario * 8 / 100);
			System.out.printf("Nome do colaborador: %s\n", nome);
			System.out.printf("Cargo: %d\n", cargo);
			System.out.printf("Novo salário: R$%.2f", novoSalario);
		break;
		default:
			System.out.println("Opção inválida!");
		
	}
		
		leia.close();
		

	}

}
