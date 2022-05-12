import java.util.Scanner;

/**
 * Faça um progrma que pça uma nota, entre zero e dez. Mostre uma mensagem,
 * caso o valor seja inválido e continue pedindo até o usario digitar
 *  o valor valido
 */

public class EX2_Nota {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Nota: ");
        nota = scan.nextInt();

        while(nota < 0 || nota > 10) {
            System.out.println("Nota Invalida! Digite Novamente: ");
            nota = scan.nextInt();
        }
    }
    
}
