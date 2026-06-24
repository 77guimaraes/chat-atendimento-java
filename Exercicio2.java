import java.util.Scanner;

public class Exercicio2 {
    public static void main (String [] args){

        /*Exercício 2
        Faça um algoritmo para receber um número qualquer e imprimir na
        tela se o número é par ou ímpar, positivo ou negativo.
         */

        int numero;

        Scanner leitura = new Scanner(System.in);

        System.out.println("Informe um número: ");
        numero = leitura.nextInt();

        //
        if (numero % 2 == 0) {
            System.out.println("Número par");
        } else {
            System.out.println("Número ímpar");
        }

        if (numero >= 0){
            System.out.println("Número positivo");
        } else if (numero < 0){
            System.out.println("Numero negativo");
        }
        leitura.close();
    }
}
