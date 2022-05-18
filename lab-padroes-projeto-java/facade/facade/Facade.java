package facade;


import subsistema2.cep.CepApi;
import substima1.crm.CrmService;

public class Facade {

    public void migrarCliente(String nome, String cep) {
       String cidade = CepApi.getInstancia().recuperarCidade(cep);
       String estado = CepApi.getInstancia().recuperarCidade(cep);
        
        CrmService.gravarCliente(nome, cep, cidade, estado);
    }

}
