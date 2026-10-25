package br.ufpb.dcx.marianny.Som;

public class Cachorro implements EmissorDeSom {
    private String nome;

    public Cachorro(String nome) {
        this.nome = nome;
    }
    public String getNome(){
        return this.getNome();

    }
    public void setNome(String novoNome){
        this.nome = novoNome;
    }

    public String emitirSom() {
        return "au au";
    }
    public String toString (){
        return "O nome do cachorro é "+this.nome;
    }
}
