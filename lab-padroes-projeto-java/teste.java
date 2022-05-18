import facade.Facade;

public class teste {
    public static void main(String[] args) {

        //Singleton

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);
        holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);

        //Strategy

        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal =  new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();
        
        Robo  robo = new Robo();
        robo.setComportamento(normal);

        robo.mover();
        robo.mover();

        robo.setComportamento(agressivo);
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();

        robo.setComportamento(agressivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();

        //facade

        Facade facade = new Facade();
        facade.migrarCliente("venilton", "45656-89");
    }
}
