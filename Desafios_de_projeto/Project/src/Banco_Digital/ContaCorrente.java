package Banco_Digital;

public class ContaCorrente extends Conta{

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override

    public void imprimirExtrato(){
        System.out.println();
        System.out.println("-- Extrato conta corrente --");
        super.imprimirInfosComuns();
        System.out.println();
    }

}
