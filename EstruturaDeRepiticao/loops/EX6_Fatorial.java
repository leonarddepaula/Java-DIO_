import java.util.Scanner;

/**
 * Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
 * ex.: 5 != 120
 */

public class EX6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int multiplicacao = 1;

        System.out.println("Digite Um Numero: ");
        numero = scan.nextInt();

        for(int i= numero; i >= 1;  i--){
            multiplicacao = multiplicacao * i;
            
        }
        System.out.println(multiplicacao);
    }
}
