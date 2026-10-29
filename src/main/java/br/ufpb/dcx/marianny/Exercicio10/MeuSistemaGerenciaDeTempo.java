package br.ufpb.dcx.marianny.Exercicio10;

import br.ufpb.dcx.marianny.Banco.Conta;

import java.util.ArrayList;
import java.util.List;




public class MeuSistemaGerenciaDeTempo implements SistemaGerenciaDeTempo {
    private List<Tarefa> tarefas;


    public MeuSistemaGerenciaDeTempo() {
        this.tarefas = new ArrayList<>();
    }


    @Override
    public void cadastrarTarefa(String descricao, String categoria, int tempoEmMinutos, int tempoCategoriaEmMinutos) {
        Tarefa tarefa = new Tarefa (descricao, categoria, tempoEmMinutos,tempoCategoriaEmMinutos);
        this.tarefas.add(tarefa);

    }

    public List<Tarefa> pesquisarTarefasDaCategoria(String categoria) {
        List<Tarefa> tarefasPesq = new ArrayList<>();
        for (Tarefa tarefa : this.tarefas) {
            if (tarefa.getCategoria().equals(categoria)) {
                tarefasPesq.add(tarefa);
            }
        }
        return tarefasPesq;
    }

    @Override
    public List<Tarefa> pesquisarTarefasQueDuraramMaisDe(int tempoEmMinutos) {
        return List.of();
    }

    @Override
    public int calcularTempoTotalDeTarefasDaCategoria(String categoriaTarefa) {
        int contTempoCategoria = 0;
        for (Tarefa c :this.tarefas){
            if (c.getCategoria().equals(categoriaTarefa)){
                contTempoCategoria += c.tempoCategoriaEmMinutos();
            }
        }
        return contTempoCategoria;
    }

    @Override
    public int calcularTempoTotalDeTarefasComDescricao(String descricaoTarefa) {
        return 0;
    }

    @Override
    public List<Tarefa> pesquisarTarefasPorDescricao(String descricao) {
        return List.of();
    }
}

