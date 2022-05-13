import java.util.Random;

/**
 * Gere e imprima uma matrix M 4 x 4 com valores aleatorios entre 0-9.
 */

public class EX4_ArrayMultdimensional {
    public static void main(String[] args) {
        Random random = new Random();

        int [][] M = new int[4] [4];

        for(int i =0; i < M.length; i++){
            for(int j = 0; j < M[i].length; j++) {
                M[i][j] = random.nextInt(9);
            }
        }

        for (int[] linha : M) {
            for (int coluna : linha) {
                System.out.print(coluna + " ");
            }
            System.out.println();
        }
       
    }
}
