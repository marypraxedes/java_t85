import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float numero1, numero2, soma, subtracao, divisao, multiplicacao;
		
		int codigo;
		
		System.out.println("Digite o primeiro número: ");
		numero1 = leia.nextFloat();
		
		System.out.println("Digite o segundo número: ");
		numero2 = leia.nextFloat();
		
		System.out.println("***************************************");
		System.out.println("           CALCULADORA SIMPLES         ");
		System.out.println("***************************************");
		System.out.println("                                       ");
		System.out.println("     1 - SOMA                          ");
		System.out.println("     2 - SUBTRAÇÃO                     ");
		System.out.println("     3 - MULTIPLICAÇÃO                 ");
		System.out.println("     4 - DIVISÃO                       ");
		System.out.println("                                       ");
		System.out.println("***************************************");
		
		System.out.println("Operação: ");
		codigo = leia.nextInt();
		
		soma = numero1 + numero2;
		
		subtracao = numero1 - numero2;
		
		divisao = numero1 / numero2;
		
		multiplicacao = numero1 * numero2;
		
		switch(codigo) {
		case 1:
			System.out.printf("%.2f + %.2f = %.2f", numero1, numero2, soma);
		break;
		case 2:
			System.out.printf("%.2f - %.2f = %.2f", numero1, numero2, subtracao);
		break;
		case 3:
			System.out.printf("%.2f X %.2f = %.2f", numero1, numero2, multiplicacao);
		break;
		case 4:
			if(numero2 == 0) {
				System.out.println("Indefinido!");
			}else {
				System.out.printf("%.2f / %.2f = %.2f", numero1, numero2, divisao);	
			}
		break;
		default:
			System.out.println("Opção inválida!");
		}
		leia.close();
	}

	}

