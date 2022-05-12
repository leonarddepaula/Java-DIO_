import java.util.Scanner;

/**
 * Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número
 * inteiro de 1 a 10. O usuario debe informar de qual numero ele deseja ver a tabuada.
 * A saída deve ser conforme a exemplo abaixo.
 */
public class EX5_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;

        System.out.println("Digite um numero: ");
        numero = scan.nextInt();

        for(int i=1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        
    }
}
