package exe01;

public class Main {
    
    public static void main(String[] args){

        //calculadora 
        System.out.println("Exercicio calculadora: ");
        Calculadora.soma(3, 6);
        Calculadora.subtracao(9, 1.8);
        Calculadora.multplicacao(7, 8);
        Calculadora.divisao(5, 2.5);

        //Mensagem

        System.out.println("Exercicio mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);
        
        // Emprestimo
        System.out.println("Exercicio Emprestimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);
     }

     
}
