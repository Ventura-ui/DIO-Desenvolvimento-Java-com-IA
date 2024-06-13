package Iphone;

public class Teste {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.adicionarNovaAba();
        iphone.atender();
        iphone.atualizarPagina();
        iphone.exibirPagina("youtube.com");
        iphone.iniciarCorreioVoz();
        iphone.ligar("(22) 1111-3333");
        iphone.pausar();
        iphone.selecionarMusica("Música 01");
        iphone.tocar();
    }
}
