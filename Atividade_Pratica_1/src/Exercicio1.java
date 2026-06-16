import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);
		
		String nome;
		
		int idade;
		
		boolean autorizacao;
		
		System.out.println("Digite o seu nome: ");
		nome = leia.next();
		
		System.out.println("Digite a sua idade: ");
		idade = leia.nextInt();
		
		System.out.println("Tem autorização dos responsáveis? true/false ");
		autorizacao = leia.nextBoolean();
		
		if(idade >= 18) {
			System.out.printf("\nAcesso liberado para %s ", nome);
				
		}else if(idade < 18 && autorizacao == true) {
			System.out.printf("\nAcesso liberado com autorização para %s", nome);
		
		}else {
			System.out.printf("\nAcesso negado para %s ", nome);
		}
		
		leia.close();

	}

}
