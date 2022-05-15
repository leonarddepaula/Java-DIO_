package Map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;



public class ExemploMap {
    public static void main(String[] args) {
        
        System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumos: ");
        Map<String, Double> carrosPopulares = new HashMap<>(){{
            put("Gol", 14.4);
            put("Uno", 15.6);
            put("Mobi", 16.1);
            put("hb20", 14.5);
            put("Kwid", 15.6);

        }};
        System.out.println(carrosPopulares.toString());

        System.out.println("Substitua o consumo do gol por 15,2 km/l: ");
        carrosPopulares.put("Gol", 15.2);
        System.out.println(carrosPopulares.toString());

        System.out.println("Confira se o modelo tucson esta no dincionario: " +  carrosPopulares.containsKey("tucson"));

        System.out.println("Exiba o consumo do Uno: " + carrosPopulares.get("Uno"));

        System.out.println("Exiba o terceiro modelo adicionado:IMPOSSIVEL! ");

        System.out.println("Exiba os modelos: ");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);


        System.out.println("Exiba o consumo dos carros: ");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);


        System.out.println("Exiba o modelo mais economico e seu consumo: ");
        Double ConsumoMaisEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries= carrosPopulares.entrySet();
        String modeloMaisEficiente = "";

        for (Map.Entry<String, Double> entry : entries){
            if(entry.getValue().equals(ConsumoMaisEficiente)){
                modeloMaisEficiente = entry.getKey();
                System.out.println("Modelo mais eficiente: " + modeloMaisEficiente + " - " + ConsumoMaisEficiente);
            }
        }

        System.out.println("Exiba o modelo menos economico e seu consumo: ");
        Double ConsumoMenosEficiente = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente = "";
        for(Map.Entry<String, Double> entry: carrosPopulares.entrySet()){
            if(entry.getValue().equals(ConsumoMenosEficiente)){
                modeloMenosEficiente = entry.getKey();
                System.out.println("Modelo menos eficiente: " + modeloMenosEficiente + " - " + ConsumoMenosEficiente);

            }
        }

        
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            soma += iterator.next();
        System.out.println("Exiba a soma dos consumos: " + soma);    
        }
        
        System.out.println("Exiba a media de consumo deste dicionário de carro: " + (soma/carrosPopulares.size()));

        System.out.println("Remova os modelos com o consumo igual 15.6 km/l: ");
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        
        while(iterator1.hasNext()){
            if(iterator1.next().equals(15.6))iterator1.remove();  
        }
        System.out.println(carrosPopulares);

        System.out.println("Imprima todos os carros na ordem que foram informados: ");
        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>(){{
            put("Gol", 14.4);
            put("Uno", 15.6);
            put("Mobi", 16.1);
            put("hb20", 14.5);
            put("Kwid", 15.6);

        }};
        System.out.println(carrosPopulares1.toString());

        System.out.println("exiba o dicionario ordenado pelo modelo: ");
        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
        System.out.println(carrosPopulares2.toString());

        System.out.println("Apague o dicionario de carros: ");
        carrosPopulares.clear();

        System.out.println("confira se o dicionario está vazio: " + carrosPopulares.isEmpty());

    }
}
