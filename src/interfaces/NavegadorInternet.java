package interfaces;

public interface NavegadorInternet {

    void abrirNavegador();

    void fecharNavegador();

    void pesquisar(String texto);

    void favoritaPagina(String url);

    void atualizarPagina(String url);


}
