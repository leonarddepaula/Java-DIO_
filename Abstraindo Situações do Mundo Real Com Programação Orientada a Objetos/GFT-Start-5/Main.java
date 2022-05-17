import models.Endereco;
import models.Gerente;
import models.OperadorDeCaixa;
import models.Vendedor;

public class Main {
    public static void main(String[] args) {
        /**Endereco endereco = new Endereco();
        endereco.setRua("Rua Dos Abobados");

        System.out.println(endereco.getRua());*/

        Endereco endereco = 
            new Endereco("Rua funcionario", "Complemento endereço fucionario","bairro funciionario");
        System.out.println("---------");

        Vendedor vendedor =  new Vendedor();
        vendedor.setNome("Camila");
        vendedor.setDocumento("123.456.789-00");
        vendedor.setValorSalario(1000d);
        vendedor.setEndereco(endereco);
        vendedor.calculaBonificacao(5.0);
        System.out.println(vendedor);
        System.out.println("---------");

        OperadorDeCaixa operadorDeCaixa =
            new OperadorDeCaixa("camila Op Caixa", "789.456.123-00",2000d, endereco);
        System.out.println(operadorDeCaixa);
        System.out.println("---------");

        Gerente gerente = new Gerente();
        gerente.setNome("Camila Gerente");
        gerente.setDocumento("456.789.132-00");
        gerente.setEndereco(endereco);
        gerente.setHorasTrabalhadas(20);
        gerente.setValorHora(100d);
        
        gerente.calulaRemuneracao();
        gerente.calculaBonificacao(10.0);
        System.out.println(gerente);
    }

    
}
