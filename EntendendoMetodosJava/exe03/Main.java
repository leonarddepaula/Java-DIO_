package exe03;

public class Main {

    public static void main(String[] args) {

        //Retorno
        System.out.println("Exercicio retornos");

        double areaQuadrado =  Quadrilatero.area(3);
        System.out.println("Area do quadrado: " + areaQuadrado);

        double areRetangulo =Quadrilatero.area(5, 5);
        System.out.println("Area do retangulo: "+ areRetangulo);

        double areaTrapezio = Quadrilatero.area(7, 8, 9);
        System.out.println("Area do trapezio: " + areaTrapezio);
    }
    
}
