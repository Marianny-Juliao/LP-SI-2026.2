package br.ufpb.dcx.marianny.Exercicio10;

public class Tarefa {
    private String descricao;
    private String categoria;
    private int tempoTarefaEmMinutos;
    private int tempoCategoriaEmMinutos;

    public Tarefa(String descricao, String categoria, int tempoTarefaEmMinutos, int tempoCategoriaEmMinutos) {
        this.descricao = descricao;
        this.categoria = categoria;
        this.tempoTarefaEmMinutos = tempoTarefaEmMinutos;
        this.tempoCategoriaEmMinutos = tempoCategoriaEmMinutos;
    }
    public String  getDescricao(){

        return this.descricao;
    }
    public String  getCategoria(){
        return this.categoria;
    }

    public int  getTempoTarefaEmMinutos(){
        return this.tempoTarefaEmMinutos;
    }
    public int  getTempoCategoriaEmMinutos(){
        return this.tempoCategoriaEmMinutos;
    }

    public String toString() {
        return "Tarefa " + this.descricao + " com duração de " + this.tempoTarefaEmMinutos;

    }
}//… outros métodos da classe
