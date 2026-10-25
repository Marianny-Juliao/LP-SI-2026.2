package br.ufpb.dcx.marianny.Som;

public class TestaCaixaDeSom {

    public static void main(String[] args) {
        CaixaDeSom caixa = new CaixaDeSom();
        caixa.adicionarEmissor(new Cachorro("Bob"));
        caixa.adicionarEmissor(new Tambor("P", "Giannini"));
        caixa.adicionarEmissor(new Cachorro("Lulu"));
        caixa.adicionarEmissor(new Tambor("M", "Luen"));
        caixa.adicionarEmissor(new Cachorro("Pipoca"));

        caixa.tocarTodosOsEmissores();
    }

}
