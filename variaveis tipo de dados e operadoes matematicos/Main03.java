public class Main03 {
    public static void main(String[] args){

        //downcasting
        byte b1;
        short s1 = 1000;
        b1 = (byte) s1;

        //upcasting
        long l1;
        int i1 = 10;
        l1 = i1;

        System.out.println(b1);
        System.out.println(l1);
    }
}
