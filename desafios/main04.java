import java.util.Scanner;
//poligonos
public class main04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String N = scan.nextLine();
        String L = scan.nextLine();
        String[] split = N.split(" ");
        String[] splitl = L.split(" ");
    //TODO: Complete os espaços em branco com uma possível solução para o desafio
        int P = Integer.parseInt(N) * Integer.parseInt(L);
        
        System.out.println(P);
      }
}
