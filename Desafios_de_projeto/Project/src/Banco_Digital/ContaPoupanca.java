package Banco_Digital;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override

    public void imprimirExtrato(){
        System.out.println();
        System.out.println("-- Extrato conta poupanca --");
        super.imprimirInfosComuns();
        System.out.println();
    }

}
