import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        /*
        Exercício 1
        Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na tela
        a soma entre A e B e mostre se a soma é menor que C.
         */

        int A;
        int B;
        int C;

        Scanner leitura = new Scanner(System.in);

        System.out.println("Escolha um valor para A: ");
        A = leitura.nextInt();

        System.out.println("\nEscolha um valor para B: ");
        B = leitura.nextInt();

        System.out.println("\nEscolha um valor para C: ");
        C = leitura.nextInt();

        int soma = A + B;

        System.out.println("A soma de A + B é igual à: " + soma);

        if (soma > C) {
            System.out.println("A soma é MAIOR (>) que C.");
        } else if (soma == C) {
            System.out.println("A soma é IGUAL (=) que C.");
        } else {
            System.out.println("A soma é MENOR (<) que C.");
        }
        leitura.close();
    }
}