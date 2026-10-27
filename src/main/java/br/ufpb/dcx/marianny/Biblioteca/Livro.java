package br.ufpb.dcx.marianny.Biblioteca;

public class Livro {
    private String titulo;
    private String autor;
    private String editora;
    private String origem;

    public Livro (String titulo, String autor, String editora, String origem){
        this.titulo= titulo;
        this.autor = autor;
        this.editora = editora;
        this.origem = origem;

    }
    public String getTitulo(){

        return this.titulo;
    }
    public String getAutor(){

        return this.autor;
    }

    public String getEditora(){

        return this.editora;
    }
    public String getOrigem(){

        return this.origem;
    }

    public void setTitulo(String novoTitulo){
        this.titulo = novoTitulo;

    }

    public void setAutor(String novoAutor){
        this.autor = novoAutor;

    }

    public void setEditora(String novaEditora){

        this.editora = novaEditora;
    }


    public String toString(){
        return "TÍTULO DO LIVRO: "+ this.titulo+ "AUTOR DO LIVRO: "+ this.autor+ "EDITORA DO LIVRO: "
                +this.editora+"DE ORIGEM: "+ this.origem;

    }
}
