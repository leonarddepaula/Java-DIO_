package models;
public abstract class FuncionarioPJ {
    private String nome;
    private String documento;
    private Endereco endereco;
    private Integer horasTrabalhadas;
    private Double ValorHora;
    private Double valorRemuneracao;

    public void calulaRemuneracao(){
        this.valorRemuneracao = this.horasTrabalhadas * this.ValorHora;
    }


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return this.documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Endereco getEndereco() {
        return this.endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Integer getHorasTrabalhadas() {
        return this.horasTrabalhadas;
    }

    public void setHorasTrabalhadas(Integer horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public Double getValorHora() {
        return this.ValorHora;
    }

    public void setValorHora(Double ValorHora) {
        this.ValorHora = ValorHora;
    }

    public Double getValorRemuneracao() {
        return this.valorRemuneracao;
    }

    public void setValorRemuneracao(Double valorRemuneracao) {
        this.valorRemuneracao = valorRemuneracao;
    }

   
    
}
