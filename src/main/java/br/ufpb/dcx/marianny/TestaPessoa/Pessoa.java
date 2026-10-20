package br.ufpb.dcx.marianny.TestaPessoa;

public class Pessoa {

    private String nome;
    private int idade;

    public Pessoa (String nome, int idade){
        this.nome = nome;
        this.idade = idade;

    }
    public String getNome(){

        return this.nome;
    }

    public int getIdade(){

        return this.idade;
    }
    public void setNome(String novoNome){

        this.nome = novoNome;
    }
    public void setIdade(int novaIdade){

        this.idade = novaIdade;
    }
    public String toString(){

        return this.nome + " tem " + this.idade + " anos";
    }

   public boolean ehDeMaior (){
        return this.idade>= 18;

}






}



