package models;
public class OperadorDeCaixa extends FuncionarioCLT {

   

   
    public OperadorDeCaixa(String nome, String documento, double valorSalario, Endereco endereco) {
        super(nome, documento, valorSalario, endereco);
    }

    @Override
    public String toString() {
        return "OperadorDeCaixa{" +
        "nome='" + nome +'\'' +
        ", documento='" + documento + '\'' +
        ", valorSalario=" + valorSalario +
        ", endereco=" + endereco.getBairro() +
            "}";
    }
    
}
