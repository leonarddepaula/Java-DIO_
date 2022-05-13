import java.util.Random;

/**
 * Façã um programa que leia 20 numeros inteiros Aleatórios ( Entre 0 e 100)
 * armazene-os num vetor.
 * Ao final mostre os números e seus sucessores.
 */

public class EX3_NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] NumerosAleatorios = new int[20];

        for (int i = 0; i < NumerosAleatorios.length; i++) {
            int numero = random.nextInt(100);
            NumerosAleatorios[i] = numero;
        }
        System.out.print("\nNúmeros Aleatorios: ");
        for (int num : NumerosAleatorios) {
            System.out.print(num + " ");
        }

        System.out.print("\nSucecessor dos números: ");
        for (int num : NumerosAleatorios) {
            System.out.print((num + 1) + " ");
        }

        System.out.print("\nAntecessor dos números: ");
        for (int num : NumerosAleatorios) {
            System.out.print((num - 1) + " ");
        }
    }
}
