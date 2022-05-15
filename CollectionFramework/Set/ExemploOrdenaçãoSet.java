package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

/**
 * Dadas as seguintes informações sobre minhas series favoritas,
 * crie um conjunto e ordene este conjunto exibindo:
 * (nome - genero - tempo de episódio);
 * 
 * serie 1 = Nome: Got, genero: fantasia, tempoEpisodio: 60
 * serie 2 = Nome: Dark, genero: drama, tempoEpisodio: 60
 * serie 3 = Nome: That '70s show, genero comedia, tempoEpisodio: 25
 */

public class ExemploOrdenaçãoSet {
    public static void main(String[] args) {

        System.out.println("--\tOrden aleatoria\t--");
        Set<Serie> minhasSeries = new HashSet<>() {{
            add(new Serie( "Got", "fantasia", 60));
            add(new Serie( "Dark", "drama", 60));
            add(new Serie( "That '70s show", "comédia", 25));

        }};

        for (Serie serie : minhasSeries) {
            System.out.println(serie.getNome() + " - "
            + serie.getGenero() + " - " + serie.getTempoEpisódio());
        }
        System.out.println("\n*****************************\n");

        System.out.println("--\tOrden de inserção\t--");
        Set<Serie> minhasSeries1 = new LinkedHashSet<>() {{
            add(new Serie( "Got", "fantasia", 60));
            add(new Serie( "Dark", "drama", 60));
            add(new Serie( "That '70s show", "comédia", 25));

        }};

        for (Serie serie : minhasSeries1) {
            System.out.println(serie.getNome() + " - "
            + serie.getGenero() + " - " + serie.getTempoEpisódio());
        }
        System.out.println("\n*****************************\n");

        System.out.println("--\tOrden natural (TempoEpsisodio)\t--");
        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
        for (Serie serie : minhasSeries2) {
            System.out.println(serie.getNome() + " - "
            + serie.getGenero() + " - " + serie.getTempoEpisódio());
        }


        // pra você
        System.out.println("--\tOrden gênero\t--");

        System.out.println("--\tOrdem Tempo Episódio\t--");
    }   
}

class Serie implements Comparable<Serie>{
    private String nome;
    private String genero;
    private Integer tempoEpisodio;



    public Serie(String nome, String genero, Integer tempoEpisódio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisódio;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getTempoEpisódio() {
        return this.tempoEpisodio;
    }

    public void setTempoEpisódio(Integer tempoEpisódio) {
        this.tempoEpisodio = tempoEpisódio;
    }
    

    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", genero='" + getGenero() + "'" +
            ", tempoEpisódio='" + getTempoEpisódio() + "'" +
            "}";
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Serie)) {
            return false;
        }
        Serie serie = (Serie) o;
        return Objects.equals(nome, serie.nome) && Objects.equals(genero, serie.genero) && Objects.equals(tempoEpisodio, serie.tempoEpisodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEpisodio);
    }

    @Override
    public int compareTo(Serie serie) {
        // TODO Auto-generated method stub
        
        int tempoEpisodio = Integer.compare(this.getTempoEpisódio(), serie.getTempoEpisódio());
        if(tempoEpisodio != 0) return tempoEpisodio;
        return this.getGenero().compareTo(serie.getGenero());
    }

}