package aula_04_repeticoes;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int numero;
        int soma = 0;
        int quantidade = 0;

        do {

            System.out.println("Digite um número:");
            numero = leia.nextInt();

            if (numero % 3 == 0 && numero != 0) {
                soma += numero;
                quantidade++;
            }

        } while (numero != 0);


        double media = (double) soma / quantidade;

        System.out.println("A média de todos os números múltiplos de 3 é: " + media);

        leia.close();
    }
}