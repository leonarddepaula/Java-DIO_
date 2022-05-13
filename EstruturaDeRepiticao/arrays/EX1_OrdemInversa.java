/**
 * Crie um vetor de 6 numeros inteiros e mostre-os na ordem inversa.
 */


public class EX1_OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = { 1, 2, 3, 4, 5, 6};

        System.out.println("Vetor: ");
        int count = 0;
        while(count < (vetor.length)){
            System.out.print(vetor[count] + " ");
            
            count++;
        }

        System.out.println("\nVetor: ");
        for(int i = (vetor.length -1); i >= 0; i --){
            System.out.print(vetor[i] + " ");
        }
        
        
    }
}
