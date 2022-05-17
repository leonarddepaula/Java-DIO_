package models;
public class Vendedor extends FuncionarioCLT implements CalculaBonificacao{ // filho de FuncionarioCLT
    private Double valorBonificacao;

    @Override
    public String toString() {
        return "Vendedor{" +
        "nome='" + nome +'\'' +
        ", documento='" + documento + '\'' +
        ", valorSalario=" + valorSalario +
        ", endereco=" + endereco.getBairro() +
        ",valorbonificacao=" + this.valorBonificacao +
            "}";
    }

    @Override
    public void calculaBonificacao(Double porcentagemBonificacao) {
        // TODO Auto-generated method stub
        this.valorBonificacao = this.valorSalario * (porcentagemBonificacao/100d);
    }
    
}
