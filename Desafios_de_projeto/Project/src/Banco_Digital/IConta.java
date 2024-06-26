package Banco_Digital;

public interface IConta {

    public void sacar(double valor);

    public void depositar(double valor);

    public void transferir(Conta contaDestino, double valor);

    public void imprimirExtrato();

}
