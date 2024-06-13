package Iphone;

public class Iphone implements Reprodutor_Musical, Aparelho_Telefonico, Navegador_na_Internet{

    @Override
    public void pausar() {
        System.out.println("A música foi pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica + ".");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música.");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado.");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("FAzendo uma ligação ao número: " + numero + ".");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página com o URL: " + url + ".");
    }

    

}   
