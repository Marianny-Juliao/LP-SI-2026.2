package br.ufpb.dcx.marianny.Exercicio10;

import java.util.List;

public interface SistemaGerenciaDeTempo {
    public void cadastrarTarefa(String descricao, String categoria, int tempoEmMinutos, int tempoCategoriaEmMinutos);
    public List<Tarefa> pesquisarTarefasDaCategoria(String categoria);
    public List<Tarefa> pesquisarTarefasQueDuraramMaisDe(int tempoEmMinutos);
    public int calcularTempoTotalDeTarefasDaCategoria(String categoriaTarefa);
    public int calcularTempoTotalDeTarefasComDescricao(String descricaoTarefa);
    public List<Tarefa> pesquisarTarefasPorDescricao(String descricao);

}
