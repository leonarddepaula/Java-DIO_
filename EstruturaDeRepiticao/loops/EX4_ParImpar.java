import java.util.Scanner;

/**
 * Faça um programa que peça N numeros inteiros,
 * Calcule e mostre a quantidade de números pares e
 * a quantidade de números impares.
 */

public class EX4_ParImpar {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int par = 0;
        int impar = 0;

        System.out.println("Digite quantos numeros voce quer usar: ");
        quantNumeros = scan.nextInt();

        int count = 0;
        do {
            System.out.println("Número: ");
            numero = scan.nextInt();
            
            if(numero % 2 == 0) par ++;
            else impar ++;
            
            count++;

        }while(count < quantNumeros);

        System.out.println("Total números par: " + par);
        System.out.println("Total números impar: "+ impar);
      
    }
}
