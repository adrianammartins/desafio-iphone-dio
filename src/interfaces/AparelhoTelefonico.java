package interfaces;

public interface AparelhoTelefonico {

    void fazerChamada(long numero);

    void receberChamada();

    void enviarMensagem(long numero, String texto);

    void receberMensagem();

    void correioDeVoz();

}
