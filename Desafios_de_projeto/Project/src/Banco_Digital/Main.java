package Banco_Digital;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Gabriel");
        Cliente cliente2 = new Cliente();
        cliente2.setNome("Maria");

        Conta cc = new ContaCorrente(cliente1);
        Conta cp = new ContaPoupanca(cliente2);
        
        cp.depositar(1000);
        cp.sacar(900);
        cc.transferir(cp, 25);

        Banco banco = new Banco();
        banco.setNome("Banco 01");
        banco.getContas().add(cc);
        banco.getContas().add(cp);

        banco.mostrarListaDeContas();
    }
}
