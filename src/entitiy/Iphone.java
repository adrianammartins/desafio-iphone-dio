package entitiy;

import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

import java.util.List;

public class Iphone  implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {


    @Override
    public void fazerChamada(long numero) {
        System.out.println("Realiza Ligação para o número: " + numero);
    }

    @Override
    public void receberChamada() {

    }

    @Override
    public void enviarMensagem(long numero, String texto) {
        System.out.println("Envia mensagem para o número: " + numero);
        System.out.println("MSG:" + texto);
    }

    @Override
    public void receberMensagem() {

    }

    @Override
    public void correioDeVoz() {

    }

    @Override
    public void abrirNavegador() {

    }

    @Override
    public void fecharNavegador() {

    }

    @Override
    public void pesquisar(String texto) {
        System.out.println("Pesquis por: " + texto);
    }

    @Override
    public void favoritaPagina(String url) {
        System.out.println("Favoria página: " + url);

    }

    @Override
    public void atualizarPagina(String url) {
        System.out.println("Atualiza página: " + url);
    }

    @Override
    public void reproduzMusica() {

    }

    @Override
    public void pausarMusica() {

    }

    @Override
    public void avancarFaixa(int faixaAtual) {
        System.out.println("Passa para a faixa: " + faixaAtual+1);

    }

    @Override
    public void voltarFaixa(int faixaAtual) {
        System.out.println("Volta para a faixa: " + (faixaAtual-1));
    }

    public void ligar(){
        System.out.println("Ligando o telefone");
    }

    public void desligar(){
        System.out.println("Desligando o telefone");
    }

    public List<Aplicativo> menu() {
        return null;
    }
}
