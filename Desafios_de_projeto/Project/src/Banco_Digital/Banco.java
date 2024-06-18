package Banco_Digital;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nome;
    private List<Conta> contas = new ArrayList<>();

    public void mostrarListaDeContas(){
        System.out.println();
        System.out.println("-- Lista de contas do " + getNome() + " --\n");
        for(Conta conta : contas){
            conta.imprimirExtrato();
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

}
