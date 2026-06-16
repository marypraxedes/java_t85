import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);
		
		String nome;
		
		float nota;
		
		
		System.out.println("Digite o seu nome: ");
		nome = leia.next();
		
		System.out.println("Digite a sua nota final: ");
		nota = leia.nextFloat();
		
		if(nota >= 7) {
			System.out.printf("\nAluno: %s ", nome);
			System.out.printf("\nSituação: Aprovado");
				
		}else if(nota >= 5 && nota < 7) {
			System.out.printf("\nAluno: %s ", nome);
			System.out.printf("\nSituação: Recuperação");
		
		}else {
			System.out.printf("\nAluno: %s ", nome);
			System.out.printf("\nSituação: Reprovado");
		}
		
		leia.close();

	}

}
