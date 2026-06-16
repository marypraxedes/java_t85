package aula_04_repeticoes;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int idade;
        int genero;
        int desenvolvedor;

        int backend = 0;
        int mulherCisTransFrontend = 0;
        int homemCisTransMobile40 = 0;
        int naoBinarioFullStack30 = 0;

        int totalPessoas = 0;
        int somaIdades = 0;

        String continuar = "S";

        while (continuar.equalsIgnoreCase("S")) {

            System.out.println("Idade:");
            idade = leia.nextInt();

            System.out.println("Identidade de Gênero:");
            System.out.println("1 - Mulher Cis");
            System.out.println("2 - Homem Cis");
            System.out.println("3 - Não Binário");
            System.out.println("4 - Mulher Trans");
            System.out.println("5 - Homem Trans");
            System.out.println("6 - Outros");
            System.out.println("Escolha uma opção:");
            genero = leia.nextInt();


            System.out.println("Pessoa Desenvolvedora:");
            System.out.println("1 - Backend");
            System.out.println("2 - Frontend");
            System.out.println("3 - Mobile");
            System.out.println("4 - FullStack");
            System.out.println("Escolha uma opção:");
            desenvolvedor = leia.nextInt();


            // Total de pessoas e soma das idades
            totalPessoas++;
            somaIdades += idade;


            // Backend
            if (desenvolvedor == 1) {
                backend++;
            }


            // Mulheres Cis e Trans desenvolvedoras Frontend
            if ((genero == 1 || genero == 4) && desenvolvedor == 2) {
                mulherCisTransFrontend++;
            }


            // Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos
            if ((genero == 2 || genero == 5) && desenvolvedor == 3 && idade > 40) {
                homemCisTransMobile40++;
            }


            // Não Binários desenvolvedores FullStack menores de 30 anos
            if (genero == 3 && desenvolvedor == 4 && idade < 30) {
                naoBinarioFullStack30++;
            }


            System.out.println("Deseja continuar (S/N):");
            continuar = leia.next();
        }


        double mediaIdade = (double) somaIdades / totalPessoas;


        System.out.println("\nTotal de pessoas desenvolvedoras Backend: " + backend);

        System.out.println("Total de Mulheres Cis e Trans desenvolvedoras Frontend: " + mulherCisTransFrontend);

        System.out.println("Total de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + homemCisTransMobile40);

        System.out.println("Total de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: " + naoBinarioFullStack30);

        System.out.println("O número total de pessoas que responderam à pesquisa: " + totalPessoas);

        System.out.printf("A média de idade das pessoas que responderam à pesquisa: %.2f", mediaIdade);


        leia.close();
    }
}