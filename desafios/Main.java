import java.util.Scanner;
//cha
public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String T = scan.nextLine();
    String respostasCompetidores = scan.nextLine();

    String[] respostasCompetidoresSplit =  respostasCompetidores.split(" ");
    // TODO: Complete o 1código com uma possível solução para o problema.

    int count = 0;
    for (int i = 0; i < 5; i++) {
      if (respostasCompetidoresSplit[i].equals(T)){
        count++;
      }
        
        
    System.out.println(respostasCompetidoresSplit[i]);
    }
    

    System.out.println("cont" + count);

  }
}