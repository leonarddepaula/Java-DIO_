

public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static  int SEQUENCIAL = 1;
    
    protected int agencia;
    protected int numero;
    protected double saldo;

    

    public Conta() {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }

   

    public int getAgencia() {
        return this.agencia;
    }

    public int getNumero() {
        return this.numero;
    }

    public double getSaldo() {
        return this.saldo;
    }

    @Override
    public void sacar(double valor) {
        // TODO Auto-generated method stub

        saldo -= valor;
        
    }

    @Override
    public void depositar(double valor) {
        // TODO Auto-generated method stub

        saldo += valor;
        
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        // TODO Auto-generated method stub

        this.sacar(valor);
        contaDestino.depositar(valor);
        
    }
    protected void imprimirInfosComuns() {
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Num Conta: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
}
