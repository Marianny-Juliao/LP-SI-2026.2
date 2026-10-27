package br.ufpb.dcx.marianny.Biblioteca;

import java.util.ArrayList;

public class MeuSistemaBiblioteca implements SistemaBiblioteca {
    private ArrayList<Livro> livros;

    public MeuSistemaBiblioteca (ArrayList<Livro> livros){
        this.livros= livros;
    }


    @Override
    public void cadastrarLivro(String titulo, String autor, String editora, String origem) {
        Livro novoLivro = new Livro(titulo, autor, editora, origem);
        this.livros.add(novoLivro);

    }

    @Override
    public ArrayList<Livro> livrosNacionais() {
        ArrayList <Livro>livrosNacionais= new ArrayList<>();
        for (Livro l:this.livros){
            if (l.getOrigem().equals("Nacional")){
                livrosNacionais.add(l);

            }
        }

        return livrosNacionais;
    }


}
