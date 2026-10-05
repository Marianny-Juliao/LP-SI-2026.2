package br.ufpb.dcx.marianny.Agenda;

public class Contato {
    private String nome;
    private Endereco endereco;
    private String email;

    public Contato(String nome, Endereco endereco,String email) {
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
    }

    public Contato() {
        this("", new Endereco(),"");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getemail() {
        return email;
    }
    public void setemail(String email) {
        this.email = email;
    }

    public String toString() {
        return "Contato de nome "+this.nome+ " e "+this.endereco.toString()+" com e-email:" +this.email;
    }

}
