package one.digitalinnovation.gof.Strategy;

public class Teste {
    public static void main(String[] args) {
        ComportamentoNormal normal = new ComportamentoNormal();
        ComportamentoDefensivo defensivo = new ComportamentoDefensivo();
        ComportamentoAgressivo agressivo = new ComportamentoAgressivo();
        
        Robo robo = new Robo();
        robo.setStrategy(normal);
        
        robo.mover();
    }
}
