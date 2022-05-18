package subsistema2.cep;

public class CepApi {

    private static CepApi instacia = new CepApi();

    public CepApi() {
        super();
    }

    public static CepApi getInstancia() {
        return instacia;
    }

    public String recuperarCidade(String cep){
        return "Rio Grande";
    }
    public String recuperarEstado(String cep){
        return "RS";

    }
}
