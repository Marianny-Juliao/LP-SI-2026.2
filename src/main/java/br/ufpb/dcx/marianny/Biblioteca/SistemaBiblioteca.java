package br.ufpb.dcx.marianny.Biblioteca;

import java.util.ArrayList;

public interface SistemaBiblioteca {


    public void cadastrarLivro(String titulo, String autor, String editora, String origem);

    public ArrayList<Livro> livrosNacionais();

}