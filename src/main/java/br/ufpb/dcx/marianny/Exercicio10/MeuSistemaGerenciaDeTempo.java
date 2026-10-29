package br.ufpb.dcx.marianny.Exercicio10;

import java.util.ArrayList;
import java.util.List;




public class MeuSistemaGerenciaDeTempo implements SistemaGerenciaDeTempo {
    private List<Tarefa> tarefas;


    public MeuSistemaGerenciaDeTempo() {
        this.tarefas = new ArrayList<>();
    }


    @Override
    public void cadastrarTarefa(String descricao, String categoria, int tempoEmMinutos) {

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
        return 0;
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

