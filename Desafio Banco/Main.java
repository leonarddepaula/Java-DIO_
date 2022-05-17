public class Main {
    public static void main(String[] args) {
        
        Conta cc = new ContaCorrente();
        cc.depositar(325);

        Conta poupanca = new ContaPoupanca();
        cc.transferir(115.09, poupanca);
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }
    
}
