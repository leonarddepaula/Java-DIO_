package Lists;
/**
 *  Alguns dos metódos da interface list
 *  
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class ExemploList{
    public static void main(String[] args) {
       
    //    List notas = new ArrayList<>();
    //    List<Double> notas = new ArrayList<>();

        // da uma lista com 7 notas de um aluno faça:
          ArrayList<Double> notas = new ArrayList<Double>(); 
          notas.add(7.0);
          notas.add(8.5);
          notas.add(9.3);
          notas.add(5.0);
          notas.add(7.0);
          notas.add(0.0);
          notas.add(3.6);

          System.out.println(notas.toString()); // Exibe todas as notas.
          System.out.println("Exibir a posição da nota 5.0: " + notas.indexOf(3d)); // exibou  a nota 5 na posição 3 do array.

          System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
          notas.add(4, 8d);// adicio 8.0 na posição  4 do array.
          System.out.println(notas);

          System.out.println("Substitua a nota 5.0  pela nota 6.0: " + notas.contains(5d));
          notas.set(notas.indexOf(5d), 6.0);
          System.out.print(notas);

          System.out.println("Confira se a nota 5.0 está na lista: "  + notas.contains(5d));

          System.out.println("Exiba todas as notas na ordem em que foram informados: ");
          for(Double nota: notas) System.out.println(nota);

          System.out.println("Exiba a terceira nota adiciona: " + notas.get(2));
          System.out.println(notas.toString());

          System.out.println("Exiba a menor nota: " + Collections.min(notas));
          System.out.println("Exiba a menor nota: " + Collections.max(notas));

          System.out.println("Exiba a soma dos valores: ");
          Iterator<Double> iterator = notas.iterator();
          Double soma = 0d;
          while(iterator.hasNext()){
              Double next = iterator.next();
              soma += next;
          }
          System.out.println("Exiba a soma dos valores: " + soma);  


          System.out.println("Exiba a méudia das notas: " + soma / notas.size()); 

          System.out.println("Remova a nota  0: ");
          notas.remove(0d); // od significa o objeto se nao tiver 'd' remorevira o indice 0.
          System.out.println(notas); 


          System.out.println("Remova a nota da posição  0: ");
          notas.remove(0); // od significa o objeto se nao tiver 'd' remorevira o indice 0.
          System.out.println(notas); 

          System.out.println("Remova as notas menores que 7 e exiba a lista: ");
          Iterator<Double> iterator1 = notas.iterator();
          while(iterator1.hasNext()){
              Double next = iterator1.next();
              if(next < 7) iterator1.remove(); 
          }
          System.out.println(notas);

          System.out.println("Apague toda Lista");
          notas.clear();
          System.out.println(notas);

          System.out.println("Confira se a lista está vazia: " + notas.isEmpty());
    }
}