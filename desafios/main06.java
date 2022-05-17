import java.util.Scanner;

//vinho 2
public class main06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        short t = scan.nextShort(), cnt = 0, x;
        for (short i = 0; i < 5; i++)
            if(scan.nextInt() == t)
                cnt++;
        System.out.println(cnt);
    }
}	
