package Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Dadas as seguintes informações sobre meuis livros favoritos e seus autores,
 * crie um dicionario e ordene este dicionario:
 * exibindo (nome Autor - Nome livro)
 * 
 * Autor = Hawking, Stephen - Livro = nome: Uma Breve História do Tempo. páginas: 256
 * Autor = Duhingg, Charles - Livro = nome: O poder do Hábito, paginas: 408
 * Autor = Harari, Yuval Noah - Livro = nome: 21 Lições Para o Século 21, paginas: 432
 */


public class ExemploOrdenacaoMap {
    public static void main(String[] args) {

        System.out.println("--\tOrden aleatória\t--"); 
        
        Map<String, Livro> meusLivros = new HashMap<>(){{
            put("LIVRO: ", new Livro(" Uma Breve História do Tempo.", 256,"Hawking, Stephen" ));
            put("LIVRO: ", new Livro(" O poder do Hábito, paginas.", 408,"Duhingg, Charles" ));
            put("LIVRO: ", new Livro(" 21 Lições Para o Século 21.", 432,"Harari, Yuval Noah" ));
        }};  
        for(Map.Entry<String, Livro> livro : meusLivros.entrySet()) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }
             
        System.out.println("\n**********************\n");

        System.out.println("--\tOrden Inserção\t--");
        Map<String, Livro> meusLivros1 = new LinkedHashMap<>(){{
            put("LIVRO: ", new Livro(" Uma Breve História do Tempo.", 256,"Hawking, Stephen" ));
            put("LIVRO: ", new Livro(" O poder do Hábito, paginas.", 408,"Duhingg, Charles" ));
            put("LIVRO: ", new Livro(" 21 Lições Para o Século 21.", 432,"Harari, Yuval Noah" ));
        }};  
        for (Map.Entry<String, Livro> livro : meusLivros1.entrySet()) 
            System.out.println(livro.getKey()+ " - " +livro.getValue().getNome());
        System.out.println("\n**********************\n");
        
        System.out.println("--\tOrden alfabética autores\t--");   

        System.out.println("--\tOrden alfabética nome dos livros\t--");   

        System.out.println("--\tOrden número de páginas\t--");   
    }
}

class Livro {
    private String nome;
    private Integer paginas;
    private String Autor;

    public Livro(String nome, Integer paginas, String Autor) {
        this.nome = nome;
        this.paginas = paginas;
        this.Autor = Autor;
    }
    

    public String getNome() {
        return this.nome;
    }

    

    public Integer getPaginas() {
        return this.paginas;
    }

    

    public String getAutor() {
        return this.Autor;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Livro)) {
            return false;
        }
        Livro livro = (Livro) o;
        return Objects.equals(nome, livro.nome) && Objects.equals(paginas, livro.paginas) && Objects.equals(Autor, livro.Autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas, Autor);
    }


    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", paginas='" + getPaginas() + "'" +
            ", Autor='" + getAutor() + "'" +
            "}";
    }
}

    

   

